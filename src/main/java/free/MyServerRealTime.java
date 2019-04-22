package free;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerRealTime {
    public static void main(String[] args) throws Exception {
        ServerSocket socket = new ServerSocket(2020);
        Socket accept = socket.accept();
        DataInputStream din = new DataInputStream(accept.getInputStream());
        DataOutputStream dOut = new DataOutputStream(accept.getOutputStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = "", s2 = "";
        while (!s1.equals("stop")) {
            s1 = din.readUTF();
            System.out.println("client says " + s1);
            s2 = reader.readLine();
            dOut.writeUTF(s2);
            dOut.flush();
        }
        din.close();
        socket.close();
        accept.close();
    }
}
