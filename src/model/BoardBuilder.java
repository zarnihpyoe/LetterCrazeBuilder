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
					tiles[i][j] = new Tile(i, j);
				}
				else {
					tiles[i][j] = null;
				}
			}
		}
		//tiles = linkTiles(tiles);
		return new Board(tiles);
	}
	
/*	private Tile[][] linkTiles(Tile[][] tiles) {
		for(int j=0; j<6; j++) {
			Tile pre = tiles[0][j];
			for(int i=1; i<6; i++) {
				if(tiles[i][j] != null) {
					tiles[i][j].linkWith(pre);
					pre = tiles[i][j];
				}
			}
		}
		
		return tiles;
	}*/
	
	
}
