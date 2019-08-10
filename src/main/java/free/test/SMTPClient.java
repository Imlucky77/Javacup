package free.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SMTPClient {
    public static void main(String[] args) {
        Socket smtpSocket = null;
        DataInputStream is = null;
        DataOutputStream os = null;

        try {
            smtpSocket = new Socket("localhost", 9999);
            is = new DataInputStream(smtpSocket.getInputStream());
            os = new DataOutputStream(smtpSocket.getOutputStream());

        } catch (UnknownHostException u) {
            System.err.println("Don't know about host: hostname");
        } catch (IOException i) {
            System.err.println("Couldn't get I/O for the connection to: hostname");
        }

        if (smtpSocket != null && is != null && os != null) {
            try {
                os.writeBytes("HELO\n");
                os.writeBytes("MAIL From: k3is@fundy.csd.unbsj.ca\n");
                os.writeBytes("RCPT To: k3is@fundy.csd.unbsj.ca\n");
                os.writeBytes("DATA\n");
                os.writeBytes("From: k3is@fundy.csd.unbsj.ca\n");
                os.writeBytes("Subject: testing\n");
                os.writeBytes("Hi there\n"); // message body
                os.writeBytes("\n.\n");
                os.writeBytes("QUIT");

                String responseLine;
                while ((responseLine = is.readLine()) != null) {
                    System.out.println("" + responseLine);
                    if (responseLine.indexOf("ok") != -1) {
                        break;
                    }
                }
                smtpSocket.close();
                is.close();
                os.close();
            } catch (UnknownHostException e) {
                System.out.println("Trying to connect to unknown host: " + e);
            } catch (IOException e) {
                System.out.println("IOException: " + e);
            }
        }
    }
}
