package boundary;

import junit.framework.TestCase;
import model.Model;

public class TestEditLevelMenu extends TestCase {

	Application app;
	Model m;
	
	@Override
	protected void setUp() {
		m = new Model();
		app = new Application(m);
	}
	
	@Override
	protected void tearDown() {
		
	}
	
	public void testEditLevel() {
		EditLevelMenu elm = new EditLevelMenu(app, m);
	}
	
}
