package controller;

import java.awt.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;

import boundary.*;
import model.*;

public class SaveLevelController extends MouseAdapter{
	Application app;
	Model model;

	public SaveLevelController(Application app, Model model) {
		this.app = app;
		this.model = model;
	}

	@Override
	public void mousePressed(MouseEvent me) {

		if (model.getBuilder() instanceof PuzzleBuilder) {
			String levelNumber = ((PuzzleBuilderPanel) this.app.getCurrentPanel()).getLevelNumber().getText();
			String wordLimit = ((PuzzleBuilderPanel) this.app.getCurrentPanel()).getLimit().getText();
			String forOneStar = ((PuzzleBuilderPanel) this.app.getCurrentPanel()).getForOneStar().getText();
			String forTwoStar = ((PuzzleBuilderPanel) this.app.getCurrentPanel()).getForTwoStar().getText();
			String forThreeStar = ((PuzzleBuilderPanel) this.app.getCurrentPanel()).getForThreeStar().getText();

			try {

				File file = new File("".concat(levelNumber).concat(".txt"));

				if (file.createNewFile()){
					System.out.println("File is created!");
				}else{
					System.out.println("File already exists.");
				}

				// creates a FileWriter Object
				FileWriter writer = new FileWriter(file); 

				// Writes the content to the file
				writer.write(levelNumber+"\n"); 
				// The indexes of the buttons that should form the shape of the board
				for (int i=0; i<36; i++) {
					System.out.println(((PuzzleBuilderPanel) this.app.getCurrentPanel()).getBoardShape(i));;
					// If tile is selected, it should be disabled when we construct the new board
					if (((PuzzleBuilderPanel) this.app.getCurrentPanel()).getBoardShape(i)) {
						if ((i+1)%6 == 0) {
							writer.write("0"+"\n");
						} else {
							writer.write("0");
						}
					} else {
						if ((i+1)%6 == 0) {
							writer.write("*"+"\n");
						} else {
							writer.write("*");
						}
					}
				}
				
				writer.write(wordLimit+"\n");
				writer.write(forOneStar+"\n");
				writer.write(forTwoStar+"\n");
				writer.write(forThreeStar+"\n");
				writer.flush();
				writer.close();



			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		else if (model.getBuilder() instanceof LightningBuilder) {
			String levelNumber = ((LightningBuilderPanel) this.app.getCurrentPanel()).getLevelNumber().getText();
			String timer = ((LightningBuilderPanel) this.app.getCurrentPanel()).getTimer().getText();
			String forOneStar = ((LightningBuilderPanel) this.app.getCurrentPanel()).getForOneStar().getText();
			String forTwoStar = ((LightningBuilderPanel) this.app.getCurrentPanel()).getForTwoStar().getText();
			String forThreeStar = ((LightningBuilderPanel) this.app.getCurrentPanel()).getForThreeStar().getText();
			
			try {

				File file = new File("".concat(levelNumber).concat(".txt"));

				if (file.createNewFile()){
					System.out.println("File is created!");
				}else{
					System.out.println("File already exists.");
				}

				// creates a FileWriter Object
				FileWriter writer = new FileWriter(file); 

				// Writes the content to the file
				writer.write(levelNumber+"\n");
				
				// The indexes of the buttons that should form the shape of the board
				for (int i=0; i<36; i++) {
					System.out.println(((LightningBuilderPanel) this.app.getCurrentPanel()).getBoardShape(i));;
					// If tile is selected, it should be disabled when we construct the new board
					if (((LightningBuilderPanel) this.app.getCurrentPanel()).getBoardShape(i)) {
						if ((i+1)%6 == 0) {
							writer.write("0"+"\n");
						} else {
							writer.write("0");
						}
					} else {
						if ((i+1)%6 == 0) {
							writer.write("*"+"\n");
						} else {
							writer.write("*");
						}
					}
				}

				writer.write(timer+"\n");
				writer.write(forOneStar+"\n");
				writer.write(forTwoStar+"\n");
				writer.write(forThreeStar+"\n");
				writer.flush();
				writer.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		else if (model.getBuilder() instanceof ThemeBuilder) {
			String levelNumber = ((ThemeBuilderPanel) this.app.getCurrentPanel()).getLevelNumber().getText();
			String themeName = ((ThemeBuilderPanel) this.app.getCurrentPanel()).getTheme().getText();
			String word1 = ((ThemeBuilderPanel) this.app.getCurrentPanel()).getWord1().getText();
			String word2 = ((ThemeBuilderPanel) this.app.getCurrentPanel()).getWord2().getText();
			String word3 = ((ThemeBuilderPanel) this.app.getCurrentPanel()).getWord3().getText();

			try {

				File file = new File("c:\\ThemeBuilder".concat(levelNumber).concat(".txt"));

				if (file.createNewFile()){
					System.out.println("File is created!");
				}else{
					System.out.println("File already exists.");
				}

				// creates a FileWriter Object
				FileWriter writer = new FileWriter(file); 

				// Writes the content to the file
				writer.write(levelNumber+"\n");
				
				// The indexes of the buttons that should form the shape of the board
				for (int i=0; i<36; i++) {
					System.out.println(((ThemeBuilderPanel) this.app.getCurrentPanel()).getBoardShape(i));;
					// If tile is selected, it should be disabled when we construct the new board
					if (((ThemeBuilderPanel) this.app.getCurrentPanel()).getBoardShape(i)) {
						if ((i+1)%6 == 0) {
							writer.write("0"+"\n");
						} else {
							writer.write("0");
						}
					} else {
						if ((i+1)%6 == 0) {
							writer.write("*"+"\n");
						} else {
							writer.write("*");
						}
					}
				}
				
				writer.write(themeName+"\n");
				writer.write(word1+"\n");
				writer.write(word2+"\n");
				writer.write(word3+"\n");
				writer.flush();
				writer.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	MainMenuPanel menuView = new MainMenuPanel(this.app, this.model);
	this.model.resetBuilder();
	
	app.modifyFrameSize(100, 100, 600, 500);
	app.switchPanel(menuView);
	
	}
}



