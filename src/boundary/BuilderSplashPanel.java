package boundary;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import javax.swing.JLabel;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.ImageIcon;

public class BuilderSplashPanel extends JPanel {
	
	Application a;

	/**
	 * Create the panel.
	 */
	public BuilderSplashPanel(Application a) {
		this.a = a;
		setLayout(null);
		
		String soundName = "/resourses/yay.wav";    
		
		
		try {
			AudioInputStream audioInputStream = 
					AudioSystem.getAudioInputStream(BuilderSplashPanel.class.getResource("/resources/yay.wav"));
			Clip clip;
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		}
		catch (Exception e){
			System.out.println(e);
		}
		
		
		JLabel lblNewLabel = new JLabel("test");
		lblNewLabel.setIcon(new ImageIcon(BuilderSplashPanel.class.getResource("/resources/builder_splash.png")));
		lblNewLabel.setBounds(0, 0, 700, 400);
		add(lblNewLabel);
		
		a.frame.setVisible(true);
        //toFront();
		new ResourceLoader().execute();
		
    }

    public class ResourceLoader extends SwingWorker<Object, Object> {

        protected Object doInBackground() throws Exception {

            // Wait a little while, maybe while loading resources
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }

            return null;

        }

        @Override
        protected void done() {
        	a.frame.setVisible(false);
        	a.displayMainMenu();
        }


    }

}
