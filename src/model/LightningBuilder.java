package model;
 
/**
* <h1>LightningBuilder class</h1>
* <p> The class for Lightning builder mode
* <b>Note:</b> The time is in seconds
*
* @author  Palladium
* @since   2016-12-15
*/
public class LightningBuilder extends LevelBuilder {
 
    private int time; 
    /** 
     * LightningBuilder constructor
     * @param bb BoardBuilder
     * @param sbb ScoreBoardBuilder
     */
    public LightningBuilder(BoardBuilder bb, ScoreBoardBuilder sbb) {
        super(bb, sbb);
    }
 
}
