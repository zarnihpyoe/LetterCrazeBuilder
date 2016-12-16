package controller;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
import boundary.*;
import model.*;
 
/**
* <h1>ChoosePuzzleModeController class</h1>
* <p> The controller to go from the main menu of the builder to the new puzzle builder</p>
*
* @author  Palladium
* @since   2016-12-15
*/
public class ChoosePuzzleModeController extends MouseAdapter {
    Application app;
    Model model;
     
    /**
     * The constructor for the ChoosePuzzleModeController
     * @param a The top level application
     * @param m The model
     */
    public ChoosePuzzleModeController(Application a, Model m) {
        this.app = a;
        this.model = m;
    }
     
    /**
     * The method that initializes the new Puzzle Builder and switch the current main menu panel to
     * just created Puzzle Builder panel
     * @param me Mouse event to track the mouse press
     */
    @Override
    public void mousePressed(MouseEvent me) {
         
        // Initiate new score board builder and board builder
        ScoreBoardBuilder scoreBoard = new ScoreBoardBuilder();
        BoardBuilder board = new BoardBuilder();
         
        // Initiate new Puzzle builder
        PuzzleBuilder puzzleBuilder = new PuzzleBuilder(board, scoreBoard);
        PuzzleBuilderPanel puzzleView = new PuzzleBuilderPanel(this.app, this.model);
         
        // Assign Puzzle builder status to model
        this.model.assignBuilder(puzzleBuilder);
         
        // We want to call some method on current application that will switch to just created 
        // Puzzle panel
        app.modifyFrameSize(100, 100, 750, 575);
        app.switchPanel(puzzleView);
         
    }
}
