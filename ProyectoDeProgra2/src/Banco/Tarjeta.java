/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author davidbendeck
 */
public class Tarjeta {
    
    private String numero;
    private String nombre;
    private String fechaV;
    private String codigo;
    private int dinero;

    public Tarjeta() {
    }

    public Tarjeta(String numero, String nombre, String fechaV, String codigo, int dinero) {
        this.numero = numero;
        this.nombre = nombre;
        this.fechaV = fechaV;
        this.codigo = codigo;
        this.dinero = dinero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaV() {
        return fechaV;
    }

    public void setFechaV(String fechaV) {
        this.fechaV = fechaV;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return numero ;
    }
    
    
}
