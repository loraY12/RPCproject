package lora;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class RPCClient {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 1234);

            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            out.writeObject(number);

            String response = (String) in.readObject();
            System.out.println("Server Response: " + response);

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}