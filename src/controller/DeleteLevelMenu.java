package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import boundary.*;
import model.*;

public class DeleteLevelMenu extends MouseAdapter {
	Application app;
	Model model;
	int levelNumber;

	public DeleteLevelMenu(Application app, Model model, int levelNumber){
		this.app = app;
		this.model = model;
		this.levelNumber = levelNumber;
	}

	@Override
	public void mousePressed(MouseEvent me) {
		try{
			String tempFile = levelNumber+".txt";
			//Delete if tempFile exists
			File fileTemp = new File(tempFile);
			if (fileTemp.exists()){
				fileTemp.delete();
			}   
		}catch(Exception e){
			// if any error occurs
			e.printStackTrace();
		}

	}
	
	
	
	
	
	

}
