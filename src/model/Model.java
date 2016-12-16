package model;
 
/**
* <h1>Model class</h1>
* <p> The class for the model that can be assigned LevelBuilder, reset the builder level
* and  get the current builder
* <b>Note:</b> holds null LevelBuilder initially
*
* @author  Palladium
* @since   2016-12-15
*/
public class Model {
 
    private LevelBuilder currentBuilder;
     
    /**
     * The constructor for the Model class
     * holds the null level builder by default
     */
    public Model() {
        this.currentBuilder = null;
    }
     
    /** 
     * The method to assign the builder level
     * @param newBuilder The level builder to be assigned
     */
    public void assignBuilder(LevelBuilder newBuilder) {
        this.currentBuilder = newBuilder;
    }
     
    /**
     * The method to reset the level builder stored in the model
     */
    public void resetBuilder() {
        this.currentBuilder = null;
    }
     
    /**
     * The method to get the current builder 
     * @return LevelBuilder The level builder field 
     */
    public LevelBuilder getBuilder(){
        return this.currentBuilder;
    }
     
     
     
}
