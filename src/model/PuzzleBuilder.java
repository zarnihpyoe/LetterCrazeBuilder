package model;
 
/**
* <h1>PuzzleBuilder class</h1>
* <p> The class for the puzzlebuilder mode
* <b>Note:</b> holds the word limit 
*
* @author  Palladium
* @since   2016-12-15
*/
public class PuzzleBuilder extends LevelBuilder{
    protected int wordLimit;
     
    /**
     * The constructor for the PuzzleBuilder 
     * @param bb BoardBuilder The board builder that is inherited from the level builder super class
     * @param sbb ScoreBoardBuilder The scoreboard buiulder that is inherited from the level builder from the 
     */
    public PuzzleBuilder(BoardBuilder bb, ScoreBoardBuilder sbb) {
        super(bb, sbb);
    }
     
}
