package com.drassero.revise;

import com.drassero.revise.controller.RootController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/RootScene.fxml"), ResourceBundle.getBundle("RootScene"));
        primaryStage.setScene(loader.load());
        ((RootController) loader.getController()).setRootWindow(primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}