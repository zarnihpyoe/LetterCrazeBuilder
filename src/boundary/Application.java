package boundary;

public class Application {
	AbsBuilderGUI currentGUI;
	
	public void initializeGUI(){
		this.currentGUI.initializeViews();
		this.currentGUI.initializeControllers();
	}

}
