package com.j2devs.acmerestaurant.GUI;

import com.j2devs.acmerestaurant.Modelos.Bebida.*;
import com.j2devs.acmerestaurant.Modelos.Builder;
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
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class AppController {

  private ArrayList<Builder> builders;
  private Chef chef;
  private Orden orden = null;
  private Stage stage;

  @FXML
  AnchorPane scenePane;
  @FXML
  private TextField bebida, entrada, fuerte, postre, precio;

  public void createBuilders() {
    this.builders = new ArrayList<>();
    this.initEntradas();
    this.initPlatosFuertes();
    this.initBebidas();
    this.initPostres();
    this.chef = new Chef();
  }

  private void initEntradas() {
    EntradaBuilder arepasFritasBuilder = new ArepasFritasBuilder("Arepas Fritas");
    EntradaBuilder chicharronesBuilder = new ChicharronesBuilder("Chicharrones");
    EntradaBuilder salchipapaBuilder = new SalchipapaBuilder("Salchipapas");
    this.builders.add(arepasFritasBuilder);
    this.builders.add(chicharronesBuilder);
    this.builders.add(salchipapaBuilder);
  }

  private void initPlatosFuertes() {
    PlatoFuerteBuilder pl1builder = new PlatoFuerte1Builder("Plancha ACME");
    PlatoFuerteBuilder pl2builder = new PlatoFuerte2Builder("Corre Caminos");
    PlatoFuerteBuilder pl3builder = new PlatoFuerte3Builder("Pez ACME");
    PlatoFuerteBuilder pl4builder = new PlatoFuerte4Builder("Tsunami Seeds");
    PlatoFuerteBuilder pl5builder = new PlatoFuerte5Builder("Albondigas Coyote");
    PlatoFuerteBuilder pl6builder = new PlatoFuerte6Builder("Lasaña Dinamita");
    PlatoFuerteBuilder pl7builder = new PlatoFuerte7Builder("Sopa Cohete");
    this.builders.add(pl1builder);
    this.builders.add(pl2builder);
    this.builders.add(pl3builder);
    this.builders.add(pl4builder);
    this.builders.add(pl5builder);
    this.builders.add(pl6builder);
    this.builders.add(pl7builder);
  }

  private void initBebidas() {
    BebidaBuilder cocacolaBuilder = new CocacolaBuilder("CocaCola");
    BebidaBuilder colombianaBuilder = new ColombianaBuilder("Colombiana");
    BebidaBuilder mangoBuilder = new MangoBuilder("Jugo Mango");
    BebidaBuilder maracuyamangoBuilder = new MaracumangoBuilder("Jugo Maracumango");
    BebidaBuilder maracuyaBuilder = new MaracuyaBuilder("Jugo Maracuya");
    BebidaBuilder maramoraBuilder = new MaramoraBuilder("Jugo Maramora");
    BebidaBuilder moraBuilder = new MoraBuilder("Jugo Mora");
    BebidaBuilder MoramangoBuilder = new MoramangoBuilder("Jugo Moramango");
    BebidaBuilder pepsiBuilder = new PepsiBuilder("Pepsi");
    this.builders.add(cocacolaBuilder);
    this.builders.add(colombianaBuilder);
    this.builders.add(mangoBuilder);
    this.builders.add(maracuyamangoBuilder);
    this.builders.add(maracuyaBuilder);
    this.builders.add(maramoraBuilder);
    this.builders.add(moraBuilder);
    this.builders.add(MoramangoBuilder);
    this.builders.add(pepsiBuilder);
  }

  private void initPostres() {
    PostreBuilder postre1Builder = new Postre1Builder("Helado Tramposo");
    PostreBuilder postre2Builder = new Postre2Builder("Helado Chispas");
    PostreBuilder postre3Builder = new Postre3Builder("Brownie Chispas");
    PostreBuilder postre4Builder = new Postre4Builder("Brownie Tramposo");
    this.builders.add(postre1Builder);
    this.builders.add(postre2Builder);
    this.builders.add(postre3Builder);
    this.builders.add(postre4Builder);
  }

  private void showAlert(String title, String content) {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle(title);
    alert.setContentText(content);
    alert.showAndWait();
  }

  private <T extends Builder> T preparar(String nombre) throws InterruptedException {
    T builder = (T) this.builders.stream()
        .filter(item -> item.getName().equals(nombre))
        .findAny()
        .orElse(null);

    showAlert("Orden", "Entrada: " + builder.getName() + " preparada!!");
    Thread.sleep(1000);
    return builder;
  }

  @FXML
  void close(ActionEvent event) {
    this.stage = (Stage) scenePane.getScene().getWindow();
    stage.close();
  }

  @FXML
  void setMenu(MouseEvent event) {
    Text text = ((Text) event.getSource());
    String id = text.getId();
    if (id.equals("bebida")) {
      bebida.setText(text.getText().replace(".", ""));
    } else if (id.equals("entrada")) {
      entrada.setText(text.getText().replace(".", ""));
    } else if (id.equals("fuerte")) {
      fuerte.setText(text.getText().replace(".", ""));
    } else if (id.equals("postre")) {
      postre.setText(text.getText().replace(".", ""));
    }
  }

  @FXML
  void prepararMenu(ActionEvent event) {
    String bebida = this.bebida.getText();
    String entrada = this.entrada.getText();
    String fuerte = this.fuerte.getText();
    String postre = this.postre.getText();
    if (this.orden != null) {
      showAlert("Orden", "Ya tiene una orden en proceso!!");
    } else if (bebida.equals("") || entrada.equals("") || fuerte.equals("") || postre.equals("")) {
      showAlert("Orden", "Debe seleccionar un elemento de cada categoría");
    } else {
      try {
        EntradaBuilder entradaBuilder = this.<EntradaBuilder>preparar(entrada);
        PlatoFuerteBuilder platoFuerteBuilder = this.<PlatoFuerteBuilder>preparar(fuerte);
        PostreBuilder postreBuilder = this.<PostreBuilder>preparar(postre);
        BebidaBuilder bebidaBuilder = this.<BebidaBuilder>preparar(bebida);
        this.orden = this.chef.prepararOrden(entradaBuilder, platoFuerteBuilder, postreBuilder, bebidaBuilder);
        showAlert("Orden", "Que disfrute su orden!!");
        precio.setText(String.valueOf(this.orden.getPrecio()));

      } catch (InterruptedException e) {
        System.out.println("something went wrong in prepararMenu func :C");
        throw new RuntimeException(e);
      }
    }
  }

  @FXML
  void clean(ActionEvent event) {
    if (this.orden != null) {
      showAlert("Orden", "Debe pagar la orden actual!!");
    } else {
      bebida.setText("");
      entrada.setText("");
      fuerte.setText("");
      postre.setText("");
      precio.setText("");
    }
  }

  @FXML
  void pay(ActionEvent event) {
    if (this.precio.getText().isBlank()) {
      showAlert("Orden", "No has terminado de ordenar, por favor termina tu orden");
    } else {
      showAlert("Orden", "Gracias por su compra!!");
      this.orden = null;
      clean(event);
    }
  }
}