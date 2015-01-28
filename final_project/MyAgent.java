import java.util.HashSet;
import java.util.Random;

public class MyAgent extends Agent {
    Random r;

    /**
     * Constructs a new agent, giving it the game and telling it whether it is Red or Yellow.
     * 
     * @param game The game the agent will be playing.
     * @param iAmRed True if the agent is Red, False if the agent is Yellow.
     */
    public MyAgent(Connect4Game game, boolean iAmRed) {
        super(game, iAmRed);
        r=new Random();
    }

    /**
     * The move method is run every time it is this agent's turn in the game. You may assume that
     * when move() is called, the game has at least one open slot for a token, and the game has not
     * already been won.
     * 
     * By the end of the move method, the agent should have placed one token into the game at some
     * point.
     * 
     * After the move() method is called, the game engine will check to make sure the move was
     * valid. A move might be invalid if:
     * - No token was place into the game.
     * - More than one token was placed into the game.
     * - A previous token was removed from the game.
     * - The color of a previous token was changed.
     * - There are empty spaces below where the token was placed.
     * 
     * If an invalid move is made, the game engine will announce it and the game will be ended.
     * 
     */
    public void move() {
    	if (ICanWin() > -1) {
    		// If I have the chance to win, then I would make the move right now.
    		// System.out.println("I can win!" + ICanWin());
    		moveOnColumn(ICanWin());
    	} else if (TheyCanWin(0, 0, false) > -1) {
    		// If I cannot win in this turn, I would block the opponent from wining.
    		// System.out.println("They can win!" + TheyCanWin(0, 0));
    		moveOnColumn(TheyCanWin(0, 0, false));
    	} else {
    		// If neither me nor the opponent have the chance to win, then I just make a brilliant move.
    		moveOnColumn(brilliantMove());
    	}
    }

    /**
     * Drops a token into a particular column so that it will fall to the bottom of the column.
     * If the column is already full, nothing will change.
     * 
     * @param columnNumber The column into which to drop the token.
     */
    public void moveOnColumn(int columnNumber) {
    	 // Find the top empty slot in the column
        int lowestEmptySlotIndex = getLowestEmptyIndex(myGame.getColumn(columnNumber));  
        // If the column is full, lowestEmptySlot will be -1
        if (lowestEmptySlotIndex > -1) {
        	// If the column is not full
        	// Get the slot in this column at this index
            Connect4Slot lowestEmptySlot = myGame.getColumn(columnNumber).getSlot(lowestEmptySlotIndex);  
            if (iAmRed) {
            	// If the current agent is the Red player, place a red token into the empty slot
                lowestEmptySlot.addRed(); 
            } else {
            	// If the current agent is the Yellow player (not the Red player), place a yellow token into the empty slot
                lowestEmptySlot.addYellow();
            }
        }
    }

    /**
     * Returns the index of the top empty slot in a particular column, or -1 if the column is already full.
     * 
     * @param column The column to check.
     * 
     * @return the index of the top empty slot in a particular column
     */
    public int getLowestEmptyIndex(Connect4Column column) {
        int lowestEmptySlot = -1;
        for  (int i = 0; i < column.getRowCount(); i++) {
            if (!column.getSlot(i).getIsFilled()) {
                lowestEmptySlot = i;
            }
        }
        return lowestEmptySlot;
    }
    
    /**
     * Another simplified getLowestEmptyIndex.
     * Returns the index of the top empty slot in a particular column, or -1 if the column is already full.
     * 
     * @param column The column to check.
     * 
     * @return the index of the top empty slot in a particular column
     */
    public int getLowestEmptyIndex(int columnIndex) {
        Connect4Column column = myGame.getColumn(columnIndex);
        return getLowestEmptyIndex(column);
    }

    /**
     * Returns a random valid move. If your agent doesn't know what to do, making a random move
     * can allow the game to go on anyway.
     * 
     * @return return the index of the column in which a token would be placed into
     */
    public int randomMove() {
        int i = r.nextInt(myGame.getColumnCount());
        while (getLowestEmptyIndex(myGame.getColumn(i)) == -1) {
            i = r.nextInt(myGame.getColumnCount());
        }
        return i;
    }
    
    /**
     * BrilliantMove will find a column, so that if My Agent place a token in this column, the token
     * would be part of a relatively long route (tokens with the same color).
     * 
     * @return return the index of the column in which a token would be placed into
     */
    public int brilliantMove()
    {
    	int longest = 0; // The current longest route. This move could make it one slot longer.
    	int bestMove = randomMove(); // So if there is no better move, the agent would make a random move.
    	int count = 0; // How many longest routes could this move formulate.
    	int column = myGame.getColumnCount();
    	HashSet<Integer> dangerous = dangerousMove(); //Includes moves (column indexes) that would make the opponent win.
    	for (int i = 0; i < column; i++) {
    		if (getLowestEmptyIndex(i) > -1 && !dangerous.contains(i)) {
    			//If this move is valid and this move won't make the opponent win.
    			Integer[] current = longestRoute(i, iAmRed, 0);
    			if (current[0] > longest) {
    				// If the longest route that is linked to current column is longer, update the longest
    				// and make the current column index the bestMove.
    				longest = current[0];
    				count = current[1];
    				bestMove = i;
    			} else if (current[0] == longest && current[1] > count) {
    				// If the longest route that is linked to current column is as longer as the former one
    				// but it has more routes with the same length, update the routes count and bestMove.
    				count = current[1];
    				bestMove = i;
    			} else if (current[0] == longest && current[1] == count && Math.abs(column / 2 - i) < Math.abs(column / 2 - bestMove)) {
    				// If the length and count are same, MyAgent would prefer the column which is closer to the middle
    				bestMove = i;
    			}
    		}
    	}
    	
    	//if current move (which is random selected) would make the opponent win, try another random one
    	int loop = 0;
    	while (loop < 20 && (dangerous.contains(bestMove) || TheyCanWin(0, 1, false) == bestMove)) {
    		// System.out.println("avoided dangerous move!" + bestMove);
    		bestMove = randomMove();
    		loop++;
    	}
		// System.out.println("Brilliant!" + bestMove);
        return bestMove;
    }

    /**
     * Placing a token in some of the columns could make the opponent win (by placing a token above in it). 
     * MyAgent will collect all the dangerous columns and won't place any token in them.
     * 
     * @return a set of column indexes.
     */
    public HashSet<Integer> dangerousMove() {
    	HashSet<Integer> dangerous = new HashSet<Integer>();
    	for (int i = 0; i < myGame.getColumnCount(); i++) {
    		// Loop the starting column, so that it will check all the columns instead of only the first one.
	    	if (TheyCanWin(i, 1, false) > -1) {
	    		// If the opponent can win, when the lowest empty slot of the column is one slot higher, then it's dangerous.
	    		dangerous.add(TheyCanWin(i, 1, false));
	    	}
    	}
    	return dangerous;
    }
    
    /**
     * Returns the column that would allow the agent to win.
     * 
     * You might want your agent to check to see if it has a winning move available to it so that
     * it can go ahead and make that move. Implement this method to return what column would
     * allow the agent to win.
     * 
     * @return the column index that would allow the agent to win.
     */
    public int ICanWin() {
    	return anyoneCanWin(iAmRed, 0, 0, false);
    }


    /**
     * Returns the column that would allow the opponent to win.
     * 
     * You might want your agent to check to see if the opponent would have any winning moves
     * available so your agent can block them. Implement this method to return what column should
     * be blocked to prevent the opponent from winning.
     * 
     * @param colDef the starting column. The method would check from this column to the rightmost column
     * @param rowDef 1 if I want to make the lowest empty index be one slot higher, 0 otherwise
     * 
     * @return the column index that would allow the opponent to win
     */
    public int TheyCanWin(int colDef, int rowDef, boolean immediate) {
    	return anyoneCanWin(!iAmRed, colDef, rowDef, immediate);
    }
    
    /**
     * Returns the column that would allow anyone to win, either MyAgent or the opponent.
     * Either returns the column that would allow a person win in this turn, 
     * or returns the column that would allow a person win in next turn 
     * (For example, to establish two routes that have 3 slots)
     * 
     * @param myColor Whether to check my color or the opponent's color
     * @param colDef the starting column. The method would check from this column to the rightmost column
     * @param rowDef 1 if I want to make the lowest empty index be one slot higher, 0 otherwise
     * @param immediate To control whether to return the column that would make a person win in next turn or not (true if not)
     * 
     * @return the column index that would allow the agent to win. If there is no chance to win, return -1
     */        
    public int anyoneCanWin(boolean myColor, int colDef, int rowDef, boolean immediate) {
    	int chance = -1; 
    	// If there is no chance to win, return -1.
    	for (int i = colDef; i < myGame.getColumnCount(); i++) {
    		int j = getLowestEmptyIndex(i) - rowDef;
    		if (j > -1) {    			
    			if (longestRoute(i, myColor, rowDef)[0] >= 3) {
    				// If there exists a route that already has 3 slots or more (2 slots on both sides), return the column index directly
    				return i;
    			} else if (!immediate && longestRoute(i, myColor, rowDef)[0] == 2 && (longestRoute(i, myColor, rowDef)[2] == 2 ||
    					  (longestRoute(i, myColor, rowDef)[1] > 1 && longestRoute(i, myColor, rowDef)[2] == 1))) {
    				// If there exists a route that has 2 slots and both ends of the route is empty (and ready to be filled)
    				// Or if there exists more than one route that have 2 slots and the route has one empty end (which is ready
    				// to be filled), save the column index.
    		    	// System.out.println(longestRoute(i, iAmRed, rowDef)[2]);
    				chance = i;
    			}
    		}
    	}
  
    	if (myColor == iAmRed) {
    	  	// To make sure that this move (which would make me win next turn) won't make the opponent win immediately
	    	HashSet<Integer> dangerous = dangerousMove();
			if (dangerous.contains(chance) || TheyCanWin(0, 0, true) > -1) {
				// If this move will make the opponent win immediately, reverse chance to -1.
				chance = -1;
			}
    	}
        return chance;
    }
    
    /**
     * Returns agent name.
     * 
     * @return a string "My Agent".
     */
    public String getName()
    {
        return "My Agent";
    }
    
    /**
     * If a token is placed in a column, what is the longest routes that it will linked together,
     * how many are the routes (of the same length), and how many ends that are ready to be filled.
     * (A route has two ends. If an end is the lowest empty slot in that column, then it is ready to be filled.)
     * 
     * @param columnIndex the index of the column, in which a token might be placed
     * @param color true if red, false, if yellow
     * @param rowDef 1 if I want to make the lowest empty index be one slot higher, 0 otherwise
     * 
     * @return an array of three elements (0: the length of the longest routes, 2: the number of the longest routes, 3: number of ends
     * that are ready to be filled.)
     */
    private Integer[] longestRoute(int columnIndex, boolean color, int rowDef) {
    	int longest = 0; // length of the longest routes
    	int count = 0; // number of the longest routes
    	int potential = 0; // number of ends that are ready to be filled (0, 1, or 2)
    	for (int i = 1; i <= 4; i++) {
    		// loop four patterns (1 if vertical, 2 if horizontal, 3 if descending slope, 4 if ascending slope)
    		int length = routeLength(columnIndex, color, i, rowDef)[0];
        	if (length > longest) {
        		// if current length is longer, update the longest, count and potential.
        		longest = length;
        		count = 0;
        		potential = routeLength(columnIndex, color, i, rowDef)[1];
        	}
        	if (longest != 0 && length == longest) {
        		// if current length is same as longest, increase count by 1, make the potential be the larger one.
        		count++;
        		potential = Math.max(routeLength(columnIndex, color, i, rowDef)[1], potential);
        	}
    	}
    	return new Integer[]{longest, count, potential};   

    }
   
    /**
     * If a token is placed in a column, how long is the route (slots with the same color) that are linked to it.
     * There are four patterns: vertical, horizontal, ascending slope, descending slope.
     * A route has two ends. If an end is the lowest empty slot in that column, then it is ready to be filled.
     * 
     * @param columnIndex the index of the column, in which a token might be placed
     * @param color true if red, false, if yellow
     * @param pattern 1 if vertical, 2 if horizontal, 3 if descending slope, 4 if ascending slope
     * @param rowDef 1 if I want to make the lowest empty index be one slot higher, 0 otherwise
     * 
     * @return return an array of two elements (0: length of the route, 1: how many ends that are ready to be filled)
     */
    private Integer[] routeLength(int columnIndex, boolean color, int pattern, int rowDef) {
    	int x = 0;
    	int y = 0;
    	if (pattern == 1) {
    		// vertical
    		y = 1;
    	} else if (pattern == 2) {
    		// horizontal
    		x = 1;
    	} else if (pattern == 3) {
    		// descending slope
    		x = 1;
    		y = 1;
    	} else {
    		// ascending slope
    		x = 1;
    		y = -1;
    	}
    	
    	int length = 0; // how many neighbor slots are of same color
    	int potential = 0; // how many ends of the route are ready to be filled
    	Integer[] whichSide = new Integer[]{1, -1}; // left or right (top or bottom if vertical)
    	for (int side : whichSide) {
        	int i = 1;
        	boolean finished = false;
	    	while (!finished) {
	    		int deltaX = x * i * side; // horizontal distance
	    		int deltaY = y * i * side; // vertical distance
	    		if (!outOfBound(columnIndex, deltaX, deltaY, rowDef) && getIsFilled(columnIndex, deltaX, deltaY, rowDef) &&
	    			checkColor(columnIndex, deltaX, deltaY, rowDef) == color) {
	    			// If the index is valid and if the slot is filled and if the token inside the slot is the color I want.
	    			length++;
	    		} else if (!outOfBound(columnIndex, deltaX, deltaY, rowDef) && !getIsFilled(columnIndex, deltaX, deltaY, rowDef) && 
	    				   getLowestEmptyIndex(columnIndex + deltaX) == getLowestEmptyIndex(columnIndex) + deltaY - rowDef) {
	    			// Else if the index is valid and the slot is empty and the slot is ready to be filled (it is the lowest empty slot).
	    			potential++;
	    			finished = true; // Finish counting
	    		}
	    		else
	    		{
	    			finished = true; //Finish counting
	    		}
	    		i = i + 1; // If not finished, then it will check one slot further.
	    	}
    	}
    	return new Integer[] {length, potential};
    }
    
    /**
     * To check if the slot I want to check is out of the game panel (index is out of bound).
     * 
     * @param columnIndex the index of the column, in which a token might be placed
     * @param x the horizontal distance from the lowest empty slot of the column to the slot which you want to check color
     * @param y the vertical distance from the lowest empty slot of the column to the slot which you want to check color
     * @param rowDef 1 if I want to make the lowest empty index be one slot higher, 0 otherwise
     * 
     * @return true if index is out of bound, false if index is valid.
     */
    private boolean outOfBound(int columnIndex, int x , int y, int rowDef) {
    	int currentX = columnIndex;
    	int currentY = getLowestEmptyIndex(columnIndex) - rowDef;
    	return currentX + x >= myGame.getColumnCount() || currentY + y >= myGame.getRowCount() || currentX + x < 0 || currentY + y < 0;
    }    
    
    /**
     * To check if the neighbors of the lowest empty slot of a column is filled.
     * 
     * @param columnIndex the index of the column, in which a token might be placed
     * @param x the horizontal distance from the lowest empty slot of the column to the slot which you want to check color
     * @param y the vertical distance from the lowest empty slot of the column to the slot which you want to check color
     * @param rowDef 1 if I want to make the lowest empty index be one slot higher, 0 otherwise
     * 
     * @return true if filled, false if empty.
     */
    private boolean getIsFilled(int columnIndex, int x, int y, int rowDef) {
    	int currentX = columnIndex;
    	int currentY = getLowestEmptyIndex(columnIndex) - rowDef;
    	return myGame.getColumn(currentX + x).getSlot(currentY + y).getIsFilled();
    }
    
    /**
     * To check if the neighbors of the lowest empty slot of a column is the same color.
     * 
     * @param columnIndex the index of the column, in which a token might be placed
     * @param x the horizontal distance from the lowest empty slot of the column to the slot which you want to check color
     * @param y the vertical distance from the lowest empty slot of the column to the slot which you want to check color
     * @param rowDef 1 if I want to make the lowest empty index be one slot higher, 0 otherwise
     * 
     * @return color of the slot. True if red, false if yellow (or empty).
     */
    private boolean checkColor(int columnIndex, int x , int y, int rowDef) {
    	int currentX = columnIndex;
    	int currentY = getLowestEmptyIndex(columnIndex) - rowDef;
    	Connect4Slot toCheck = myGame.getColumn(currentX + x).getSlot(currentY + y);
    	return toCheck.getIsRed();
    }
}