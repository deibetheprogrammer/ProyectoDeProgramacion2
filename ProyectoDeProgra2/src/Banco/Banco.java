/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;
import java.net.*; 
import java.io.*; 
import java.util.Random;
/**
 *
 * @author davidbendeck
 */
public class Banco {
    Random rand = new Random();
    
    // A Java program for a Server 
    //initialize socket and input stream 
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    // constructor with port 
    public Banco(int port) {
        // starts server and waits for a connection 
        try {
            server = new ServerSocket(port);
            System.out.println("Server started");
            
            int autorizacion = 1;

            while (true) {
                
                System.out.println("Waiting for a client ...");
                
                socket = server.accept();
                System.out.println("Client accepted");

                // takes input from the client socket 
                in = new DataInputStream(
                        new BufferedInputStream(socket.getInputStream()));

                out = new DataOutputStream(
                        new BufferedOutputStream(socket.getOutputStream()));

                String line = "";

                String[] tarjetas = {"11921019;eri;09/21;1234", "0801199922654;david,12/20,1844"};
                
                boolean match = false;
                

                // reads message from client until "Over" is sent 
                try {
                    line = in.readUTF().toLowerCase();
                    for (int i = 0; i < tarjetas.length; i++) {
                        if (line.equals((tarjetas[i]).toLowerCase())) {
                            out.writeUTF("" + autorizacion);
                            autorizacion++;
                            match = true;
                            break;
                        }
                    }
                    if(!match) {
                        out.writeUTF("-1");
                    }
                    out.flush();
                    System.out.println(">" + line + "< " + tarjetas[0]);

                } catch (IOException i) {
                    System.out.println(i);
                }

                System.out.println("Closing connection");

                // close connection 
                //in.close();
                //out.close();
                socket.close();
                System.out.println("lol");
            }
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Banco server = new Banco(10000);
    }

}
