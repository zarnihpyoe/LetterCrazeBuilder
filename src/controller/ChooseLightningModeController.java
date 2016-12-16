/**
 * controller The package of control classes
 */
package controller;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
import boundary.*;
import model.*;
 
/**
* <h1>ChooseLingthningModeController class</h1>
* <p> The controller to go from the main menu of the builder to the new lightning builder</p>
*
* @author  Palladium
* @since   2016-12-15
*/
public class ChooseLightningModeController extends MouseAdapter {
    Application app;
    Model model;
     
    /**
     * The constructor for ChooseLightningModeController
     * @param a The top level application
     * @param m The model
     */
    public ChooseLightningModeController(Application a, Model m) {
        this.app = a;
        this.model = m;
    }
     
    /**
     * The method that initializes the new Lightning Builder and switch the current main menu panel to
     * just created Lightning Builder panel
     * @param me Mouse event to track the mouse press
     */
    @Override
    public void mousePressed(MouseEvent me) {
        // Initiate new score board builder and board builder to pass to lightning builder later
        ScoreBoardBuilder scoreBoard = new ScoreBoardBuilder();
        BoardBuilder board = new BoardBuilder();
         
        // Initiate new Lightning builder to pass to the model later
        LightningBuilder lightningBuilder = new LightningBuilder(board, scoreBoard);
         
        // Assign lightning builder status to model
        this.model.assignBuilder(lightningBuilder);
         
        // Initiate new lightning view to switch the panel later
        LightningBuilderPanel lightningView = new LightningBuilderPanel(this.model, this.app);
         
        // We want to call some method on current application that will switch to just created 
        // lightning view
        app.modifyFrameSize(100, 100, 750, 575);
        app.switchPanel(lightningView);
         
         
    }
}
