package model;

public abstract class LevelBuilder {
	
	protected int lvl;
	protected BoardBuilder bb;
	protected ScoreBoardBuilder sbb;
	
	public LevelBuilder(BoardBuilder bb, ScoreBoardBuilder sbb) {
		this.bb = bb;
		this.sbb = sbb;
	}
	

//	public abstract Level build();
//
//	public LevelBuilder setLvl(int lvl) {
//		this.lvl = lvl;
//		return this;
//	}

	
}
