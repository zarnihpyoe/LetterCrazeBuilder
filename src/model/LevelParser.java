package model;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class LevelParser {

	public static void createLevelFile(Level level) {

		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
			//mapper.enable(SerializationFeature.INDENT_OUTPUT);
			File file = new File("level" + level.getLvl() +".json");
			file.createNewFile();
			mapper.writeValue(file, level);
		} 
		catch (JsonGenerationException e) {
			e.printStackTrace();
		}
		catch (JsonMappingException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
