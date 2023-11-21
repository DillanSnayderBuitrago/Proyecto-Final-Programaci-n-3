package co.edu.uniquindio.agencia.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControladorNuevoDestino {
    @FXML
    private TextField txtNombreDestino;

    @FXML
    private TextField txtCiudad;

    @FXML
    private TextField txtDescripcion;

    @FXML
    private TextField txtClima;

    @FXML
    private void handleGuardarNuevoDestino(ActionEvent event) {
        // Obtener los valores ingresados por el usuario
        String nombreDestino = txtNombreDestino.getText();
        String ciudad = txtCiudad.getText();
        String descripcion = txtDescripcion.getText();
        String clima = txtClima.getText();


        Stage stage = (Stage) txtNombreDestino.getScene().getWindow();
        stage.close();
    }
}
