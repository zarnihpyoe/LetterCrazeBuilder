package boundary;

import junit.framework.TestCase;
import model.Model;

public class TestDeleteLevelPanel extends TestCase {
	Model m;
	Application app;
	
	@Override
	protected void setUp() {
		m = new Model();
		app = new Application(m);
	}
	
	@Override
	protected void tearDown() {
		
	}
	
	public void testDeleteLevel() {
		DeleteLevelPanel dlp = new DeleteLevelPanel(app, m);
	}
	
	

}
