package com.j2devs.acmerestaurant.GUI;

import com.j2devs.acmerestaurant.Modelos.Bebida.*;
import com.j2devs.acmerestaurant.Modelos.Chef;
import com.j2devs.acmerestaurant.Modelos.Entrada.ArepasFritasBuilder;
import com.j2devs.acmerestaurant.Modelos.Entrada.ChicharronesBuilder;
import com.j2devs.acmerestaurant.Modelos.Entrada.EntradaBuilder;
import com.j2devs.acmerestaurant.Modelos.Entrada.SalchipapaBuilder;
import com.j2devs.acmerestaurant.Modelos.Orden;
import com.j2devs.acmerestaurant.Modelos.PlatoFuerte.*;
import com.j2devs.acmerestaurant.Modelos.Postre.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class AppController {

    ArrayList<EntradaBuilder> entradas = new ArrayList<>();
    ArrayList<PlatoFuerteBuilder> platosFuertes = new ArrayList<>();
    ArrayList<BebidaBuilder> bebidas = new ArrayList<>();
    ArrayList<PostreBuilder> postres = new ArrayList<>();
    Chef chef;
    Orden orden = null;

    private Stage stage; Scene scene; Parent root;

    @FXML
    AnchorPane scenePane;
    @FXML
    private TextField bebida, entrada, fuerte, postre,precio;

  public void createBuilders(){
      //Entradas Builder
      EntradaBuilder arepasFritasBuilder = new ArepasFritasBuilder("Arepas Fritas");
      EntradaBuilder chicharronesBuilder = new ChicharronesBuilder("Chicharrones");
      EntradaBuilder salchipapaBuilder = new SalchipapaBuilder("Salchipapas");
      this.entradas.add(arepasFritasBuilder);
      this.entradas.add(chicharronesBuilder);
      this.entradas.add(salchipapaBuilder);

      //Platos Fuertes Builder
      PlatoFuerteBuilder pl1builder = new PlatoFuerte1Builder("Plancha ACME");
      PlatoFuerteBuilder pl2builder = new PlatoFuerte2Builder("Corre Caminos");
      PlatoFuerteBuilder pl3builder = new PlatoFuerte3Builder("Pez ACME");
      PlatoFuerteBuilder pl4builder = new PlatoFuerte4Builder("Tsunami Seeds");
      PlatoFuerteBuilder pl5builder = new PlatoFuerte5Builder("Albondigas Coyote");
      PlatoFuerteBuilder pl6builder = new PlatoFuerte6Builder("Lasaña Dinamita");
      PlatoFuerteBuilder pl7builder = new PlatoFuerte7Builder("Sopa Cohete");
      this.platosFuertes.add(pl1builder);
      this.platosFuertes.add(pl2builder);
      this.platosFuertes.add(pl3builder);
      this.platosFuertes.add(pl4builder);
      this.platosFuertes.add(pl5builder);
      this.platosFuertes.add(pl6builder);
      this.platosFuertes.add(pl7builder);

      //Bebidas Builder
      BebidaBuilder cocacolaBuilder = new CocacolaBuilder("CocaCola");
      BebidaBuilder colombianaBuilder = new ColombianaBuilder("Colombiana");
      BebidaBuilder mangoBuilder = new MangoBuilder("Jugo Mango");
      BebidaBuilder maracuyamangoBuilder = new MaracumangoBuilder("Jugo Maracumango");
      BebidaBuilder maracuyaBuilder = new MaracuyaBuilder("Jugo Maracuya");
      BebidaBuilder maramoraBuilder = new MaramoraBuilder("Jugo Maramora");
      BebidaBuilder moraBuilder = new MoraBuilder("Jugo Mora");
      BebidaBuilder MoramangoBuilder = new MoramangoBuilder("Jugo Moramango");
      BebidaBuilder pepsiBuilder = new PepsiBuilder("Pepsi");
      this.bebidas.add(cocacolaBuilder);
      this.bebidas.add(colombianaBuilder);
      this.bebidas.add(mangoBuilder);
      this.bebidas.add(maracuyamangoBuilder);
      this.bebidas.add(maracuyaBuilder);
      this.bebidas.add(maramoraBuilder);
      this.bebidas.add(moraBuilder);
      this.bebidas.add(MoramangoBuilder);
      this.bebidas.add(pepsiBuilder);

      //Postres Builder
      PostreBuilder postre1Builder = new Postre1Builder("Helado Tramposo");
      PostreBuilder postre2Builder = new Postre2Builder("Helado Chispas");
      PostreBuilder postre3Builder = new Postre3Builder("Brownie Chispas");
      PostreBuilder postre4Builder = new Postre4Builder("Brownie Tramposo");
      this.postres.add(postre1Builder);
      this.postres.add(postre2Builder);
      this.postres.add(postre3Builder);
      this.postres.add(postre4Builder);

      //Creación Chef
      this.chef = new Chef();
  }

  public void showAlert(String title, String content){
      Alert alert = new Alert(Alert.AlertType.INFORMATION);
      alert.setTitle(title);
      alert.setContentText(content);
      alert.showAndWait();
  }

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

    @FXML
    void prepararMenu(ActionEvent event) {
        String bebida = this.bebida.getText();
        String entrada = this.entrada.getText();
        String fuerte = this.fuerte.getText();
        String postre = this.postre.getText();
        if(this.orden != null){
            showAlert("Orden", "Ya tiene una orden en proceso!!");
        }else if(bebida.equals("") || entrada.equals("") || fuerte.equals("") || postre.equals("")){
            showAlert("Orden", "Debe seleccionar un elemento de cada categoría");
        }else{
            try {
                EntradaBuilder entradaBuilder = this.entradas.stream()
                        .filter(actualEntrada -> actualEntrada.getName().equals(entrada))
                        .findAny()
                        .orElse(null);

                showAlert("Orden", "Entrada: " + entrada + " preparada!!");
                Thread.sleep(1000);

                PlatoFuerteBuilder platoFuerteBuilder = this.platosFuertes.stream()
                        .filter(actualFuerte -> actualFuerte.getName().equals(fuerte))
                        .findAny()
                        .orElse(null);

                showAlert("Orden", "Plato Fuerte: " + fuerte + " preparado!!");
                Thread.sleep(1000);

                BebidaBuilder bebidaBuilder = this.bebidas.stream()
                        .filter(actualBebida -> actualBebida.getName().equals(bebida))
                        .findAny()
                        .orElse(null);

                showAlert("Orden", "Bebida: " + bebida + " preparada!!");
                Thread.sleep(1000);

                PostreBuilder postreBuilder = this.postres.stream()
                        .filter(actualPostre -> actualPostre.getName().equals(postre))
                        .findAny()
                        .orElse(null);

                showAlert("Orden", "Postre: " + postre + " preparado!!");
                Thread.sleep(1000);

                this.orden = chef.prepararOrden(entradaBuilder, platoFuerteBuilder, postreBuilder, bebidaBuilder);
                showAlert("Orden", "Que disfrute su orden!!");
                precio.setText(String.valueOf(orden.getPrecio()));

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @FXML
    void clean(ActionEvent event){
        if(this.orden != null){
            showAlert("Orden", "Debe pagar la orden actual!!");
        }else {
            bebida.setText("");
            entrada.setText("");
            fuerte.setText("");
            postre.setText("");
            precio.setText("");
        }
    }

    @FXML
    void pay(ActionEvent event){
        showAlert("Orden", "Gracias por su compra!!");
        this.orden = null;
        clean(event);
    }
}