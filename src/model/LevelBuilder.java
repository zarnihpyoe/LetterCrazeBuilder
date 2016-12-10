package model;

public abstract class LevelBuilder {
	
	protected BoardBuilder bb;
	protected ScoreBoardBuilder sbb;
	
	public LevelBuilder(BoardBuilder bb, ScoreBoardBuilder sbb) {
		this.bb = bb;
		this.sbb = sbb;
	}
	
	//public abstract Level build();
	
}
