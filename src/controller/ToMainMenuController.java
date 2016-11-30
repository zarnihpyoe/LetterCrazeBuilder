package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import boundary.Application;
import boundary.MainMenuPanel;
import model.Model;


public class ToMainMenuController extends MouseAdapter {
	Application app;
	Model model;
	
	public ToMainMenuController(Application a, Model m) {
		this.app = a;
		this.model = m;
	}
	
	public void mousePressed(MouseEvent me){
		MainMenuPanel menuView = new MainMenuPanel(this.app, this.model);
		model.resetBuilder();
		app.switchPanel(menuView);
	}
	

}
