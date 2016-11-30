package boundary;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class BuilderSplashPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BuilderSplashPanel() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("test");
		lblNewLabel.setIcon(new ImageIcon(BuilderSplashPanel.class.getResource("/resources/builder_splash.png")));
		lblNewLabel.setBounds(0, 0, 700, 400);
		add(lblNewLabel);

	}
}
