package com.example.capstoneproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;
import java.io.IOException;

public class ForeverHomeFinderMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ForeverHomeFinderMain.class.getResource("ForeverHomeFinderGUI-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 420, 340);
        stage.setTitle("Forever Home Finder");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}