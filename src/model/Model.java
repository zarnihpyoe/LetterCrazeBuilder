package model;

public class Model {

	private LevelBuilder currentBuilder;
	
	public Model() {
		this.currentBuilder = null;
	}
	
	// To assign new builder to the field
	public void assignBuilder(LevelBuilder newBuilder) {
		this.currentBuilder = newBuilder;
	}
	
	// To reset model to null 
	void resetBuilder() {
		this.currentBuilder = null;
	}
	
	
	
}
