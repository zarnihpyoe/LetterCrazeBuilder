package model;

public class ScoreBoardBuilder {
	
	public static final int FIRST_STAR = 1;
	public static final int SECOND_STAR = 2;
	public static final int THIRD_STAR = 3;
	
	private int scoreForFirstStar;
	private int scoreForSecondStar;
	private int scoreForThirdStar;
	
	public ScoreBoardBuilder() {}
	
	public void setScoreFor(int star, int score) {
		switch (star) {
			case FIRST_STAR: 
				scoreForFirstStar = score;
				break;
			case SECOND_STAR:
				scoreForSecondStar = score;
				break;
			case THIRD_STAR:
				scoreForThirdStar = score;
				break;
		}
	}
	
	
	public ScoreBoard build() {
		return new ScoreBoard(scoreForFirstStar, scoreForSecondStar, scoreForThirdStar);
	}
	
	
	
}
