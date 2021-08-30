package tarea1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Main extends Application {

    @Override
    public void start(Stage ventanaPrincipal) throws Exception { //Instancia la ventana de la aplicacion
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); //Al correr el codigo se llama a la funcion sample.fxml
        ventanaPrincipal.setTitle("Calculadora"); //Nombre de la aplicacion
        ventanaPrincipal.setScene(new Scene(root, 500, 500)); //Dimensiones de la aplicacion
        ventanaPrincipal.show(); //Muestra la interfaz

    }


    public static void main(String args[]) {
        launch(args);
    }
}
    /*
    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        Cliente client = new Cliente();
        System.out.println("Prueba");
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("hello server");
        assertEquals("hello client", response);
    }
}
*/