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
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import proyectodeprogra2.Personas.Cliente;
import proyectodeprogra2.Personas.Ofertador;

/**
 *
 * @author daba5
 */
public class ProyectoDeProgra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Ofertador> ofertadores = new ArrayList<>();
    
        ofertadores.add(new Ofertador("Danshou","BlackBull2017", "Japan", "08/08/1957", "yami@blackbull.com", "Yami Sukehiro"));
        ofertadores.add(new Ofertador("The gray wanderer","ACoolMaiar3rdAge", "Middle-Earth", "12/11/1900", "Maiar@Mordor.vom", "Gandalf"));
        ofertadores.add(new Ofertador("Fastest thing alive","HotDogsAndF4st", "United States", "11/10/2000", "Sonic@speed.com", "Sonic"));
        
        System.out.println("Clientes creados:");
        int nclientes = guardarOfertadores(ofertadores);
        System.out.println(nclientes);
        
        System.out.println("Clientes leidos:");
        nclientes = leerOfertadores(ofertadores,nclientes);
        System.out.println(nclientes);
        
        for (Ofertador ofertador : ofertadores) {
            System.out.println(ofertador.toString());
        }
    }
    
    public static int guardarClientes(ArrayList<Cliente> clientes){
        int count = 0;
        try (XMLEncoder e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("Clientes.xml")))) {
            for (Cliente cliente : clientes) {
                e.writeObject(cliente);
                count++;
            }
        }
        catch(Exception e) {
            System.out.println("Excpetion");
        }
        return count;
    }
    
    public static int leerClientes(ArrayList<Cliente> clientes, int n) {
        int count = 0;
        try (
                XMLDecoder d = new XMLDecoder(new BufferedInputStream(new FileInputStream("Clientes.xml")));) {
            for (int i = 0; i < n; i++) {
                clientes.add((Cliente) d.readObject());
                count++;
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
        return count;
    }
    
    public static int guardarOfertadores(ArrayList<Ofertador> ofertadores) {
        int count = 0;
        try (
                FileOutputStream f = new FileOutputStream("Ofertadores.txt");
                ObjectOutput o = new ObjectOutputStream(f);) {
            for (Ofertador ofertador : ofertadores) {
                o.writeObject(ofertador);
                count++;
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
        return count;
    }
    
    public static int leerOfertadores(ArrayList<Ofertador> ofertadores, int n) {
        int count = 0;
        try (
                FileInputStream fi = new FileInputStream("Ofertadores.txt");
                ObjectInputStream oi = new ObjectInputStream(fi);) {
            while (true) {
                ofertadores.add((Ofertador) oi.readObject());
                count++;
            }

        } catch (Exception e) {
            System.out.println("Excpetion");
        }
        return count;
    }
}
