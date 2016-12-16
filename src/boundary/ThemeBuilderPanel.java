package boundary;
import java.awt.EventQueue;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;

import model.Model;
import javax.swing.JToggleButton;

import controller.PreviewLevelController;
import controller.SaveLevelController;
import controller.ToMainMenuController;
import model.*;

public class ThemeBuilderPanel extends JPanel{
	
	public Application a;
	public Model m;

	public JTextField textField;
	public JTextField textField_4;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	JLabel lblPuzzle;
	JLabel lblLevel;
	JButton btnMainMenu;
	JLabel lblTheme;
	JLabel lblListOfWords;
	JButton but_Prev;
	JButton but_Save;
	JToggleButton[] toggleButtonArray;


	/**
	 * Create the application.
	 */
	public ThemeBuilderPanel(Application a, Model m) {
		initialize(a, m);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Application a, Model m) {
		this.a = a;
		this.m = m;
		initializeView();
		initializeControllers();
	}
	
	public void initializeView(){
		
		this.setLayout(null);
		
		toggleButtonArray = new JToggleButton[36];
		for (int i = 0; i < 36; i++){
			toggleButtonArray[i] = new JToggleButton("");
			int x_pos = 20 + 70 * (i % 6);
			int y_pos = 62 + 70 * (i / 6);
			toggleButtonArray[i].setBounds(x_pos, y_pos, 70, 70);
			add(toggleButtonArray[i]);
		}
		
		lblPuzzle = new JLabel("Theme");
		lblPuzzle.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblPuzzle.setBounds(25, 13, 107, 36);
		add(lblPuzzle);
		
		btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnMainMenu.setBounds(545, 13, 175, 52);
		add(btnMainMenu);
		
		lblLevel = new JLabel("Level:");
		lblLevel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblLevel.setBounds(500, 115, 70, 28);
		add(lblLevel);
		
		lblTheme = new JLabel("Theme:");
		lblTheme.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblTheme.setBounds(490, 156, 70, 28);
		add(lblTheme);
		
		textField = new JTextField();
		textField.setBounds(570, 118, 100, 25);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(490, 255, 201, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(490, 292, 201, 22);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(490, 327, 201, 22);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(570, 159, 100, 25);
		add(textField_4);
		
		lblListOfWords = new JLabel("List of Words:");
		lblListOfWords.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblListOfWords.setBounds(520, 214, 150, 28);
		add(lblListOfWords);
		
		
		but_Prev = new JButton("Preview");
		but_Prev.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		but_Prev.setBounds(528, 393, 130, 36);
		add(but_Prev);
		
		but_Save = new JButton("Save");
		but_Save.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		but_Save.setBounds(534, 442, 118, 36);
		add(but_Save);
	}
	
	public void initializeControllers(){
		btnMainMenu.addMouseListener(new ToMainMenuController(this.a, this.m));
		but_Save.addMouseListener(new SaveLevelController(this.a, this.m));
		but_Prev.addMouseListener(new PreviewLevelController(this.a, this.m));
	}
	
	public JTextField getLevelNumber() {
		return this.textField;
	}
	
	public JTextField getTheme() {
		return this.textField_4;
	}
	
	public JTextField getWord1() {
		return this.textField_1;
	}
	
	public JTextField getWord2() {
		return this.textField_2;
	}
	
	public JTextField getWord3() {
		return this.textField_3;
	}
	
	public boolean getBoardShape(int butNum) {
		return toggleButtonArray[butNum].isSelected();
	}

	// Mark tile at position i as selected 
	public void setSelectedTiles(int i) {
		toggleButtonArray[i].setSelected(true);
	}

	public void setLevelNumber(int lvl) {
		this.textField.setText(lvl+"");
		repaint();
	}

	public void setTheme(String theme) {
		this.textField_4.setText(theme+"");
	}

	public void setWord1(String word1) {
		this.textField_1.setText(word1+"");
	}

	public void setWord2(String word2) {
		this.textField_2.setText(word2+"");
	}

	public void setWord3(String word3) {
		this.textField_3.setText(word3+"");
	}
}
