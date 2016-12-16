package controller;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
import boundary.*;
import model.*;
 
/**
 * <h1>DeleteLevelButtonController class</h1>
 * <p> The controller to go from the main menu panel of the builder 
 * to the menu of the levels to be marked for the deletion</p>
 *
 * @author Palladium
 * @since 2016-12-15
 */
public class DeleteLevelButtonController extends MouseAdapter {
    Application app;
    Model model;
     
    /**
     * The constructor for the DeleteLevelButtonController
     * @param a The top level application
     * @param m The model
     */
    public DeleteLevelButtonController(Application a, Model m) {
        this.app = a;
        this.model = m;
    }
     
    /**
     * The method that switches the current main menu panel to
     * the delete level menu panel 
     * @param me Mouse event to track the mouse press
     */
    @Override
    public void mousePressed(MouseEvent me) {
         
        // Create a new DeleteLevelMenu
        DeleteLevelPanel dl = new DeleteLevelPanel(this.app, this.model);
         
        // We want to call some method on current application that will switch to just created delete
        // level menu
        app.modifyFrameSize(100, 100, 750, 575);
        app.switchPanel(dl);
         
    }
}
