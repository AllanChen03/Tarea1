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
    @FXML private TextField valor; //TextField del valor
    @FXML private TextField porcentaje; //TextField del porcentaje
    @FXML private TextField peso; //TextField del peso
    @FXML private Button enviar; //Accion al tocar el boton
    @FXML private Label resultado; //Muestra el resultado
    private Cliente client; //Cliente

    public FXMLDocumentController() {
        client = new Cliente();
    } //Controlador para enviar los datos del TextField al Cliente

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) //Inicia el evento
    {
    }

    @FXML
    private void getValores(ActionEvent event) { //Funcion que agrega los datos de los TextField a una lista
        ArrayList<String> valores = new ArrayList<>();
        valores.add(valor.getText()); //Agrega el valor del producto a la Array
        valores.add(porcentaje.getText()); //Agrega el valor del porcentaje a la Array
        valores.add(peso.getText()); //Agrega el peso del producto a la Array
        String msj = client.sendMessage(valores); //Manda el array al cliente
        resultado.setText(msj);
    }
}
