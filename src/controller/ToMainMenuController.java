package controller;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
 
 
import boundary.Application;
import boundary.MainMenuPanel;
import model.Model;
 
/**
* <h1>ToMainMenuController class</h1>
* <p> The controller to go to the main menu from the level builder</p>
*
* @author  Palladium
* @since   2016-12-15
*/
public class ToMainMenuController extends MouseAdapter {
    Application app;
    Model model;
     
    /**
     * The constructor for the ToMainMenuController
     * @param a The top level application
     * @param m The model
     */
    public ToMainMenuController(Application a, Model m) {
        this.app = a;
        this.model = m;
    }
     
    /**
     * The method to switch panel back to main menu
     */
    public void mousePressed(MouseEvent me){
        MainMenuPanel menuView = new MainMenuPanel(this.app, this.model);
        model.resetBuilder();
         
        app.modifyFrameSize(100, 100, 600, 500);
        app.switchPanel(menuView);
    }
     
 
}
