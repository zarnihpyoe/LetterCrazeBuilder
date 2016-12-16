package controller;

import java.util.Scanner;

import boundary.Application;
import boundary.PuzzleBuilderPanel;
import junit.framework.TestCase;
import model.*;

public class TestEditPuzzleController extends TestCase{
	Model m;
	Application app;
	EditPuzzleController ec;

	@Override
	protected void setUp() {
		m = new Model();
		app = new Application(m);
		ec = new EditPuzzleController(app, m, 1);
	}
	
	@Override
	protected void tearDown() {
		
	}	
	public void testEditPuzzleController() {
		ec.mousePressed(null);
		assertEquals(1, ec.lvl);
	}

}
