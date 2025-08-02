package org.example;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.example.ui.MenuScreen;
import org.example.ui.SplashScreen;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        final int playWidth = 200;
        final int playHeight = 300;

        SplashScreen splash = new SplashScreen();
        Stage splashStage = splash.getStage();

        splashStage.show();

        MenuScreen menu = new MenuScreen();
        StackPane root = new StackPane();
        Scene scene = new Scene(root, playWidth * 2, playHeight * 2);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tetris Game"); // This is the title of the application in top right corner

        // Simulate loading task (e.g. load data, init resources)
        Task<Void> loadTask = new Task<>() {
            @Override
            protected Void call() throws Exception {
                // Simulate some work (e.g., 3 seconds)
                Thread.sleep(3000);
                return null;
            }

            @Override
            protected void succeeded() {
                Platform.runLater(() -> {
                    splashStage.close();
                    primaryStage.show();
                    root.getChildren().add(menu.getView(root));
                });
            }
        };

        new Thread(loadTask).start();
    }
}