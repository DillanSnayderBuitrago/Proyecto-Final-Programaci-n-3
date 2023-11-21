package co.edu.uniquindio.agencia.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import java.io.IOException;


public class AdminController {
    @FXML
    private void gestionarDestinos(ActionEvent event) {
        abrirVentana("GestionDestinos.fxml", "Gestión de Destinos");
    }

    @FXML
    private void gestionarPaquetes(ActionEvent event) {
        abrirVentana("GestionPaquetes.fxml", "Gestión de Paquetes");
    }

    @FXML
    private void gestionarGuias(ActionEvent event) {
        abrirVentana("GestionGuias.fxml", "Gestión de Guías");
    }
    @FXML
    private void verEstadisticas(ActionEvent event) {
        // Lógica simulada para mostrar estadísticas
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Estadísticas");
        alert.setHeaderText(null);
        alert.setContentText("Estadísticas simuladas: Destinos más reservados, Paquetes populares, etc.");
        alert.showAndWait();
    }

    @FXML
    private void cerrarSesion(ActionEvent event) {

        cerrarVentana();
    }

    private void abrirVentana(String fxml, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle(titulo);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cerrarVentana() {
      

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaInicio.fxml"));
            Parent root = loader.load();


            ControladorPantallaInicio inicioController = loader.getController();



            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.setTitle("Pantalla de Inicio");
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
