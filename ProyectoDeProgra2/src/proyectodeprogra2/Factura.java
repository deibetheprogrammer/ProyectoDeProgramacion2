/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodeprogra2;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author davidbendeck
 */
public class Factura implements Serializable {
    
    private String cliente;
    private String ofertador;
    private String descripcion;
    private String precio;
    private LocalDate fecha;
    private int numero;

    public Factura() {
    }

    public Factura(String cliente, String ofertador, String descripcion, String precio, LocalDate fecha, int numero) {
        this.cliente = cliente;
        this.ofertador = ofertador;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = fecha;
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getOfertador() {
        return ofertador;
    }

    public void setOfertador(String ofertador) {
        this.ofertador = ofertador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "" + numero;
    }
    
    
    
}
