/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodeprogra2;

/**
 *
 * @author davidbendeck
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int year;
    private String cilindraje;
    private String tipo;
    private String transmision;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int year, String cilindraje, String tipo, String transmision) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.cilindraje = cilindraje;
        this.tipo = tipo;
        this.transmision = transmision;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", year=" + year + ", cilindraje=" + cilindraje + ", tipo=" + tipo + ", transmision=" + transmision + '}';
    }
    
}
