package boundary;
import java.awt.EventQueue;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;

import model.Model;
import javax.swing.JToggleButton;

public class ThemeBuilderPanel extends JPanel{
	
	private Application a;
	private Model m;

	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	JLabel lblPuzzle;
	JLabel lblLevel;
	JButton btnMainMenu;
	JLabel lblTheme;
	JLabel lblListOfWords;
	JButton but_Prev;
	JButton but_Save;
	//JToggleButton[] toggleButtonArray;
	
	JToggleButton toggleButton;
	JToggleButton toggleButton_1;
	JToggleButton toggleButton_2;
	JToggleButton toggleButton_3;
	JToggleButton toggleButton_4;
	JToggleButton toggleButton_5;
	JToggleButton toggleButton_6;
	JToggleButton toggleButton_7;
	JToggleButton toggleButton_8;
	JToggleButton toggleButton_9;
	JToggleButton toggleButton_10;
	JToggleButton toggleButton_11;
	JToggleButton toggleButton_12;
	JToggleButton toggleButton_13;
	JToggleButton toggleButton_14;
	JToggleButton toggleButton_15;
	JToggleButton toggleButton_16;
	JToggleButton toggleButton_17;
	JToggleButton toggleButton_18;
	JToggleButton toggleButton_19;
	JToggleButton toggleButton_20;
	JToggleButton toggleButton_21;
	JToggleButton toggleButton_22;
	JToggleButton toggleButton_23;
	JToggleButton toggleButton_24;
	JToggleButton toggleButton_25;
	JToggleButton toggleButton_26;
	JToggleButton toggleButton_27;
	JToggleButton toggleButton_28;
	JToggleButton toggleButton_29;
	JToggleButton toggleButton_30;
	JToggleButton toggleButton_31;
	JToggleButton toggleButton_32;
	JToggleButton toggleButton_33;
	JToggleButton toggleButton_34;
	JToggleButton toggleButton_35;
	
	


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
		
		toggleButton = new JToggleButton("");
		toggleButton.setBounds(25, 62, 70, 70);
		add(toggleButton);
		
		JToggleButton toggleButton_1 = new JToggleButton("");
		toggleButton_1.setBounds(95, 62, 70, 70);
		add(toggleButton_1);
		
		toggleButton_2 = new JToggleButton("");
		toggleButton_2.setBounds(165, 62, 70, 70);
		add(toggleButton_2);
		
		toggleButton_3 = new JToggleButton("");
		toggleButton_3.setBounds(165, 131, 70, 70);
		add(toggleButton_3);
		
		toggleButton_4 = new JToggleButton("");
		toggleButton_4.setBounds(95, 131, 70, 70);
		add(toggleButton_4);
		
		toggleButton_5 = new JToggleButton("");
		toggleButton_5.setBounds(25, 131, 70, 70);
		add(toggleButton_5);
		
		toggleButton_6 = new JToggleButton("");
		toggleButton_6.setBounds(25, 200, 70, 70);
		add(toggleButton_6);
		
		toggleButton_7 = new JToggleButton("");
		toggleButton_7.setBounds(95, 200, 70, 70);
		add(toggleButton_7);
		
		toggleButton_8 = new JToggleButton("");
		toggleButton_8.setBounds(165, 200, 70, 70);
		add(toggleButton_8);
		
		toggleButton_9 = new JToggleButton("");
		toggleButton_9.setBounds(235, 200, 70, 70);
		add(toggleButton_9);
		
		toggleButton_10 = new JToggleButton("");
		toggleButton_10.setBounds(305, 200, 70, 70);
		add(toggleButton_10);
		
		toggleButton_11 = new JToggleButton("");
		toggleButton_11.setBounds(375, 200, 70, 70);
		add(toggleButton_11);
		
		toggleButton_12 = new JToggleButton("");
		toggleButton_12.setBounds(375, 131, 70, 70);
		add(toggleButton_12);
		
		 toggleButton_13 = new JToggleButton("");
		toggleButton_13.setBounds(305, 131, 70, 70);
		add(toggleButton_13);
		
		 toggleButton_14 = new JToggleButton("");
		toggleButton_14.setBounds(235, 131, 70, 70);
		add(toggleButton_14);
		
		 toggleButton_15 = new JToggleButton("");
		toggleButton_15.setBounds(235, 62, 70, 70);
		add(toggleButton_15);
		
		 toggleButton_16 = new JToggleButton("");
		toggleButton_16.setBounds(305, 62, 70, 70);
		add(toggleButton_16);
		
		 toggleButton_17 = new JToggleButton("");
		toggleButton_17.setBounds(375, 62, 70, 70);
		add(toggleButton_17);
		
		 toggleButton_18 = new JToggleButton("");
		toggleButton_18.setBounds(375, 269, 70, 70);
		add(toggleButton_18);
		
		 toggleButton_19 = new JToggleButton("");
		toggleButton_19.setBounds(305, 269, 70, 70);
		add(toggleButton_19);
		
		 toggleButton_20 = new JToggleButton("");
		toggleButton_20.setBounds(165, 269, 70, 70);
		add(toggleButton_20);
		
		 toggleButton_21 = new JToggleButton("");
		toggleButton_21.setBounds(235, 269, 70, 70);
		add(toggleButton_21);
		
		 toggleButton_22 = new JToggleButton("");
		toggleButton_22.setBounds(235, 339, 70, 70);
		add(toggleButton_22);
		
		 toggleButton_23 = new JToggleButton("");
		toggleButton_23.setBounds(95, 339, 70, 70);
		add(toggleButton_23);
		
		 toggleButton_24 = new JToggleButton("");
		toggleButton_24.setBounds(165, 339, 70, 70);
		add(toggleButton_24);
		
		 toggleButton_25 = new JToggleButton("");
		toggleButton_25.setBounds(95, 269, 70, 70);
		add(toggleButton_25);
		
		 toggleButton_26 = new JToggleButton("");
		toggleButton_26.setBounds(25, 269, 70, 70);
		add(toggleButton_26);
		
		 toggleButton_27 = new JToggleButton("");
		toggleButton_27.setBounds(25, 408, 70, 70);
		add(toggleButton_27);
		
		 toggleButton_28 = new JToggleButton("");
		toggleButton_28.setBounds(25, 339, 70, 70);
		add(toggleButton_28);
		
		 toggleButton_29 = new JToggleButton("");
		toggleButton_29.setBounds(95, 408, 70, 70);
		add(toggleButton_29);
		
		 toggleButton_30 = new JToggleButton("");
		toggleButton_30.setBounds(165, 408, 70, 70);
		add(toggleButton_30);
		
		 toggleButton_31 = new JToggleButton("");
		toggleButton_31.setBounds(235, 408, 70, 70);
		add(toggleButton_31);
		
		 toggleButton_32 = new JToggleButton("");
		toggleButton_32.setBounds(375, 339, 70, 70);
		add(toggleButton_32);
		
		 toggleButton_33 = new JToggleButton("");
		toggleButton_33.setBounds(305, 339, 70, 70);
		add(toggleButton_33);
		
		 toggleButton_34 = new JToggleButton("");
		toggleButton_34.setBounds(305, 408, 70, 70);
		add(toggleButton_34);
		
		 toggleButton_35 = new JToggleButton("");
		toggleButton_35.setBounds(375, 408, 70, 70);
		add(toggleButton_35);
		
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
		
	}
}