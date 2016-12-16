package controller;

import boundary.Application;
import boundary.PuzzleBuilderPanel;
import junit.framework.TestCase;
import model.BoardBuilder;
import model.LevelBuilder;
import model.Model;
import model.PuzzleBuilder;
import model.ScoreBoardBuilder;

public class TestEditLightningController extends TestCase {

	Model m;
	Application app;

	EditLightningController ec;

	@Override
	protected void setUp() {
		m = new Model();
		app = new Application(m);
		ec = new EditLightningController(app, m, 2);
	}

	@Override
	protected void tearDown() {

	}

	public void testEditLightningController() {
		ec.mousePressed(null);
		assertEquals(2, ec.lvl);
	}


}



