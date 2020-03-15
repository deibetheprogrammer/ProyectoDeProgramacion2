/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodeprogra2;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author davidbendeck
 */
public class Vehiculo implements Serializable {
    
    private String nickname;
    private String marca;
    private String modelo;
    private Date year;
    private String cilindraje;
    private String tipo;
    private String transmision;

    public Vehiculo() {
    }

    public Vehiculo(String nickname, String marca, String modelo, Date year, String cilindraje, String tipo, String transmision) {
        this.nickname = nickname;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.cilindraje = cilindraje;
        this.tipo = tipo;
        this.transmision = transmision;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
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
        return marca;
    }
    
}
