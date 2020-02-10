/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodeprogra2;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import proyectodeprogra2.Personas.Cliente;

/**
 *
 * @author daba5
 */
public class ProyectoDeProgra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        // TODO code application logic here
        
        ArrayList<Cliente> clientes = new ArrayList<>();
    
        clientes.add(new Cliente("Danshou","BlackBull2017", "Japan", "08/08/1957", "yami@blackbull.com", "Yami Sukehiro"));
        clientes.add(new Cliente("The gray wanderer","ACoolMaiar3rdAge", "Middle-Earth", "12/11/1900", "Maiar@Mordor.vom", "Gandalf"));
        clientes.add(new Cliente("Fastest thing alive","HotDogsAndF4st", "United States", "11/10/2000", "Sonic@speed.com", "Sonic"));
        
        System.out.println(clientes.get(0).getBirthday());
        
        System.out.println("Clientes creados:");
        int nclientes = guardarClientes(clientes);
        System.out.println(nclientes);
        
        System.out.println("Clientes leidos:");
        nclientes = leerClientes(clientes,nclientes);
        System.out.println(nclientes);
        
        clientes.forEach((cliente) -> {
            System.out.println(cliente);
        });
    }
    
    public static int guardarClientes(ArrayList<Cliente> clientes) throws FileNotFoundException {
        int count = 0;
        try (XMLEncoder e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("Clientes.xml")))) {
            for (Cliente cliente : clientes) {
                e.writeObject(cliente);
                count++;
            }
        }
        return count;
    }
    
    public static int leerClientes(ArrayList<Cliente> clientes, int n) throws FileNotFoundException {
        int count = 0;
        XMLDecoder d = new XMLDecoder(new BufferedInputStream(new FileInputStream("Clientes.xml")));
        for (int i = 0; i < n; i++) {
            clientes.add((Cliente) d.readObject());
            count++;
        }
        return count;
    }
}
