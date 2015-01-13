import java.util.Random;

public class MyAgent extends Agent
{
    Random r;

    /**
     * Constructs a new agent, giving it the game and telling it whether it is Red or Yellow.
     * 
     * @param game The game the agent will be playing.
     * @param iAmRed True if the agent is Red, False if the agent is Yellow.
     */
    public MyAgent(Connect4Game game, boolean iAmRed)
    {
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
    public void move()
    {
    	if (ICanWin() > -1)
    	{
    		moveOnColumn(ICanWin());
    		System.out.println("i can win");
    	}
    	else if (TheyCanWin() > -1)
    	{
    		moveOnColumn(TheyCanWin());
    		System.out.println("they can win");
    	}
    	else
    	{
    		moveOnColumn(randomMove());
    		System.out.println("random");
    	}
    }

    /**
     * Drops a token into a particular column so that it will fall to the bottom of the column.
     * If the column is already full, nothing will change.
     * 
     * @param columnNumber The column into which to drop the token.
     */
    public void moveOnColumn(int columnNumber)
    {
        int lowestEmptySlotIndex = getLowestEmptyIndex(myGame.getColumn(columnNumber));   // Find the top empty slot in the column
                                                                                                  // If the column is full, lowestEmptySlot will be -1
        if (lowestEmptySlotIndex > -1)  // if the column is not full
        {
            Connect4Slot lowestEmptySlot = myGame.getColumn(columnNumber).getSlot(lowestEmptySlotIndex);  // get the slot in this column at this index
            if (iAmRed) // If the current agent is the Red player...
            {
                lowestEmptySlot.addRed(); // Place a red token into the empty slot
            }
            else // If the current agent is the Yellow player (not the Red player)...
            {
                lowestEmptySlot.addYellow(); // Place a yellow token into the empty slot
            }
        }
    }

    /**
     * Returns the index of the top empty slot in a particular column, or -1 if the column is already full.
     * 
     * @param column The column to check.
     */
    public int getLowestEmptyIndex(Connect4Column column) {
        int lowestEmptySlot = -1;
        for  (int i = 0; i < column.getRowCount(); i++)
        {
            if (!column.getSlot(i).getIsFilled())
            {
                lowestEmptySlot = i;
            }
        }
        return lowestEmptySlot;
    }

    /**
     * Returns a random valid move. If your agent doesn't know what to do, making a random move
     * can allow the game to go on anyway.
     * 
     */
    public int randomMove()
    {
        int i = r.nextInt(myGame.getColumnCount());
        while (getLowestEmptyIndex(myGame.getColumn(i)) == -1)
        {
            i = r.nextInt(myGame.getColumnCount());
        }
        return i;
    }

    /**
     * Returns the column that would allow the agent to win.
     * 
     * You might want your agent to check to see if it has a winning move available to it so that
     * it can go ahead and make that move. Implement this method to return what column would
     * allow the agent to win.
     */
    public int ICanWin()
    {
    	for (int i = 0; i < myGame.getColumnCount(); i++)
    	{
    		int j = getLowestEmptyIndex(myGame.getColumn(i));
    		if (j > -1)
    		{
	    		int left = 0;
	    		int right = 0;
	    		if (myGame.getRowCount() - j > 3 && myGame.getColumn(i).getSlot(j + 1).getIsRed() == iAmRed && myGame.getColumn(i).getSlot(j + 2).getIsRed() == iAmRed && myGame.getColumn(i).getSlot(j + 3).getIsRed() == iAmRed)
	    		{
	    			return i;
	    		}
	    		if (i >= 1 && myGame.getColumn(i - 1).getSlot(j).getIsFilled() && myGame.getColumn(i - 1).getSlot(j).getIsRed() == iAmRed)
	    		{
	    			left++;
	    			if (i >= 2 && myGame.getColumn(i - 2).getSlot(j).getIsFilled() && myGame.getColumn(i - 2).getSlot(j).getIsRed() == iAmRed)
	    			{
	    				left++;
	    				if (i >= 3 && myGame.getColumn(i - 3).getSlot(j).getIsFilled() && myGame.getColumn(i - 3).getSlot(j).getIsRed() == iAmRed)
	        			{
	        				left++;
	        			}
	    			}
	    		}
	    		if (i + 1 < myGame.getColumnCount() && myGame.getColumn(i + 1).getSlot(j).getIsFilled() && myGame.getColumn(i + 1).getSlot(j).getIsRed() == iAmRed)
	    		{
	    			right++;
	    			if (i + 2 < myGame.getColumnCount() && myGame.getColumn(i + 2).getSlot(j).getIsFilled() && myGame.getColumn(i + 2).getSlot(j).getIsRed() == iAmRed)
	    			{
	    				right++;
	    				if (i + 3 < myGame.getColumnCount() && myGame.getColumn(i + 3).getSlot(j).getIsFilled() && myGame.getColumn(i + 3).getSlot(j).getIsRed() == iAmRed)
	        			{
	        				right++;
	        			}
	    			}
	    		}
	    		if (left + right >= 3)
	    		{
	    			return i;
	    		}
	    		left = 0;
	    		right = 0;
	    		if (i >= 1 && j >=1 && myGame.getColumn(i - 1).getSlot(j - 1).getIsFilled() && myGame.getColumn(i - 1).getSlot(j - 1).getIsRed() == iAmRed)
	    		{
	    			left++;
	    			if (i >= 2 && j >=2 && myGame.getColumn(i - 2).getSlot(j - 2).getIsFilled() && myGame.getColumn(i - 2).getSlot(j - 2).getIsRed() == iAmRed)
	    			{
	    				left++;
	    				if (i >= 3 && j >=3 && myGame.getColumn(i - 3).getSlot(j - 3).getIsFilled() && myGame.getColumn(i - 3).getSlot(j - 3).getIsRed() == iAmRed)
	        			{
	        				left++;
	        			}
	    			}
	    		}
	    		if (i + 1 < myGame.getColumnCount() && j + 1 < myGame.getRowCount() && myGame.getColumn(i + 1).getSlot(j + 1).getIsFilled() && myGame.getColumn(i + 1).getSlot(j + 1).getIsRed() == iAmRed)
	    		{
	    			right++;
	    			if (i + 2 < myGame.getColumnCount() && j + 2 < myGame.getRowCount() && myGame.getColumn(i + 2).getSlot(j + 2).getIsFilled() && myGame.getColumn(i + 2).getSlot(j + 2).getIsRed() == iAmRed)
	    			{
	    				right++;
	    				if (i + 3 < myGame.getColumnCount() && j + 3 < myGame.getRowCount() && myGame.getColumn(i + 3).getSlot(j + 3).getIsFilled() && myGame.getColumn(i + 3).getSlot(j + 3).getIsRed() == iAmRed)
	        			{
	        				right++;
	        			}
	    			}
	    		}
	    		if (left + right >= 3)
	    		{
	    			return i;
	    		}
	    		left = 0;
	    		right = 0;
	    		if (i >= 1 && j + 1 < myGame.getRowCount() && myGame.getColumn(i - 1).getSlot(j + 1).getIsFilled() && myGame.getColumn(i - 1).getSlot(j + 1).getIsRed() == iAmRed)
	    		{
	    			left++;
	    			if (i >= 2 && j + 2 < myGame.getRowCount() && myGame.getColumn(i - 2).getSlot(j + 2).getIsFilled() && myGame.getColumn(i - 2).getSlot(j + 2).getIsRed() == iAmRed)
	    			{
	    				left++;
	    				if (i >= 3 && j + 3 < myGame.getRowCount() && myGame.getColumn(i - 3).getSlot(j + 3).getIsFilled() && myGame.getColumn(i - 3).getSlot(j + 3).getIsRed() == iAmRed)
	        			{
	        				left++;
	        			}
	    			}
	    		}
	    		if (i + 1 < myGame.getColumnCount() && j >= 1 && myGame.getColumn(i + 1).getSlot(j - 1).getIsFilled() && myGame.getColumn(i + 1).getSlot(j - 1).getIsRed() == iAmRed)
	    		{
	    			right++;
	    			if (i + 2 < myGame.getColumnCount() && j >= 2 &&  myGame.getColumn(i + 2).getSlot(j - 2).getIsFilled() && myGame.getColumn(i + 2).getSlot(j - 2).getIsRed() == iAmRed)
	    			{
	    				right++;
	    				if (i + 3 < myGame.getColumnCount() && j >= 3 &&  myGame.getColumn(i + 3).getSlot(j - 3).getIsFilled() && myGame.getColumn(i + 3).getSlot(j - 3).getIsRed() == iAmRed)
	        			{
	        				right++;
	        			}
	    			}
	    		}
	    		if (left + right >= 3)
	    		{
	    			return i;
	    		}
    		}
    	}
        return -1;
    }

    /**
     * Returns the column that would allow the opponent to win.
     * 
     * You might want your agent to check to see if the opponent would have any winning moves
     * available so your agent can block them. Implement this method to return what column should
     * be blocked to prevent the opponent from winning.
     */
    public int TheyCanWin()
    {
    	for (int i = 0; i < myGame.getColumnCount(); i++)
    	{
    		int j = getLowestEmptyIndex(myGame.getColumn(i));
    		if (j > -1)
    		{
	    		int left = 0;
	    		int right = 0;
	    		if (myGame.getRowCount() - j > 3 && myGame.getColumn(i).getSlot(j + 1).getIsRed() == !iAmRed && myGame.getColumn(i).getSlot(j + 2).getIsRed() == !iAmRed && myGame.getColumn(i).getSlot(j + 3).getIsRed() == !iAmRed)
	    		{
	    			return i;
	    		}
	    		if (i >= 1 && myGame.getColumn(i - 1).getSlot(j).getIsFilled() && myGame.getColumn(i - 1).getSlot(j).getIsRed() == !iAmRed)
	    		{
	    			left++;
	    			if (i >= 2 && myGame.getColumn(i - 2).getSlot(j).getIsFilled() && myGame.getColumn(i - 2).getSlot(j).getIsRed() == !iAmRed)
	    			{
	    				left++;
	    				if (i >= 3 && myGame.getColumn(i - 3).getSlot(j).getIsFilled() && myGame.getColumn(i - 3).getSlot(j).getIsRed() == !iAmRed)
	        			{
	        				left++;
	        			}
	    			}
	    		}
	    		if (i + 1 < myGame.getColumnCount() && myGame.getColumn(i + 1).getSlot(j).getIsFilled() && myGame.getColumn(i + 1).getSlot(j).getIsRed() == !iAmRed)
	    		{
	    			right++;
	    			if (i + 2 < myGame.getColumnCount() && myGame.getColumn(i + 2).getSlot(j).getIsFilled() && myGame.getColumn(i + 2).getSlot(j).getIsRed() == !iAmRed)
	    			{
	    				right++;
	    				if (i + 3 < myGame.getColumnCount() && myGame.getColumn(i + 3).getSlot(j).getIsFilled() && myGame.getColumn(i + 3).getSlot(j).getIsRed() == !iAmRed)
	        			{
	        				right++;
	        			}
	    			}
	    		}
	    		if (left + right >= 3)
	    		{
	    			return i;
	    		}
	    		left = 0;
	    		right = 0;
	    		if (i >= 1 && j >=1 && myGame.getColumn(i - 1).getSlot(j - 1).getIsFilled() && myGame.getColumn(i - 1).getSlot(j - 1).getIsRed() == !iAmRed)
	    		{
	    			left++;
	    			if (i >= 2 && j >=2 && myGame.getColumn(i - 2).getSlot(j - 2).getIsFilled() && myGame.getColumn(i - 2).getSlot(j - 2).getIsRed() == !iAmRed)
	    			{
	    				left++;
	    				if (i >= 3 && j >=3 && myGame.getColumn(i - 3).getSlot(j - 3).getIsFilled() && myGame.getColumn(i - 3).getSlot(j - 3).getIsRed() == !iAmRed)
	        			{
	        				left++;
	        			}
	    			}
	    		}
	    		if (i + 1 < myGame.getColumnCount() && j + 1 < myGame.getRowCount() && myGame.getColumn(i + 1).getSlot(j + 1).getIsFilled() && myGame.getColumn(i + 1).getSlot(j + 1).getIsRed() == !iAmRed)
	    		{
	    			right++;
	    			if (i + 2 < myGame.getColumnCount() && j + 2 < myGame.getRowCount() && myGame.getColumn(i + 2).getSlot(j + 2).getIsFilled() && myGame.getColumn(i + 2).getSlot(j + 2).getIsRed() == !iAmRed)
	    			{
	    				right++;
	    				if (i + 3 < myGame.getColumnCount() && j + 3 < myGame.getRowCount() && myGame.getColumn(i + 3).getSlot(j + 3).getIsFilled() && myGame.getColumn(i + 3).getSlot(j + 3).getIsRed() == !iAmRed)
	        			{
	        				right++;
	        			}
	    			}
	    		}
	    		if (left + right >= 3)
	    		{
	    			return i;
	    		}
	    		left = 0;
	    		right = 0;
	    		if (i >= 1 && j + 1 < myGame.getRowCount() && myGame.getColumn(i - 1).getSlot(j + 1).getIsFilled() && myGame.getColumn(i - 1).getSlot(j + 1).getIsRed() == !iAmRed)
	    		{
	    			left++;
	    			if (i >= 2 && j + 2 < myGame.getRowCount() && myGame.getColumn(i - 2).getSlot(j + 2).getIsFilled() && myGame.getColumn(i - 2).getSlot(j + 2).getIsRed() == !iAmRed)
	    			{
	    				left++;
	    				if (i >= 3 && j + 3 < myGame.getRowCount() && myGame.getColumn(i - 3).getSlot(j + 3).getIsFilled() && myGame.getColumn(i - 3).getSlot(j + 3).getIsRed() == !iAmRed)
	        			{
	        				left++;
	        			}
	    			}
	    		}
	    		if (i + 1 < myGame.getColumnCount() && j >= 1 && myGame.getColumn(i + 1).getSlot(j - 1).getIsFilled() && myGame.getColumn(i + 1).getSlot(j - 1).getIsRed() == !iAmRed)
	    		{
	    			right++;
	    			if (i + 2 < myGame.getColumnCount() && j >= 2 &&  myGame.getColumn(i + 2).getSlot(j - 2).getIsFilled() && myGame.getColumn(i + 2).getSlot(j - 2).getIsRed() == !iAmRed)
	    			{
	    				right++;
	    				if (i + 3 < myGame.getColumnCount() && j >= 3 &&  myGame.getColumn(i + 3).getSlot(j - 3).getIsFilled() && myGame.getColumn(i + 3).getSlot(j - 3).getIsRed() == !iAmRed)
	        			{
	        				right++;
	        			}
	    			}
	    		}
	    		if (left + right >= 3)
	    		{
	    			return i;
	    		}
    		}
    	}
        return -1;
    }

    public String getName()
    {
        return "My Agent";
    }
}