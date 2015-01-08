/**
 * The main driver of the program. This file will create the game, create the two agents,
 * and create the window for the game. After that, Connect4Frame runs everything.
 * 
 * You should only modify this class to change which agents are playing.
 */
public class Main
{
    public static void main(String[] args)
    {
        Connect4Game game = new Connect4Game(7, 6); // create the game; these sizes can be altered for larger or smaller games
        Agent redPlayer = new MyAgent(game, true); // create the red player, any subclass of Agent
        Agent yellowPlayer = new MyAgent(game, false); // create the yellow player, any subclass of Agent
        
        Connect4Frame mainframe = new Connect4Frame(game, redPlayer, yellowPlayer); // create the game window
    }
}