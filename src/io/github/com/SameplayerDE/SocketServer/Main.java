package io.github.com.SameplayerDE.SocketServer;

import com.sun.security.ntlm.Server;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    private static ServerSocket serverSocket = null;
    private static Socket socket = null;
    private static DataInputStream stream = null;

    public static void main(String[] args) {

        Frame frame = new Frame();

        try {

            ServerSocket serverSocket = new ServerSocket(25565);

            socket = serverSocket.accept();
            stream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            while (true) {
                String line = stream.readUTF();
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
