package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import boundary.Application;
import boundary.LightningBuilderPanel;
import boundary.PuzzleBuilderPanel;
import model.BoardBuilder;
import model.LightningBuilder;
import model.Model;
import model.PuzzleBuilder;
import model.ScoreBoardBuilder;

public class EditLightningController extends MouseAdapter {
	Application app;
	Model model;
	int lvl;
	Scanner sc;

	public EditLightningController(Application a, Model m, int lvl) {
		this.app = a;
		this.model = m;
		this.lvl = lvl;
	}

	@Override
	public void mousePressed(MouseEvent me) {
		// Initiate new score board builder and board builder
		ScoreBoardBuilder scoreBoard = new ScoreBoardBuilder();
		BoardBuilder board = new BoardBuilder();

		// Initiate new Lightning builder and lightning view
		LightningBuilder lightBuilder = new LightningBuilder(board, scoreBoard);
		LightningBuilderPanel lightView = new LightningBuilderPanel(this.model, this.app);

		try {
			StringFileIterator(new File (lvl+".txt"));
		} catch (FileNotFoundException e) {
			System.out.println("This file doesn't exist you fool.");
		}

		String[][] levelBoard = new String[6][6];

		next();

		// The counter to keep track of number of the button that should be selected 
		int j=0;

		String row1 = next(); //000000
		for(int i=0; i<6; i++, j++) { 
			if (row1.charAt(i) == '0') {
				lightView.setSelectedTiles(j);
			}
		}
		String row2 = next(); //******
		for(int i=0; i<6; i++, j++){
			if (row2.charAt(i) == '0') {
				lightView.setSelectedTiles(j);
			}
		}
		String row3 = next();
		for(int i=0; i<6; i++, j++){
			if (row3.charAt(i) == '0') {
				lightView.setSelectedTiles(j);
			}
		}
		String row4 = next();
		for(int i=0; i<6; i++, j++){
			if (row4.charAt(i) == '0') {
				lightView.setSelectedTiles(j);
			}
		}
		String row5 = next();	
		for(int i=0; i<6; i++, j++){
			if (row5.charAt(i) == '0') {
				lightView.setSelectedTiles(j);
			}
		}
		String row6 = next();
		for(int i=0; i<6; i++, j++){
			if (row6.charAt(i) == '0') {
				lightView.setSelectedTiles(j);
			}
		}

		int time = Integer.parseInt(next());
		int thresh1 = Integer.parseInt(next());
		int thresh2 = Integer.parseInt(next());
		int thresh3 = Integer.parseInt(next());

		// Assign lightning builder status to model
		this.model.assignBuilder(lightBuilder);

		// We want to call some method on current application that will switch to just created 
		// puzzle view
		app.modifyFrameSize(100, 100, 750, 575);
		app.switchPanel(lightView);

		lightView.setLevelNumber(lvl);
		lightView.setTimer(time);
		lightView.setOneStar(thresh1);
		lightView.setTwoStar(thresh2);
		lightView.setThreeStar(thresh3);	

		lightView.validate();

	}

	public void StringFileIterator(File f) throws FileNotFoundException {
		sc = new Scanner(f);
	}

	public String next() throws NoSuchElementException {

		if (sc == null) {
			throw new NoSuchElementException ("End of file reached.");
		}

		String s = sc.nextLine();
		System.out.println(s);

		if (!sc.hasNextLine()) {
			sc.close();
			sc = null;
		}
		return s;
	}
}