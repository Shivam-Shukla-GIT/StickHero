package test.stickzero;

public class Cherry extends GameObject implements Renderable {
    private int points;

    public Cherry(int position, int points) {
        super(position, 0);
        this.points = points;
    }

    public void collect() {
        // Implement logic for what happens when the player collects this cherry
        // For example, you might increase the player's score
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public void update() {
        // Implementation for Cherry update
    }

    @Override
    public void render() {
        // Implementation for Cherry render
    }
}
