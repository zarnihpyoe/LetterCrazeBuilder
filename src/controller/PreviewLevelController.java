package controller;
 
import java.awt.event.MouseAdapter;
 
import java.awt.event.MouseEvent;
 
import boundary.Application;
import boundary.PreviewWindowPanel;
import model.Model;
 
/**
 * <h1>PreviewLevelController class</h1>
 * <p> The controller to preview the level just built</p>
 *
 * @author Palladium
 * @since 2016-12-15
 */
public class PreviewLevelController extends MouseAdapter{
    Application app;
    Model model;
 
    /**
     * The constructor for the PreviewLevelController
     * @param a The top level application
     * @param m The model
     */
    public PreviewLevelController(Application app, Model model) {
        this.app = app;
        this.model = model;
    }
 
    /**
     * The method to switch from the current level builder panel to 
     * preview the level just created
     */
    @Override
    public void mousePressed(MouseEvent me) {
        // Create a new preview window
        PreviewWindowPanel pwp = new PreviewWindowPanel(this.app, this.model);
         
        // Switch to freshly created panel
        app.modifyFrameSize(100, 100, 750, 575);
        this.app.switchPanel(pwp);
         
    }
}
