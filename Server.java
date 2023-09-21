import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        while (true) {
            Socket s = ss.accept();
            ClientHandler ch = new ClientHandler(s);
            ch.start();
        }
    }

    public static class ClientHandler extends Thread {
        Socket s;

        public ClientHandler(Socket s) {
            this.s = s;
        }

        public void run() {
            try {
                DataInputStream dis = new DataInputStream(this.s.getInputStream());
                DataOutputStream dos = new DataOutputStream(this.s.getOutputStream());
                while (true) {
                    String str = dis.readUTF();
                    if (str.equalsIgnoreCase("bye")) {
                        break;
                    }
                    dos.writeUTF(str);
                }
                dis.close();
                dos.close();
                s.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
