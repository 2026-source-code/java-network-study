package com.mtcoding.ex05;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class MyClient3 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 20000);

            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            Scanner socketSc = new Scanner(socket.getInputStream());

            String response = "";
            while(true){
                String keyboardData = sc.nextLine();
                pw.println(keyboardData); // /html, /data

                while(socketSc.hasNextLine()){
                    String recv = socketSc.nextLine();
                    if ("__END__".equals(recv)) break;
                    response = response + recv;
                }
                System.out.println(response);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
