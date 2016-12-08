package controller;

import java.awt.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
	
	SaveLevelController(Application app, Model model) {
		this.app = app;
		this.model = model;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
//		public static void writeFile2() throws IOException {
//			FileWriter fw = new FileWriter("out.txt");
//		 
//			for (int i = 0; i < 10; i++) {
//				fw.write("something");
//			}
//		 
//			fw.close();
//		}
//		
	}
	

}
