package tarea1;

import java.io.DataOutputStream;
import java.net.ServerSocket;

public class Socket<socket> {
    private int port = 6666;
    private String localHost = "localhost";
    protected String mensajeServidor;

    protected ServerSocket serverSocket;
    protected java.net.Socket clientSocket;
    protected DataOutputStream salidaServer, salidaCliente;

}
