package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import boundary.Application;
import boundary.EditLevelMenu;
import boundary.PreviewWindowPanel;
import model.Model;

public class EditLevelButtonController extends MouseAdapter{
	Application app;
	Model model;

	public EditLevelButtonController(Application app, Model model) {
		this.app = app;
		this.model = model;
	}

	@Override
	public void mousePressed(MouseEvent me) {
		EditLevelMenu el = new EditLevelMenu(this.app, this.model);
		
		app.modifyFrameSize(100, 100, 750, 575);
		this.app.switchPanel(el);
	}

}
