package model;

public class LightningBuilder extends LevelBuilder {

	private int time; // in seconds
	
	public LightningBuilder(BoardBuilder bb, ScoreBoardBuilder sbb) {
		super(bb, sbb);
	}
	
	/*
	@Override
	public Lightning build() {
		return null;
		//Lightning level = new Lightning(bb.build(), sbb.build(), time);
		//return level;
	}
	*/
	
	public LightningBuilder setTime(int time) {
		this.time = time;
		return this;
	}
	
	public int getTime() { return time;	}


}
