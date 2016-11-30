package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import boundary.*;
import model.*;


public class ChoosePuzzleModeController extends MouseAdapter {
	Application app;
    Model model;
	
	public ChoosePuzzleModeController(Application a, Model m) {
		this.app = a;
		this.model = m;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		
		// Initiate new score board builder and board builder
		ScoreBoardBuilder scoreBoard = new ScoreBoardBuilder();
		BoardBuilder board = new BoardBuilder();
		
		// Initiate new Lightning builder and lightning view
		PuzzleBuilder puzzleBuilder = new PuzzleBuilder(board, scoreBoard);
		PuzzleBuilderPanel puzzleView = new PuzzleBuilderPanel(this.app, this.model);
		
		// Assign lightning builder status to model
		this.model.assignBuilder(puzzleBuilder);
		
		// We want to call some method on current application that will switch to just created 
		// puzzle view
		app.switchPanel(puzzleView);
		
	}
}