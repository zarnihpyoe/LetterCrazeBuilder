package model;

import java.util.ArrayList;

public class ThemeBuilder extends LevelBuilder{
	
	private String theme;
	private ArrayList<String> wordList;
	
	public ThemeBuilder(BoardBuilder bb, ScoreBoardBuilder sbb) {
		super(bb, sbb);
	}

	@Override
	public Level build() {
		Theme level = new Theme(lvl, bb.build(), sbb.build(), theme, wordList);
		return level;
	}

	public ThemeBuilder setTheme(String theme) {
		this.theme = theme;
		return this;
	}

	public ThemeBuilder setWordList(ArrayList<String> wordList) {
		this.wordList = wordList;
		return this;
	}

}
