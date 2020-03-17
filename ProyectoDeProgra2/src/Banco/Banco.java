/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;
import java.net.*; 
import java.io.*; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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

        
                // reads message from client until "Over" is sent 
                try {
                    line = in.readUTF();
                    String[] campos = line.split(";");
                    int saldo = leerTarjetas(campos[0], campos[1].toLowerCase(), campos[2], campos[3]);
                    if (saldo == -1) {
                        out.writeUTF("-1");
                    }
                    int precio = Integer.parseInt(campos[4]);
                    int nuevoSaldo = saldo - precio;
                    if(nuevoSaldo < 0) {
                        out.writeUTF("-2");
                    } else {
                        if (actualizarSaldo(nuevoSaldo, campos[0]) > 0) {
                            out.writeUTF(Integer.toString(autorizacion));
                        } else {
                            out.writeUTF("-3");
                        }
                    }
                    out.flush();
                    //System.out.println(">" + line + "< " + tarjetas[0]);

                } catch (IOException i) {
                    System.out.println(i);
                }

                System.out.println("Closing connection");

                // close connection 
                //in.close();
                //out.close();
                socket.close();
                //System.out.println("lol");
            }
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Banco server = new Banco(10000);
    }
    
    public static int leerTarjetas(String numero, String nombre, String fechaV, String codigo) {
        
        int saldo  = -1;
        try {
            java.sql.Connection con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/proyecto2db", "david", "1844");
                   // "jdbc:derby://localhost:1527/sample", "app", "app");
            
            System.out.println("Conexion exitosa");
            java.sql.Statement stmt = (java.sql.Statement) con.createStatement();
            String sqlRead = "SELECT* FROM TARJETAS WHERE NUMERO=";
            sqlRead += "'" + numero ;
            sqlRead += "' AND NOMBRE=";
            sqlRead += "'" + nombre ; 
            sqlRead += "' AND VENCIMIENTO=";
            sqlRead += "'" + fechaV ;
            sqlRead += "' AND CODIGO=";
            sqlRead += "'" + codigo + "'";
            System.out.println(sqlRead);
            ResultSet rs = stmt.executeQuery(sqlRead);
            
            if (rs.next()) {
                saldo = rs.getInt("SALDO");
            }

        } catch (SQLException ex) {
            System.out.println("Error Sql"+ex);
        }
        return saldo;
    }
    
    public static int actualizarSaldo(int nuevoSaldo,String numero) {
        int result = -1;
        try {
            java.sql.Connection con = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/proyecto2db", "david", "1844");
            java.sql.Statement stmt = (java.sql.Statement) con.createStatement() ;
            String sqlIns = "UPDATE TARJETAS SET SALDO =";
            sqlIns +=  nuevoSaldo + " ";
            sqlIns += "WHERE NUMERO=";
            sqlIns += "'" + numero + "'";
            System.out.println("sql "+sqlIns);
            result = stmt.executeUpdate(sqlIns);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return result;
    }

}
