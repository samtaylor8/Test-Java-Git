package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.example.ui.MenuScreen;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        final int playWidth = 200;
        final int playHeight = 300;

        MenuScreen menu = new MenuScreen();

        StackPane root = new StackPane();
        Scene scene = new Scene(root, playWidth * 2, playHeight * 2);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tetris Game"); // This is the title of the application in top right corner
        primaryStage.show();

        root.getChildren().add(menu.getView(root));
    }
}