package controller;
 
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
 
import boundary.*;
import model.*;
 
/**
 * <h1>DeleteLevelMenu class</h1>
 * <p> The controller to delete the level marked the same number as
 * the label on the button in the delete level menu</p>
 *
 * @author Palladium
 * @since 2016-12-15
 */
public class DeleteLevelMenu extends MouseAdapter {
    Application app;
    Model model;
    int levelNumber;
 
    /**
     * The constructor for DeleteLevelMenu
     * @param app The top level application
     * @param model The model
     * @param levelNumber The level to be deleted
     */
    public DeleteLevelMenu(Application app, Model model, int levelNumber){
        this.app = app;
        this.model = model;
        this.levelNumber = levelNumber;
    }
 
    /**
     * The method to delete the level when the mouse id pressed on one of the delete 
     * buttons(the number on the button is the number of the level)
     */
    @Override
    public void mousePressed(MouseEvent me) {
        try{
            String tempFile = levelNumber+".txt";
            //Delete if tempFile exists
            File fileTemp = new File(tempFile);
            if (fileTemp.exists()){
                fileTemp.delete();
            }   
        }catch(Exception e){
            // if any error occurs
            e.printStackTrace();
        }
 
        // Initiate the main menu panel 
        MainMenuPanel menuView = new MainMenuPanel(this.app, this.model);
         
        // Go back to main menu as soon as the level is deleted
        app.modifyFrameSize(100, 100, 600, 500);
        app.switchPanel(menuView);
 
    }
     
     
     
     
     
     
 
}
