package org.example.ui;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class ConfigScreen {

    public Pane getView(StackPane root) {
        Label title = new Label("Configuration");
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
