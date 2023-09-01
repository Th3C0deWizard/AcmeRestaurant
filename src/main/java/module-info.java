module com.j2devs.acmerestaurant {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;
  requires org.kordamp.bootstrapfx.core;

  opens com.j2devs.acmerestaurant to javafx.fxml;
  exports com.j2devs.acmerestaurant;
  exports com.j2devs.acmerestaurant.controllers;
  opens com.j2devs.acmerestaurant.controllers to javafx.fxml;
}