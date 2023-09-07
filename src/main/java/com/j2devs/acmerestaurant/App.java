package com.j2devs.acmerestaurant;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.stage.StageStyle;

public class App extends Application{
  private double x, y;
  @Override
  public void start(Stage stage) {
    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("views/App.fxml"));
      Parent root = loader.load();

      stage.setScene(new Scene(root));
      stage.initStyle(StageStyle.UNDECORATED);

      root.setOnMousePressed(event -> {
        x = event.getSceneX();
        y = event.getSceneY();
      });
      root.setOnMouseDragged(event -> {

        stage.setX(event.getScreenX() - x);
        stage.setY(event.getScreenY() - y);

      });

      stage.show();
    }catch(Exception e){
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}
