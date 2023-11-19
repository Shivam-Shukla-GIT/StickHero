package test.stickzero;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.scene.image.ImageView;

public class HelloApplication extends Application {

    private VBox root;  // Declare root at the class level

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/test/stickzero/hello-view.fxml"));
            root = fxmlLoader.load();  // Initialize root

            // Set Big Heading
            Label bigHeading = new Label("STICK\nHERO");
            bigHeading.setStyle("-fx-font-size: 28pt; -fx-text-fill: #F65020; -fx-font-weight: bold;");
            // Set the position of bigHeading
            bigHeading.setLayoutX(50); // X-coordinate
            bigHeading.setLayoutY(5); // Y-coordinate

            // Set Background Image
            Image backgroundImage = new Image(getClass().getResource("image/start.png").toExternalForm());
            BackgroundImage background = new BackgroundImage(
                    backgroundImage,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.DEFAULT,
                    new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)
            );
            root.setBackground(new Background(background));

            // Set Play Button
            Button playButton = new Button("Play");
            playButton.setOnAction(event -> onPlayButtonClick());

            // Add components to the VBox
            root.getChildren().addAll(bigHeading, playButton);

            // Show the scene
            Scene scene = new Scene(root, 600, 400);
            stage.setTitle("Stick Hero");
            stage.setScene(scene);
            stage.show();

            // Add StickHeroCharacter image at the bottom
            Image stickHeroImage = new Image(getClass().getResource("image/StickHeroCharacterhomepage.svg").toExternalForm());
            ImageView stickHeroImageView = new ImageView(stickHeroImage);
            stickHeroImageView.setPreserveRatio(true);
            stickHeroImageView.setFitWidth(100); // Adjust the width as needed

            // Position the image at the bottom of the screen
            stickHeroImageView.setLayoutX(250); // X-coordinate
            stickHeroImageView.setLayoutY(300); // Y-coordinate

            root.getChildren().add(stickHeroImageView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void onPlayButtonClick() {
        // Handle play button click event
        System.out.println("Play button clicked!");

        // Create the root node for the Playground scene (replace with your own code)
        VBox playgroundRoot = new VBox();
        Playground ground = new Playground(playgroundRoot);
        ground.showScene();
        // Replace the root of the current scene with the Playground root
        root.getChildren().setAll(playgroundRoot);
        // Now you can access 'root' globally in this class
    }

    public static void main(String[] args) {
        launch();
    }
}
