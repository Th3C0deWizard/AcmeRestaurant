package com.j2devs.acmerestaurant.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AppController {
  private Stage stage; Scene scene; Parent root;
  @FXML
  AnchorPane scenePane;
  @FXML
  private TextField bebida, entrada, fuerte, postre,precio;

  @FXML
  void close(ActionEvent event){
    this.stage = (Stage) scenePane.getScene().getWindow();
    stage.close();
  }

  @FXML
  void setMenu(MouseEvent event){
    Text text = ((Text)event.getSource());
    String id = text.getId();
    if(id.equals("bebida")){
      bebida.setText(text.getText().replace(".",""));
    }else if(id.equals("entrada")){
        entrada.setText(text.getText().replace(".",""));
    }else if(id.equals("fuerte")){
        fuerte.setText(text.getText().replace(".",""));
    }else if(id.equals("postre")){
        postre.setText(text.getText().replace(".",""));
    }
  }
}