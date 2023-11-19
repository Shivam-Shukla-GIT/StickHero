package test.stickzero;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Playground {
    private VBox playstage;

    public Playground(VBox playgroundRoot) {
        this.playstage = playgroundRoot;
    }

    public void showScene() {
        playstage.getChildren().add(new Label("Welcome to the Playground!"));

        // You may need to perform these operations after the Playground scene has been shown
        playstage.sceneProperty().addListener((observable, oldScene, newScene) -> {
            if (newScene != null) {
                double screenWidth = playstage.getWidth();

                Player hero = new Player(300, playstage);
                // Assuming you have a default height for the pillar
                Pillar pillar = new Pillar(screenWidth, playstage);
            }
        });
    }
}
