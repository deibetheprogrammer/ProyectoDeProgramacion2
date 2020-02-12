/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodeprogra2.Personas;

import java.io.Serializable;

/**
 *
 * @author daba5
 */
public abstract class Persona implements Serializable{
    
    //Falta ubicación geográfica
    protected String correo;
    protected String nombre;
    
    public Persona() {
        
    }

    public Persona(String correo, String nombre) {
        this.correo = correo;
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "correo=" + correo + ", nombre=" + nombre + '}';
    }
    
    
    
}
