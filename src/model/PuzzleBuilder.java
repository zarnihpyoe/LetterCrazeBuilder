package model;

public class PuzzleBuilder extends LevelBuilder{

	protected int wordLimit;
	
	public PuzzleBuilder(BoardBuilder bb, ScoreBoardBuilder sbb) {
		super(bb, sbb);
	}
	
	@Override
	public Level build() {
		Puzzle level = new Puzzle(lvl, bb.build(), sbb.build(), wordLimit); 
		return level;
	}
	
	public PuzzleBuilder setWordLimit(int wordLimit) {
		this.wordLimit = wordLimit;
		return this;
	}

}
