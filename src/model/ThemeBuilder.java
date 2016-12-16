package model;
import java.util.ArrayList;
 
/**
* <h1>ThemeBuilder class</h1>
* <p> The class to hold information about the scoreboard builder
* <b>Note:</b> holds the theme name and the wordlist consisting of 3 words
*
* @author  Palladium
* @since   2016-12-15
*/
public class ThemeBuilder extends LevelBuilder{
     
    private String theme;
    private ArrayList<String> wordList;
     
    /**
     * The constructor for theme builder
     * @param bb The Board Builder that is inherited from the level builder super class
     * @param sbb The Score board builder that is inherited from the level builder super class
     */
    public ThemeBuilder(BoardBuilder bb, ScoreBoardBuilder sbb) {
        super(bb, sbb);
    }
 
}
