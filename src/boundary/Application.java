package boundary;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

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
		frame.revalidate();
	}
	
	public boolean modifyFrameSize(int x, int y, int width, int height){
		try{
			frame.setBounds(x, y, width, height);
		}
		catch (Exception e){
			return false;
		}
		return true;		
	}
	
	public JPanel getCurrentPanel(){
		return (JPanel) this.frame.getContentPane();
	}
	
	public void displayMainMenu(){
    	MainMenuPanel menuView = new MainMenuPanel(this, m);
		switchPanel(menuView);
		modifyFrameSize(100, 100, 600, 500);
		frame.setVisible(true);
	}
	
	
	public static void main (String []args) {		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {		
				Model m = new Model();	
				Application window = new Application(m);
				BuilderSplashPanel splashView = new BuilderSplashPanel(window);
				window.frame.setLocationRelativeTo(null);
				window.switchPanel(splashView);
				window.modifyFrameSize(100, 100, 718, 445);
				
			}
		});
	}
	
}
