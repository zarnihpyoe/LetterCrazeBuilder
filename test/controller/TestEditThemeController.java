package controller;

import boundary.Application;
import boundary.PuzzleBuilderPanel;
import junit.framework.TestCase;
import model.BoardBuilder;
import model.LevelBuilder;
import model.Model;
import model.PuzzleBuilder;
import model.ScoreBoardBuilder;

public class TestEditThemeController extends TestCase{
	Model m;
	Application app;
	EditThemeController ec;

	@Override
	protected void setUp() {
		m = new Model();
		app = new Application(m);
		ec = new EditThemeController(app, m, 3);
	}
	
	@Override
	protected void tearDown() {
		
	}
	
	public void testEditThemeLevel() {
		ec.mousePressed(null);
		assertEquals(3, ec.lvl);
	}

}

