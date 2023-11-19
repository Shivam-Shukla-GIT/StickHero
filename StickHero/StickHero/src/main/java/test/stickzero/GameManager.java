package test.stickzero;

public abstract class GameManager {
    private boolean gameOver;

    public GameManager() {
        this.gameOver = false;
    }

    public abstract void startGame();
    public abstract void endGame();
    public abstract void update();
    public abstract void render();
}