package boundary;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import controller.ChooseLightningModeController;
import controller.ChoosePuzzleModeController;
import controller.ChooseThemeModeController;
import controller.DeleteLevelMenu;
import controller.EditLightningController;
import controller.EditPuzzleController;
import controller.EditThemeController;
import controller.ToMainMenuController;
import controllers.*;
import model.Model;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class EditLevelMenu extends JPanel {
	Application app;
	Model model;
	
	private JButton[] buttonArray;
	private JButton btnMainMenu;

	/**
	 * Create the application.
	 */
	public EditLevelMenu(Application app, Model model) {
		initialize(app, model);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Application app, Model model) {
		this.app = app;
		this.model = model;
		initializeView();
		initializeControllers();
	}
	
	private void initializeView(){
		buttonArray = new JButton[15];
		for (int i = 0; i < 15; i++){
			buttonArray[i] = new JButton(""+(i+1));
			int x_pos = 50 + 70 * (i % 6);
			int y_pos = 82 + 70 * (i / 6);
			buttonArray[i].setBounds(x_pos, y_pos, 70, 70);
			add(buttonArray[i]);
		}
		btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnMainMenu.setBounds(545, 100, 175, 52);
		add(btnMainMenu);
	}

	private void initializeControllers(){
		buttonArray[0].addMouseListener(new EditPuzzleController(this.app, this.model, 1));
		buttonArray[1].addMouseListener(new EditLightningController(this.app, this.model, 2));
		buttonArray[2].addMouseListener(new EditThemeController(this.app, this.model, 3));
		buttonArray[3].addMouseListener(new EditPuzzleController(this.app, this.model, 4));
		buttonArray[4].addMouseListener(new EditLightningController(this.app, this.model, 5));
		buttonArray[5].addMouseListener(new EditThemeController(this.app, this.model, 6));
		buttonArray[6].addMouseListener(new EditPuzzleController(this.app, this.model, 7));
		buttonArray[7].addMouseListener(new EditLightningController(this.app, this.model, 8));
		buttonArray[8].addMouseListener(new EditThemeController(this.app, this.model, 9));
		buttonArray[9].addMouseListener(new EditPuzzleController(this.app, this.model, 10));
		buttonArray[10].addMouseListener(new EditLightningController(this.app, this.model, 11));
		buttonArray[11].addMouseListener(new EditThemeController(this.app, this.model, 12));
		buttonArray[12].addMouseListener(new EditPuzzleController(this.app, this.model, 13));
		buttonArray[13].addMouseListener(new EditLightningController(this.app, this.model, 14));
		buttonArray[14].addMouseListener(new EditThemeController(this.app, this.model, 15));
		btnMainMenu.addMouseListener(new ToMainMenuController(this.app, this.model));
	}
}