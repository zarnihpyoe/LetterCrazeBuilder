package model;

public class BoardBuilder {
	
	private boolean[][] enabledTiles = new boolean[6][6];
	
	public BoardBuilder(){}
	
	public BoardBuilder changeTileState(int row, int col) {
		this.enabledTiles[row][col] = !this.enabledTiles[row][col];
		return this;
	}
	
	public Board build() {
		Tile[][] tiles = new Tile[6][6];
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(enabledTiles[i][j]) {
					// TODO create new Tile and add it to the tiles
					//tiles[i][j] = new Tile(i, j, );
				}
			}
		}
		return new Board(tiles);
	}
	
	
}
