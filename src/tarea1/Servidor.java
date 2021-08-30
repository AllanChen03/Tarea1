package tarea1;

import java.io.*;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.logging.Logger;


public class Servidor {

    private ServerSocket serverSocket;
    private Socket socketCliente;
    private DataOutputStream out;
    private DataInputStream in;
    private int port = 6666;
/*
    try {
        serverSocket = new ServerSocket(port);
        System.out.println("Conectado");

        while(true) {
            socketCliente = serverSocket.accept();
            in = new DataInputStream(socketCliente.getInputStream());
            out = new DataOutputStream(socketCliente.getOutputStream());

            String mensaje = in.readUTF();

            out.writeUTF("Hola");

            String mensaje = in.readUTF();




        }
    } catch (IOException ex) {
        Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE,null, ex);
    }








    }
*/
}