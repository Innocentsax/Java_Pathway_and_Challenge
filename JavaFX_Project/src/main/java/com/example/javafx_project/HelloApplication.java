package com.example.javafx_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        GridPane fxmlLoader = new GridPane();
//        fxmlLoader.setAlignment(Pos.CENTER);
//        fxmlLoader.setVgap(10);
//        fxmlLoader.setHgap(10);
//
//        Label greeting = new Label("Hi Innocent Charles! Welcome to JavaFX...");
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 48));
//        fxmlLoader.getChildren().add(greeting);

        Scene scene = new Scene(fxmlLoader.load(), 900, 240);
        stage.setTitle("Hello JavaFX!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}