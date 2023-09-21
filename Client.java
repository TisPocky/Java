import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);
        Scanner scan = new Scanner(System.in);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        while (true) {
            System.out.println("Chat: ");
            String str = scan.next();
            dos.writeUTF(str);
            if (str.equalsIgnoreCase("bye")) {
                break;
            }
            String reply = dis.readUTF();
            System.out.println("Reply: " + reply);
        }
        dos.close();
        dis.close();
        s.close();
        scan.close();
    }
}