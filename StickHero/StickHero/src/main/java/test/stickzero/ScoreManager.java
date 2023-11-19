package test.stickzero;

public class ScoreManager {
    private int currentScore;

    public ScoreManager() {
        this.currentScore = 0;
    }

    public void updateScore(int points) {
        // Implement logic to update the score based on points earned
        currentScore += points;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    // Additional methods as needed
}
