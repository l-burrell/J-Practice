package part;

public class CalcScore {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 200;
		int level = 5;
		int bonus = 188;
		calculateScore(gameOver, score, level, bonus);
		displayHighScore("John", calculateHighScorePosition(1500));
		displayHighScore("Jesse", calculateHighScorePosition(900));
		displayHighScore("Rick", calculateHighScorePosition(400));
		displayHighScore("Bob", calculateHighScorePosition(50));
	}
	
	public static int calculateScore(boolean gameOver, int score, int level, int bonus) {
		if(gameOver) {
			int finalScore = score + (level * bonus);
			finalScore += 2000;
			System.out.println("Your final score was " + finalScore);
			return finalScore;
		}
		return -1;
	}
	
	public static void displayHighScore(String name, int position) {
		System.out.println(name + "\t has managed to get in position " + position + " on the high score table."); 
	}
	
	public static int calculateHighScorePosition(int score) {
		int position = 4;
		if(score >= 1000) {
			position = 1;
		} else if(score >= 500) {
			position = 2;
		} else if(score >= 100) {
			position = 3;
		}
		return position;
	}
}
