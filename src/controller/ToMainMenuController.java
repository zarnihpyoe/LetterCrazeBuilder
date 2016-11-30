package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import boundary.Application;
import model.Model;


public class ToMainMenuController extends MouseAdapter {
	Application app;
	Model model;
	
	public ToMainMenuController(Application a, Model m) {
		this.app = a;
		this.model = m;
	}
	

}
