package model;

import junit.framework.TestCase;

public class TestLevelBuilder extends TestCase {
	
	LevelBuilder lb;
	BoardBuilder bb;
	ScoreBoardBuilder sbb;
	
	@Override
	protected void setUp() {
		bb = new BoardBuilder();
		sbb = new ScoreBoardBuilder();
	}
	
	@Override
	protected void tearDown() {
		
	}
	
	public void testPuzzleBuilder() {
		lb = new PuzzleBuilder(bb, sbb);
	}
	
	public void testLightningBuilder() {
		lb = new LightningBuilder(bb, sbb);
	}
	
	public void testThemeBuilder() {
		lb = new ThemeBuilder(bb, sbb);
	}
	
}
