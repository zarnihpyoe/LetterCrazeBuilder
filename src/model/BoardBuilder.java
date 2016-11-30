package model;

public class BoardBuilder {
	
	private  boolean [] [] tileStates = new boolean [6] [6];
	
	public BoardBuilder() {}
	
	public BoardBuilder changeTileState(int row, int col) {
		tileStates [row] [col] = !tileStates [row] [col];
		return this;
	}
	
	public Board build() {
		return new Board(generateTiles());
	}
	
	private Tile[] [] generateTiles() {
		Tile [] [] tiles = new Tile [6] [6];
		// some algorithm
		
		return tiles;
	}
	
}
