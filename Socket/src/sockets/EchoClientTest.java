package sockets;

import java.io.IOException;

public class EchoClientTest {
    public static void main(String[] args) throws IOException {
        new EchoClient("127.0.0.1", 6666);
    }
}
