package test.stickzero;
public abstract class GameObject {
    private int positionX;
    private int positionY;

    public GameObject(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public abstract void update();
    public abstract void render();
}


