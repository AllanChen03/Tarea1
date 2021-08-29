package tarea1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FXMLDocumentController implements Initializable {
    @FXML private TextField valor;
    @FXML private TextField porcentaje;
    @FXML private TextField peso;
    @FXML private Button enviar;
    @FXML private Label resultado;
    private Cliente client;

    public FXMLDocumentController() {
        client = new Cliente();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
    }

    @FXML
    private void getValores(ActionEvent event) {
        ArrayList<String> valores = new ArrayList<>();
        valores.add(valor.getText());
        valores.add(porcentaje.getText());
        valores.add(peso.getText());
        String msj = client.sendMessage(valores);
        resultado.setText(msj);
    }
}
