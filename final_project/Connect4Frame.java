import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 * The main driver of the Connect4Game, as well as the visualization of it.
 * 
 * You should not modify this class, and your agent should not need to access the methods within
 * it directly.
 */
public class Connect4Frame extends JFrame
{
    Connect4Panel myPanel;  // the panel storing the visual of the game itself
    Connect4Game myGame;    // the game itself
    Agent redPlayer, yellowPlayer;   // the two players playing the game
    boolean redPlayerturn, gameActive;  // booleans controlling whose turn it is and whether a game is ongoing
    JButton newGameButton, nextMoveButton, playToEndButton;   // the buttons controlling the game
    JLabel updateLabel; // the status label describing the events of the game
    Random r;   // a random number generator to randomly decide who plays first

    /**
     * Creates a new Connect4Frame with a given game and pair of players.
     * 
     * Your agent will not need to use this method.
     * 
     * @param game the game itself.
     * @param redPlayer the agent playing as the red tokens.
     * @param yellowPlayer the agent playing as the yellow tokens.
     */
    public Connect4Frame(Connect4Game game, Agent redPlayer, Agent yellowPlayer)
    {
        super();

        this.myGame = game;   // stores the game itself
        this.redPlayer = redPlayer;   // stores the red player
        this.yellowPlayer = yellowPlayer; //stores the yellow player
        gameActive = false;   // initially sets that no game is active
        r = new Random();   // creates the random number generator

        myPanel = new Connect4Panel(game);  // creates the panel for displaying the game

        newGameButton = new JButton("Start a New Game");    // creates the button for starting a new game
        newGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);    // center-aligns the new game button
        newGameButton.addActionListener(new ActionListener() {  // connects the new game button to its buttonPressed method
                public void actionPerformed(ActionEvent e)
                {
                    newGameButtonPressed();
                }
            });

        nextMoveButton = new JButton("Play Next Move"); // creates the button for playing the next move
        nextMoveButton.setEnabled(false);   // disables the button until a game is started
        nextMoveButton.setAlignmentX(Component.CENTER_ALIGNMENT);   // centers the button
        nextMoveButton.addActionListener(new ActionListener() { // connects the play next move button to its buttonPressed method
                public void actionPerformed(ActionEvent e)
                {
                    nextMoveButtonPressed();
                }
            });

        playToEndButton = new JButton("Play to End");   // creates the button for finishing the game
        playToEndButton.setEnabled(false);  // disables the button until a game is started
        playToEndButton.setAlignmentX(Component.CENTER_ALIGNMENT);  // centers the button
        playToEndButton.addActionListener(new ActionListener() {    //connects the play to end button to its buttonPressed method
                public void actionPerformed(ActionEvent e)
                {
                    playToEndButtonPressed();
                }
            });

        updateLabel = new JLabel(redPlayer.toString() + " vs. " + yellowPlayer.toString()); // creates the status label
        updateLabel.setAlignmentX(Component.CENTER_ALIGNMENT);  // centers the status label

        JPanel buttonPane = new JPanel();   // creates a pane for the buttons
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.X_AXIS));  // sets the button pane to be horizontally oriented
        // adding and spacing out the buttons
        buttonPane.add(Box.createHorizontalGlue());
        buttonPane.add(newGameButton);
        buttonPane.add(Box.createRigidArea(new Dimension(10,0)));
        buttonPane.add(nextMoveButton);
        buttonPane.add(Box.createRigidArea(new Dimension(10,0)));
        buttonPane.add(playToEndButton);
        buttonPane.add(Box.createHorizontalGlue());

        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));    // sets the overall pane to be vertically oriented
        this.add(buttonPane);   // adds the pane containing the buttons
        this.add(updateLabel);  // adds the update label
        this.add(myPanel);  // adds the visual of the game board
        this.pack();    // shrinks the window to the appropriate size
        this.setResizable(false);   // makes the window not resizable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // close the application when the window is closed
        this.setVisible(true);  // show the window
    }

    /**
     * Changes the text of the update label.
     * 
     * Your agent will not need to use this method.
     * 
     * @param text the next text for the update label.
     */
    public void alert(String text)
    {
        updateLabel.setText(text);
        this.repaint();
    }

    /**
     * Runs the next move of the game.
     * 
     * Your agent will not need to use this method.
     */
    private void nextMove()
    {
        Connect4Game oldBoard = new Connect4Game(myGame);   // store the old board for validation
        if(redPlayerturn) // if it's the red player's turn, run their move
        {
            redPlayer.move();
            alert(yellowPlayer.toString() + " plays next...");
        }
        else // if it's the yellow player's turn, run their move
        {
            yellowPlayer.move();
            alert(redPlayer.toString() + " plays next...");
        }
        String validateResult = oldBoard.validate(myGame); // check and make sure this is a valid next move for this board
        if(validateResult.length() > 0) // if there was a validation error, show it and cancel the game
        {
            alert(validateResult);  // show the error
            disableButtons();   // stop the game
            gameActive = false;
        }
        redPlayerturn = !redPlayerturn;   // switch whose turn it is
        char won = myGame.gameWon();    // check if the game has been won
        if (won != 'N') // if the game has been won...
        {
            disableButtons();   // disable the buttons
            gameActive = false;
            if (myGame.gameWon() == 'R') // if red won, say so
            {
                alert(redPlayer.toString() + " wins!");
            }
            else if (myGame.gameWon() == 'Y') // if yellow won, say so
            {
                alert(yellowPlayer.toString() + " wins!");
            }
        }
        else if (myGame.boardFull()) // if the board is full...
        {
            disableButtons();   // disable the buttons
            alert("The game ended in a draw!"); // announce the draw
            gameActive = false;
        }
        this.repaint();
    }

    /**
     * Clear the board and start a new game.
     * 
     * Your agent will not need to use this method.
     */
    private void newGame()
    {
        myGame.clearBoard();
        enableButtons();
        gameActive = true;
        redPlayerturn = r.nextBoolean();
        if (redPlayerturn)
        {
            alert(redPlayer.toString() + " plays first!");
            myGame.setRedPlayedFirst(true);
        }
        else
        {
            alert(yellowPlayer.toString() + " plays first!");
            myGame.setRedPlayedFirst(false);
        }
        this.repaint();
    }

    /**
     * Runs the game until it's over.
     * 
     * Your agent will not need to use this method.
     */
    private void playToEnd()
    {
        while (gameActive) // keep playing the next move until the game ends
        {
            nextMove();
        }
        char won = myGame.gameWon();
        if (won != 'N') // when it ends, announce how it ended: win or draw
        {
            disableButtons();
            if (myGame.gameWon() == 'R')
            {
                alert(redPlayer.toString() + " wins!");
            }
            else if (myGame.gameWon() == 'Y')
            {
                alert(yellowPlayer.toString() + " wins!");
            }
        }
        else if (myGame.boardFull())
        {
            disableButtons();
            alert("The game ended in a draw!");
        }
        else // if it didn't end in a win or draw, leave the error message u
        {
            disableButtons();
        }
    }

    /**
     * Reacts to the new game button being pressed.
     * 
     * Your agent will not need to use this method.
     */    
    public void newGameButtonPressed()
    {
        newGame();
    }

    /**
     * Reacts to the next move button being pressed.
     * 
     * Your agent will not need to use this method.
     */
    public void nextMoveButtonPressed()
    {
        nextMove();
    }

    /**
     * Reacts to the play to end button being pressed.
     * 
     * Your agent will not need to use this method.
     */
    public void playToEndButtonPressed()
    {
        playToEnd();
    }

    /**
     * Disables the buttons.
     * 
     * Your agent will not need to use this method.
     */
    private void disableButtons()
    {
        nextMoveButton.setEnabled(false);
        playToEndButton.setEnabled(false);
    }

    /**
     * Enables the buttons.
     * 
     * Your agent will not need to use this method.
     */
    private void enableButtons()
    {
        nextMoveButton.setEnabled(true);
        playToEndButton.setEnabled(true);
    }

}