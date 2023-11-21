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
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorPantallaGestionDestinos {

    @FXML
    private ListView<String> listViewDestinos;


    private ObservableList<String> destinos = FXCollections.observableArrayList("Destino1", "Destino2", "Destino3");

    @FXML
    private void initialize() {

        listViewDestinos.setItems(destinos);
        listViewDestinos.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    private void handleNuevoDestino(ActionEvent event) {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("NuevoDestinoDialog.fxml"));
        Parent root;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }


        Scene scene = new Scene(root);

        Stage stage = new Stage();
        stage.setTitle("Nuevo Destino");
        stage.setScene(scene);


        stage.show();
    }

    @FXML
    private void handleEditarDestino(ActionEvent event) {

        String destinoSeleccionado = listViewDestinos.getSelectionModel().getSelectedItem();
        if (destinoSeleccionado != null) {
            mostrarAlerta("Editar Destino", "Implementa la lógica para editar el destino: " + destinoSeleccionado);
        } else {
            mostrarAlerta("Error", "Selecciona un destino para editar.");
        }
    }

    @FXML
    private void handleEliminarDestino(ActionEvent event) {

        String destinoSeleccionado = listViewDestinos.getSelectionModel().getSelectedItem();
        if (destinoSeleccionado != null) {
            destinos.remove(destinoSeleccionado);
            mostrarAlerta("Eliminar Destino", "Destino eliminado: " + destinoSeleccionado);
        } else {
            mostrarAlerta("Error", "Selecciona un destino para eliminar.");
        }
    }


    private void mostrarAlerta(String titulo, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}
