package boundary;

import javax.swing.JPanel;

import model.Board;
import model.Model;

public class PreviewWindowPanel extends JPanel {
	Application app;
	Model model;
	Board board;
	
	public PreviewWindowPanel(Application app, Model model) {
		this.app = app;
		this.model = model;
		initialize();
	}
	
	public void initialize(){
		initializeViews();
	}
	
	public void initializeViews() {
		setLayout(null);
		

	}

	
	
	
	
	
	
	
	
	

}
