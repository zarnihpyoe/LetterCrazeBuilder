package controller;

import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import boundary.Application;
import boundary.LightningBuilderPanel;
import boundary.PuzzleBuilderPanel;
import boundary.ThemeBuilderPanel;
import junit.framework.TestCase;
import model.BoardBuilder;
import model.LevelBuilder;
import model.LightningBuilder;
import model.Model;
import model.PuzzleBuilder;
import model.ScoreBoardBuilder;
import model.ThemeBuilder;

public class TestSaveLevelController extends TestCase {

	SaveLevelController slc;
	LevelBuilder lb;

	@Override
	protected void setUp() {

	}

	@Override
	protected void tearDown() {

	}


	public void testSavePuzzleLevel() {
		lb = new PuzzleBuilder(new BoardBuilder(), new ScoreBoardBuilder());

		Model m = new Model();
		m.assignBuilder(lb);

		Application app = new Application(m);

		PuzzleBuilderPanel panel = new PuzzleBuilderPanel(app, m);
		panel.textField.setText(String.valueOf(1));		// set level
		panel.textField_1.setText(String.valueOf(5));	// set first star
		panel.textField_2.setText(String.valueOf(10));	// set second star
		panel.textField_3.setText(String.valueOf(15));	// set third star
		panel.textFieldW.setText(String.valueOf(3));	// set word limit

		app.switchPanel(panel);
		slc = new SaveLevelController(app, m);

		slc.mousePressed(null);
	}

	public void testSaveLightningLevel() {
		lb = new LightningBuilder(new BoardBuilder(), new ScoreBoardBuilder());

		Model m = new Model();
		m.assignBuilder(lb);

		Application app = new Application(m);

		LightningBuilderPanel panel = new LightningBuilderPanel(m, app);
		panel.textField.setText(String.valueOf(2));		// set level
		panel.textField_1.setText(String.valueOf(2));	// set first star
		panel.textField_2.setText(String.valueOf(3));	// set second star
		panel.textField_3.setText(String.valueOf(4));	// set third star
		panel.textField_4.setText(String.valueOf(10));	// set timer

		app.switchPanel(panel);
		slc = new SaveLevelController(app, m);

		slc.mousePressed(null);
	}

	
	public void testSaveThemeLevel() {
		lb = new ThemeBuilder(new BoardBuilder(), new ScoreBoardBuilder());

		Model m = new Model();
		m.assignBuilder(lb);

		Application app = new Application(m);

		ThemeBuilderPanel panel = new ThemeBuilderPanel(app, m);
		panel.textField.setText(String.valueOf(3));		// set level
		panel.textField_1.setText(String.valueOf("Toyota"));	// set first word
		panel.textField_2.setText(String.valueOf("Porsche"));	// set second word
		panel.textField_3.setText(String.valueOf("Nissan"));	// set third word
		panel.textField_4.setText(String.valueOf("Car"));	// set theme

		app.switchPanel(panel);
		slc = new SaveLevelController(app, m);

		slc.mousePressed(null);
	}
	
}
