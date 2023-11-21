package co.edu.uniquindio.agencia.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControladorPantallaLogin {
    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtContraseña;

    @FXML
    private void handleLoginButton(ActionEvent event) {
       try{
        String usuario = txtUsuario.getText();
        String contraseña = txtContraseña.getText();


        if (validarCredenciales(usuario, contraseña)) {
            System.out.println("Inicio de sesión exitoso");

            cerrarVentana();
        } else {
            System.out.println("Inicio de sesión fallido");

        }} catch (Exception e) {
           throw new RuntimeException(e);
       }
    }


    private boolean validarCredenciales(String usuario, String contraseña) {

        return usuario.equals("usuario_demo") && contraseña.equals("contraseña_demo");
    }


    private void cerrarVentana() {
        Stage stage = (Stage) txtUsuario.getScene().getWindow();
        stage.close();
    }
}
