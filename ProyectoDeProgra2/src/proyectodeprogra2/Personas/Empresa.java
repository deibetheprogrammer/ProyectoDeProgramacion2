/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodeprogra2.Personas;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author daba5
 */
public class Empresa extends Persona implements Serializable {
    
    private String mision;
    private String vision;
    private String objetivos;
    private String politicas;
    private ArrayList<String> contactNumbers = new ArrayList<>();
    private String direccion;
    private double latitud;
    private double longitud;

    public Empresa() {
    }

    public Empresa(String mision, String vision, String objetivos, String politicas, String direccion, double latitud, double longitud, String correo, String nombre) {
        super(correo, nombre);
        this.mision = mision;
        this.vision = vision;
        this.objetivos = objetivos;
        this.politicas = politicas;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getPoliticas() {
        return politicas;
    }

    public void setPoliticas(String politicas) {
        this.politicas = politicas;
    }

    public ArrayList<String> getContactNumbers() {
        return contactNumbers;
    }

    public void setContactNumbers(ArrayList<String> contactNumbers) {
        this.contactNumbers = contactNumbers;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Empresa{" + "mision=" + mision + ", vision=" + vision + ", objetivos=" + objetivos + ", politicas=" + politicas + ", contactNumbers=" + contactNumbers + ", direccion=" + direccion + ", latitud=" + latitud + ", longitud=" + longitud + '}';
    }
    
}
