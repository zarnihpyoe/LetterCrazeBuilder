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
	
	
	public static void main (String []args) {		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Model m = new Model();
				try {
					Application window = new Application(m);
					MainMenuPanel menuView = new MainMenuPanel(window, m);
					window.switchPanel(menuView);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	

}
