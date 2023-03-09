package com.example.tareaextraclase1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraPersonas extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculadoraPersonas.class.getResource("calculadora.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 632, 608);
        stage.setTitle("JavaFX Calculator Application");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}