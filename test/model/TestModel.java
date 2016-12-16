package model;

import junit.framework.TestCase;

public class TestModel extends TestCase {
	
	LevelBuilder lb;
	
	@Override
	protected void setUp() {
		lb = new PuzzleBuilder(new BoardBuilder(), new ScoreBoardBuilder());
	}
	
	@Override
	protected void tearDown() {
		
	}
	
	public void testModel() {
		Model m = new Model();
		assertEquals(null, m.getBuilder());
		
		m.assignBuilder(lb);
		assertEquals(lb, m.getBuilder());
		
		m.resetBuilder();
		assertEquals(null, m.getBuilder());
		
		
	}
	
}
