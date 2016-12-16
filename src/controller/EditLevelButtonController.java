package controller;
 
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
import boundary.Application;
import boundary.EditLevelMenu;
import boundary.PreviewWindowPanel;
import model.Model;
 
/**
 * <h1>EditLevelButtonController class</h1>
 * <p> The controller to go to the menu of the pre-built
 * levels that should be edited</p>
 *
 * @author Palladium
 * @since 2016-12-15
 */
public class EditLevelButtonController extends MouseAdapter{
    Application app;
    Model model;
 
    /**
     * The constructor for EditLevelButtonController
     * @param app The top level application 
     * @param model The model
     */
    public EditLevelButtonController(Application app, Model model) {
        this.app = app;
        this.model = model;
    }
 
    /**
     * The method to request to edit one of the pre-built levels from the edit level menu
     * @param MouseEvent me The event to be performed with the mouse
     */
    @Override
    public void mousePressed(MouseEvent me) {
        // Initiate the new edit level menu
        EditLevelMenu el = new EditLevelMenu(this.app, this.model);
         
        // Switch to the edit level menu
        app.modifyFrameSize(100, 100, 750, 575);
        this.app.switchPanel(el);
    }
 
}
