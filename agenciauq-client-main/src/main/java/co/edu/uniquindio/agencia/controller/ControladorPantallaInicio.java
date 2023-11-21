package co.edu.uniquindio.agencia.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorPantallaInicio {

    @FXML
    private void handleLoginButton(ActionEvent event) throws IOException {

        System.out.println("Botón Iniciar Sesión presionado");


        abrirPantallaLogin();
    }

    @FXML
    private void handleRegistroButton(ActionEvent event) {

        System.out.println("Botón Registro presionado");


        abrirPantallaRegistro();
    }


    private void abrirPantallaLogin() throws IOException {


        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaRegistro.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private void abrirPantallaRegistro() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaRegistro.fxml"));
            Parent root = loader.load();


            ControladorPantallaRegistro controlador = loader.getController();


            Scene scene = new Scene(root);


            Stage stage = new Stage();
            stage.setTitle("Registro de Usuario");
            stage.setScene(scene);


            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
