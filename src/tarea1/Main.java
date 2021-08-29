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
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import static org.junit.Assert.assertEquals;

public class Main extends Application {

    @Override
    public void start(Stage ventanaPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        ventanaPrincipal.setTitle("Calculadora");
        ventanaPrincipal.setScene(new Scene(root, 500, 500));
        ventanaPrincipal.show();

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