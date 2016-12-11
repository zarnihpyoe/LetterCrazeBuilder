import junit.framework.TestCase;

import model.BoardBuilder;
import model.Level;
import model.LevelParser;
import model.PuzzleBuilder;
import model.ScoreBoardBuilder;

public class TestLevelParser extends TestCase {
	
	Level level;
	
	@Override
	protected void setUp() {
		BoardBuilder bb = new BoardBuilder();
		ScoreBoardBuilder sbb = new ScoreBoardBuilder()
				.setScoreFor(ScoreBoardBuilder.FIRST_STAR, 10)
				.setScoreFor(ScoreBoardBuilder.SECOND_STAR, 20)
				.setScoreFor(ScoreBoardBuilder.THIRD_STAR, 30);
		
		level = new PuzzleBuilder(bb, sbb)
				.setWordLimit(50)
				.setLvl(1)
				.build();
	}

	@Override
	protected void tearDown() {
		
	}
	
	public void testCreateLevelFile() {
		LevelParser.createLevelFile(level);
	}
	
}
