package org.example.ui;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

public class SplashScreen {

    public Stage getStage() {
        Stage splashStage = new Stage(StageStyle.UNDECORATED);
        ImageView splashImage = new ImageView(new Image(Objects.requireNonNull(getClass().getResource("/splash-image.png")).toExternalForm()));
        splashImage.setFitWidth(200);
        splashImage.setFitHeight(300);
        splashImage.setPreserveRatio(true);
        splashImage.setSmooth(true);

        StackPane splashLayout = new StackPane(splashImage);
        Scene splashScene = new Scene(splashLayout);
        splashStage.setScene(splashScene);

        return splashStage;
    }
}
