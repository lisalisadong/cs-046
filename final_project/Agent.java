/**
 * The abstract class for an Agent that plays Connect 4.
 * 
 * All Agents must have three things: a constructor that initializes the agent with a game
 * and whether the agent is the red player, a name, and the ability to move.
 */
public abstract class Agent
{
    // A protected variable means that only the current Class as well as Classes that inherit from the superclass
    // will have access to the variable.
    protected Connect4Game myGame;
    protected boolean iAmRed;
    
    /**
     * Constructs a new agent.
     * 
     * You MAY override this method in your agent. If you do, make sure to call...
     *  super(game, iAmRed);
     * ...before constructing any other initial information.
     * 
     * @param game the game for the agent to play.
     * @param iAmRed whether the agent is the red player.
     */
    public Agent(Connect4Game game, boolean iAmRed)
    {
        this.myGame = game;
        this.iAmRed = iAmRed;
    }
    /**
     * Make a move in the game. At the beginning of this method, the myGame object will be
     * ready for a move. After this method has run, exactly one piece should be added to the
     * game board with no other changes made.
     * 
     * You MUST override this method in your agent.
     */
    public abstract void move();
    /**
     * A name for the agent.
     * 
     * You MUST override this method in your agent.
     * 
     * @return the agent's name.
     */
    public abstract String getName();
    /**
     * The way the agent's name is display in the game, with its color.
     * 
     * You should not need to modify this method.
     */
    public String toString()
    {
        if (iAmRed)
        {
            return getName() + " (Red)";
        }
        else
        {
            return getName() + " (Yellow)";
        }
    }
}