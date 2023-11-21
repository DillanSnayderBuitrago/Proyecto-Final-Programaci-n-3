package co.edu.uniquindio.agencia.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class ClientePrincipalController {
    @FXML
private void buscarPaquetes(ActionEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BusquedaPaquetes.fxml"));
        Parent root = loader.load();
        BusquedaPaquetesController busquedaController = loader.getController();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Búsqueda de Paquetes");
        stage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    @FXML
    private void verReservas(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Reservas.fxml"));
            Parent root = loader.load();
            ReservasController reservasController = loader.getController();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Mis Reservas");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
