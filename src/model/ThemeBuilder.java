package model;

import java.util.ArrayList;

public class ThemeBuilder extends LevelBuilder {

	private String theme;
	private ArrayList<String> wordList;
	
	public ThemeBuilder(BoardBuilder bb, ScoreBoardBuilder sbb) {
		super(bb, sbb);
		this.wordList = new ArrayList<>();
	}

	@Override
	public Level build() {
		Theme level = new Theme(bb.build(), sbb.build(), theme, wordList);
		return level;
	}
	
	public ThemeBuilder setTheme(String theme) {
		this.theme = theme;
		return this;
	}
	
	public ThemeBuilder setWordList(String w1, String w2, String w3) {
		wordList.add(w1);
		wordList.add(w2);
		wordList.add(w3);
		return this;
	}
	
	public ArrayList<String> getWordList() { return wordList; }

	public String getTheme() { return theme; }



}
