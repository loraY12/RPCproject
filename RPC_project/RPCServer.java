package lora;

import java.io.*;
import java.net.*;

public class RPCServer {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server started...");
            
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

            int number = (int) in.readObject();
            String result;

            if (number % 2 == 0) {
                result = number + " is Even";
            } else {
                result = number + " is Odd";
            }

            if (isPrime(number)) {
                result += " and Prime";
            } else {
                result += " and Not Prime";
            }

            out.writeObject(result);

            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}