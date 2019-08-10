package free.test;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class echo3 {
    public static void main(String[] args) {
        String line;
        ServerSocket echoServer = null;
        DataInputStream is;
        PrintStream os;
        Socket clientSocket = null;

        try {
            echoServer = new ServerSocket(9999);
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            clientSocket = echoServer.accept();
            is = new DataInputStream(clientSocket.getInputStream());
            os = new PrintStream(clientSocket.getOutputStream());
            while (true) {
                line = is.readLine();
                os.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
