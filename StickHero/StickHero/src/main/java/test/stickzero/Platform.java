package test.stickzero;

import javafx.scene.Node;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

// Abstract Pillar class

import java.util.ArrayList;

class Pillar {
    private int pillar_max_width = 100;
    private int pillar_min_width = 30;
    private int pillar_height = 300;
    private int red_spot_width = 1; // size of red_spot that gives 2 points (red pillar)
    private ArrayList<BlackPillar> pillars;
//    public abstract Node createPillarNode();
public Pillar(double screen_width, VBox stage) {
    double pillarPositionX = 0; // Adjust as needed
    double pillarPositionY = stage.getHeight() - pillar_height; // Adjust as needed

    Rectangle pillarNode = new Rectangle(pillarPositionX, 0, pillar_max_width, pillar_height);
    pillarNode.setFill(Color.BLACK);

    // Add the rectangle to the VBox stage
    stage.getChildren().add(pillarNode);
}
    // Protected getters to provide access to derived classes
    public boolean AddPillar(){
        return false;
    }
    protected int getPillarMaxWidth() {
        return pillar_max_width;
    }

    protected int getPillarMinWidth() {
        return pillar_min_width;
    }

    protected int getPillarHeight() {
        return pillar_height;
    }

    protected int getRedSpotWidth() {
        return red_spot_width;
    }
}


// Class to store positional values of the pillar

// Concrete subclass of Pillar
class BlackPillar {
    private PillarPosition position;
    private RedSpot redSpot;
    private Pillar head; // want to use all methods and properties of pillar can't do it using oops concept

    private BlackPillar(double screen_width_start,double screen_width_end) {

    }

    public Node createPillarNode() {
        Rectangle pillarNode = new Rectangle(position.getPositionX(), position.getPositionY(),
                position.getWidth(), head.getPillarHeight());
        pillarNode.setFill(Color.BLACK);
        return pillarNode;
    }
}

class RedSpot{
    private BlackPillar head;
}
class PillarPosition {
    private double positionX;
    private double positionY;
    private double width;
    private double hight;

    public PillarPosition(double positionX, double positionY, double width,double hight) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.hight = hight;

    }

    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return hight;
    }
}
