package boundary;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Model;

public class Application {
	JFrame frame;
	Model m;
	
	
	Application(Model m){
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.m = m;
	}
	
	public void switchPanel (JPanel panel){
		frame.setContentPane(panel);
	}
	
	public boolean modifyFrameSize(int a, int b, int c, int d){
		
	}
	

}
