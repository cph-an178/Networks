package sockets;

import java.net.*;

public class EchoServer {

    public EchoServer(String ip, int port) {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(ip, port));

            System.out.println("Server log: Server created...");
            System.out.println("Server log: Listening for clients on port " + port + "...");

            try {
                System.out.println("Server log: Waiting for connections...");

                while (true) {
                    new EchoServerClientThread(serverSocket.accept());
                }
            } catch (Exception e) {
                System.err.println("Server log: Accepting connection failed...");
            }
        } catch (Exception e) {
            System.out.println("Server log: Could not listen on port: " + port + "...");
        }
    }
    
}
