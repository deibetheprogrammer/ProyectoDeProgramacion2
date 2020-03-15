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
    private ArrayList<Integer> contactNumbers = new ArrayList<>();
    private String direccion;

    public Empresa(String mision, String vision, String objetivos, String politicas, String direccion, String correo, String nombre) {
        super(correo, nombre);
        this.mision = mision;
        this.vision = vision;
        this.objetivos = objetivos;
        this.politicas = politicas;
        this.direccion = direccion;
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

    public ArrayList<Integer> getContactNumbers() {
        return contactNumbers;
    }

    public void setContactNumbers(ArrayList<Integer> contactNumbers) {
        this.contactNumbers = contactNumbers;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
}
