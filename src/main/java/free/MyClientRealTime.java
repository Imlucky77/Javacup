package free;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClientRealTime {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 2020);
        DataInputStream din = new DataInputStream(socket.getInputStream());
        DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = "", s2 = "";
        while (!s1.equals("stop")) {
            s1 = br.readLine();
            dout.writeUTF(s1);
            dout.flush();
            s2 = din.readUTF();
            System.out.println("server says " + s2);
        }

        dout.close();
        socket.close();
    }

}
