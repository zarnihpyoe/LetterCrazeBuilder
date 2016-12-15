package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import boundary.*;
import model.*;


public class DeleteLevelButtonController extends MouseAdapter {
	Application app;
    Model model;
	
	public DeleteLevelButtonController(Application a, Model m) {
		this.app = a;
		this.model = m;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		
		// Create a new DeleteLevelMenu
		DeleteLevelPanel dl = new DeleteLevelPanel(this.app, this.model);
		
		// We want to call some method on current application that will switch to just created 
		// theme view
		app.modifyFrameSize(100, 100, 750, 575);
		app.switchPanel(dl);
		
	}
}