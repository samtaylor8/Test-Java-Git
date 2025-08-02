package org.example.ui;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class MenuScreen {

    public Pane getView(StackPane root) {
        Label title = new Label("Main Menu");
        Button playButton = new Button("Play");
        Button configButton = new Button("Config");
        Button exitButton = new Button("Exit");

        playButton.setOnAction(e -> {
            root.getChildren().setAll(new GameScreen().getView(root));
        });
        configButton.setOnAction(e -> {
            root.getChildren().setAll(new ConfigScreen().getView(root));
        });
        exitButton.setOnAction(e -> {
            System.exit(0);
        });

        VBox layout = new VBox(50, title, playButton, configButton, exitButton);
        layout.setAlignment(Pos.CENTER);
        playButton.setPrefWidth(150);
        configButton.setPrefWidth(150);
        exitButton.setPrefWidth(150);

        return layout;
    }
}
