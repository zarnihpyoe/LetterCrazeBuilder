package boundary;

import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class PreviewWindowPanel extends JPanel{
	
	private JToggleButton[] toggleButtonArray;

	/**
	 * Create the application.
	 */
	public PreviewWindowPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		initializeView();
		initializeControllers();
	}
	
	private void initializeView(){
		toggleButtonArray = new JToggleButton[36];
		for (int i = 0; i < 36; i++){
			toggleButtonArray[i] = new JToggleButton("");
			int x_pos = 20 + 70 * (i % 6);
			int y_pos = 62 + 70 * (i / 6);
			toggleButtonArray[i].setBounds(x_pos, y_pos, 70, 70);
			add(toggleButtonArray[i]);
		}
	}
	
	private void initializeControllers(){
	}
}
