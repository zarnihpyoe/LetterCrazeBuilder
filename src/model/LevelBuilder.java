package model;
 
/**
* <h1>LevelBuilder class</h1>
* <p>
* <b>Note:</b> lvl holds information about the level number
*
* @author  Palladium
* @since   2016-12-15
*/
public abstract class LevelBuilder {
    protected int lvl;
    protected BoardBuilder bb;
    protected ScoreBoardBuilder sbb;
     
    /**
     * The constructor for Level Builder
     * @param bb BoardBuilder 
     * @param sbb ScoreBoardBuilder
     */
    public LevelBuilder(BoardBuilder bb, ScoreBoardBuilder sbb) {
        this.bb = bb;
        this.sbb = sbb;
    }
     
}
