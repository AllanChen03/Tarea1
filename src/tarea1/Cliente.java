package tarea1; //Proyecto

import java.io.*;   //Librerias
import java.net.Socket;
import java.util.ArrayList;

public class Cliente { //Clase Cliente
    final String Host = "192.168.1.11";  //IP de mi PC
    final int port = 6666; //Puerto del servidor
    private DataOutputStream out; //Clase que permite Enviar Mensajes
    private DataInputStream in; //Clase que permite Recibir Mensajes
/*
    try {
        Socket socketCliente = new Socket(Host, port); //Crea un socket para el cliente
        in = new DataInputStream(socketCliente.getInputStream()); //Variable que va a recibir mensajes
        out = new DataOutputStream(socketCliente.getOutputStream()); //Variable que va a enviar mensajes

        out.writeUTF("Hola"); //Envia un mensaje


    } catch(IOException)
*/

    public String sendMessage(ArrayList<String> valores) {
        System.out.println(valores.get(0)); //Imprime el valor del producto
        System.out.println(valores.get(1)); //Imprime el valor del porcentaje
        System.out.println(valores.get(2)); //Imprime el peso de producto
        //out.println(msg);
        //String resp = in.readLine();
        return "adios";
    }
/*
    public void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close(); //Cierra el cliente
    }
    */

}
