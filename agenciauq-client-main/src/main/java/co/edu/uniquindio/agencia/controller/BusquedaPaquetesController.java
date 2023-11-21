package co.edu.uniquindio.agencia.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
public class BusquedaPaquetesController {
    @FXML
    private TextField filtroTextField;

    @FXML
    private ListView<String> resultadosListView;

    private ObservableList<String> resultados = FXCollections.observableArrayList();

    @FXML
    private void buscarPaquetes() {

        String filtro = filtroTextField.getText().toLowerCase();

        resultados.clear();

        // Simulación de resultados
        resultados.add("Paquete 1");
        resultados.add("Paquete 2");
        resultados.add("Paquete 3");

        resultadosListView.setItems(resultados);
    }

    @FXML
    private void cerrarVentana() {

        filtroTextField.getScene().getWindow().hide();
    }
}
