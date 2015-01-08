/**
 * The data structure for a game of Connect 4.
 * 
 * Connect4Game is made of a certain number of Connect4Columns. Each column represents
 * a column from the current state of the game.
 * 
 * You should not modify this class, but you will need to use methods within it.
 */
public class Connect4Game
{
    private Connect4Column[] columns;
    private boolean redPlayedFirst;
    
    /**
     * Construct a new Connect 4 game with the given size.
     * 
     * Your agent will not need to use this method.
     * 
     * @param numCols The number of columns in the game board
     * @param numRows The number of rows in the game board
     */
    public Connect4Game(int numCols, int numRows)
    {
        columns=new Connect4Column[numCols];
        for(int i = 0; i < numCols; i++)
        {
            columns[i] = new Connect4Column(numRows);
        }
    }
    /**
     * Copy an existing Connect 4 game.
     * 
     * Your agent will not need to use this method.
     * 
     * @param game The game to copy.
     */
    public Connect4Game(Connect4Game game)
    {
        columns = new Connect4Column[game.getColumnCount()];
        for (int i = 0; i < game.getColumnCount(); i++)
        {
            columns[i] = new Connect4Column(game.getColumn(i));
        }
    }
    
    /**
     * Retrieve a certain Connect4Column from the game board.
     * 
     * Your agent WILL need to use this method.
     * 
     * @param i The column to retrieve.
     */
    public Connect4Column getColumn(int i)
    {
        if (i < columns.length && i >= 0)
        {
            return columns[i];
        }
        else
        {
            return null;
        }
    }
    
    /**
     * Get the total number of columns in the game board.
     * 
     * Your agent WILL need to use this method.
     * 
     * @return the number of columns in the game board.
     */
    public int getColumnCount()
    {
        return columns.length;
    }
    /**
     * Get the total number of rows in the game board.
     * 
     * Your agent WILL need to use this method.
     * 
     * @return the number of rows in the game board.
     */
    public int getRowCount()
    {
        return columns[0].getRowCount();
    }
    /**
     * Start a new game.
     * 
     * Your agent will not need to use this method.
     */
    public void clearBoard()
    {
        for (int i = 0; i < getColumnCount(); i++)
        {
            for (int j = 0; j < getRowCount(); j++)
            {
                getColumn(i).getSlot(j).clear();
            }
        }
    }
    /**
     * Retrieve a matrix form of the board.
     * 
     * Your agent will not need to use this method.
     * 
     * @return a character matrix of the game board.
     */
    public char[][] getBoardMatrix()
    {
        char[][] board = new char[getRowCount()][getColumnCount()];
        for (int i = 0; i < getColumnCount(); i++)
        {
            for(int j = 0; j < getRowCount(); j++) 
            {
                if (getColumn(i).getSlot(j).getIsFilled())
                {
                    if (getColumn(i).getSlot(j).getIsRed())
                    {
                        board[j][i] = 'R';
                    }
                    else
                    {
                        board[j][i] = 'Y';
                    }
                }
                else
                {
                    board[j][i] = 'B';
                }
            }
        }
        return board;
    }
    /**
     * Check if the board is full.
     * 
     * Your agent will not need to use this method.
     * 
     * @return true if the board is full, false otherwise.
     */
    public boolean boardFull()
    {
        char[][] board = getBoardMatrix();
        for (int i = 0; i < getColumnCount(); i++)
        {
            for (int j = 0; j < getRowCount(); j++)
            {
                if (board[j][i] == 'B')
                {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Check if the game has been won.
     * 
     * Your agent will not need to use this method.
     * 
     * @return 'R' if red won, 'Y' if yellow won, 'N' if the game has not been won.
     */
    public char gameWon()
    {
        char[][] board = getBoardMatrix();
        
        for (int i = 0; i < getColumnCount(); i++)
        {
            for (int j = 0; j < getRowCount(); j++)
            {
                if(board[j][i] != 'B')
                {
                    if (j + 3 < getRowCount())
                    {
                        if(board[j][i] == board[j + 1][i] && board[j][i] == board[j + 2][i] && board[j][i] == board[j + 3][i])
                        {
                            highlightSlot(j, i);
                            highlightSlot(j + 1, i);
                            highlightSlot(j + 2, i);
                            highlightSlot(j + 3, i);
                            return board[j][i];
                        }
                    }
                    if (i + 3 < getColumnCount())
                    {
                        if (board[j][i] == board[j][i + 1] && board[j][i] == board[j][i + 2] && board[j][i] == board[j][i + 3])
                        {
                            highlightSlot(j, i);
                            highlightSlot(j, i + 1);
                            highlightSlot(j, i + 2);
                            highlightSlot(j, i + 3);
                            return board[j][i];
                        }
                    }
                    if (i + 3 < getColumnCount() && j + 3 < getRowCount())
                    {
                        if(board[j][i] == board[j + 1][i + 1] && board[j][i] == board[j + 2][i + 2] && board[j][i] == board[j + 3][i + 3])
                        {
                            highlightSlot(j, i);
                            highlightSlot(j + 1, i + 1);
                            highlightSlot(j + 2, i + 2);
                            highlightSlot(j + 3,i + 3);
                            return board[j][i];
                        }
                    }
                    if (i > 2 && j + 3 < getRowCount())
                    {
                        if (board[j][i] == board[j + 1][i - 1] && board[j][i] == board[j + 2][i - 2] && board[j][i] == board[j + 3][i - 3])
                        {
                            highlightSlot(j, i);
                            highlightSlot(j + 1, i - 1);
                            highlightSlot(j + 2, i - 2);
                            highlightSlot(j + 3, i - 3);
                            return board[j][i];
                        }
                    }
                }
            }
        }

        return 'N';
    }
    /**
     * Validate that the given board is a valid next state following this board.
     * 
     * Your agent will not need to use this method.
     * 
     * @param after the next board state.
     */
    public String validate(Connect4Game after)
    {
        int filledSlots = 0, redSlots = 0, yellowSlots = 0;
        for (int i = 0; i < getColumnCount(); i++)
        {
            for (int j = 0; j < getRowCount(); j++)
            {
                if (after.getColumn(i).getSlot(j).getIsFilled())
                {
                    if (after.getColumn(i).getSlot(j).getIsRed())
                    {
                        redSlots++;
                    }
                    else
                    {
                        yellowSlots++;
                    }
                }
                if (!getColumn(i).getSlot(j).getIsFilled() && after.getColumn(i).getSlot(j).getIsFilled())
                {
                    filledSlots++;
                }
                if (getColumn(i).getSlot(j).getIsFilled() && !after.getColumn(i).getSlot(j).getIsFilled())
                {
                    return "Invalid move: a token was removed at column " + i + ", row " + j + ".";
                }
                if (getColumn(i).getSlot(j).getIsFilled() && (getColumn(i).getSlot(j).getIsRed()!=after.getColumn(i).getSlot(j).getIsRed()))
                {
                    return "Invalid move: a token was changed at column " + i + ", row " + j + ".";
                }
                if (j < getRowCount() - 1 && after.getColumn(i).getSlot(j).getIsFilled() && !after.getColumn(i).getSlot(j+1).getIsFilled())
                {
                    return "Invalid move: a token in column " + i + " was not placed in the highest open slot.";
                }
            }
        }
        if (filledSlots > 1)
        {
            return "Invalid move: more than one token was placed.";
        }
        if (filledSlots == 0)
        {
            return "Invalid move: no move was made.";
        }
        if (after.getRedPlayedFirst())
        {
            if (redSlots < yellowSlots)
            {
                return "Invalid move: yellow moved during red's turn.";
            }
            else if (redSlots > yellowSlots + 1)
            {
                return "Invalid move: red moved during yellow's turn.";
            }
        }
        else
        {
            if (yellowSlots < redSlots)
            {
                return "Invalid move: red moved during yellow's turn.";
            }
            else if (yellowSlots > redSlots + 1)
            {
                return "Invalid move: yellow moved during red's turn.";
            }
        }
        return "";
    }
    /**
     * Highlight the winning moves in a game.
     * 
     * Your agent will not need to use this method.
     * 
     * @param row the row of the token to highlight
     * @param column the column of the token to highlight
     */
    public void highlightSlot(int row, int column)
    {
        getColumn(column).getSlot(row).highlight();
    }
    
    /**
     * Check whether red played first. This is used to confirm the players are alternating correctly.
     * 
     * Your agent will not need to use this method.
     * 
     * @return true if red played first in this game, false otherwise.
     */
    public boolean getRedPlayedFirst()
    {
        return redPlayedFirst;
    }
    
    /**
     * Sets whether red played first. This is used to confirm the players are alternating correctly.
     * 
     * Your agent will not need to use this method.
     * 
     * @param redPlayedFirst true if red played first in this game, false otherwise.
     */
    public void setRedPlayedFirst(boolean redPlayedFirst)
    {
        this.redPlayedFirst = redPlayedFirst;
    }
}