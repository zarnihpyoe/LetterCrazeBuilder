package controller;

import boundary.*;
import junit.framework.TestCase;
import model.BoardBuilder;
import model.LevelBuilder;
import model.Model;
import model.PuzzleBuilder;
import model.ScoreBoardBuilder;

public class TestEditLevelButtonController extends TestCase{

	EditLevelButtonController lbc;
	LevelBuilder lb;

	@Override
	protected void setUp() {
	    Model model = new Model();
		Application app = new Application(model);
		lbc = new EditLevelButtonController(app,model);
		
	}

	@Override
	protected void tearDown() {

	}


	public void testSavePuzzleLevel() {
		EditLevelMenu el = new EditLevelMenu(lbc.app, lbc.model);

		lbc.app.switchPanel(el);
		
	}


}
