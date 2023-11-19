package test.stickzero;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class Player implements Renderable, Updatable {

    private int high_score = 0;
    private Image hero;
    private Double height;
    private int stickLength;

    public Player(double height, VBox stage) {
        this.hero = new Image(Player.class.getResource("/test/stickzero/image/StickHero.png").toExternalForm());
        this.height = height;
        this.stickLength = 0;

        // Create an ImageView for the hero image
        ImageView heroImageView = new ImageView(hero);

        // Decrease the size of the image (10 times smaller)
        heroImageView.setFitWidth(hero.getWidth() / 10);
        heroImageView.setFitHeight(hero.getHeight() / 10);

        // Set the position of the hero image
        heroImageView.setLayoutX(300); // Shift to the right (adjust as needed)
        heroImageView.setLayoutY(this.height); // Adjust as needed

        // Add the hero image to the VBox stage
        stage.getChildren().add(heroImageView);
    }

    public Player() {
    }
    public void jump() {
        // Implementation for jumping
    }

    public void extendStick() {
        // Implementation for extending the stick
    }

    public void landOnPlatform() {
        // Implementation for landing on a platform
    }

    public void die() {
        // Implementation for player's death
    }

    public int getStickLength() {
        return stickLength;
    }

    public void setStickLength(int stickLength) {
        this.stickLength = stickLength;
    }
    @Override
    public void update() {
        // Implementation for Player update
    }

    @Override
    public void render() {
        // Implementation for Player render
    }
    // Other methods and properties as needed
}
