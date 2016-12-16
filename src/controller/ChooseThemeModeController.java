package controller;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
import boundary.*;
import model.*;
 
/**
* <h1>ChooseThemeModeController class</h1>
* <p> The controller to go from the main menu of the builder to the new theme builder</p>
*
* @author  Palladium
* @since   2016-12-15
*/
public class ChooseThemeModeController extends MouseAdapter {
    Application app;
    Model model;
     
    /**
     * The constructor for ChooseThemeModeController 
     * @param a The top level application
     * @param m The model
     */
    public ChooseThemeModeController(Application a, Model m) {
        this.app = a;
        this.model = m;
    }
     
    /**
     * The method that initializes the new Theme Builder and switch the current main menu panel to
     * just created Theme Builder panel
     * @param me Mouse event to track the mouse press
     */
    @Override
    public void mousePressed(MouseEvent me) {
         
        // Initiate new score board builder and board builder
        ScoreBoardBuilder scoreBoard = new ScoreBoardBuilder();
        BoardBuilder board = new BoardBuilder();
         
        // Initiate new Theme builder and theme panel
        ThemeBuilder themeBuilder = new ThemeBuilder(board, scoreBoard);
        ThemeBuilderPanel themeView = new ThemeBuilderPanel(this.app, this.model);
         
        // Assign theme builder status to model
        this.model.assignBuilder(themeBuilder);
         
        // We want to call some method on current application that will switch to just created 
        // theme view
        app.modifyFrameSize(100, 100, 750, 575);
        app.switchPanel(themeView);
         
    }
}
