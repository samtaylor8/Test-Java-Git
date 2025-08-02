package org.example.ui;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class GameScreen {
    public Pane getView(StackPane root) {
        Label title = new Label("Tetris");
        Button backButton = new Button("Back");

        backButton.setOnAction(e -> {
            root.getChildren().setAll(new MenuScreen().getView(root));
        });

        VBox layout = new VBox(50, title, backButton);
        layout.setAlignment(Pos.CENTER);
        backButton.setPrefWidth(150);

        return layout;
    }
}
