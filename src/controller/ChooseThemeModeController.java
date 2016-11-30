package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import boundary.*;
import model.*;


public class ChooseThemeModeController extends MouseAdapter {
	Application app;
    Model model;
	
	public ChooseThemeModeController(Application a, Model m) {
		this.app = a;
		this.model = m;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		
		// Initiate new score board builder and board builder
		ScoreBoardBuilder scoreBoard = new ScoreBoardBuilder();
		BoardBuilder board = new BoardBuilder();
		
		// Initiate new Lightning builder and lightning view
		ThemeBuilder themeBuilder = new ThemeBuilder(board, scoreBoard);
		ThemeBuilderPanel themeView = new ThemeBuilderPanel(this.app, this.model);
		
		// Assign lightning builder status to model
		this.model.assignBuilder(themeBuilder);
		
		// We want to call some method on current application that will switch to just created 
		// theme view
		app.modifyFrameSize(100, 100, 750, 575);
		app.switchPanel(themeView);
		
	}
}