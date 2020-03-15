/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodeprogra2.Personas;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author daba5
 */
public class Ofertador extends PersonaNatural implements Serializable {
    
    private boolean membresia_VentaDirecta;

    public Ofertador() {
    }

    public Ofertador(String nickname, String password, String pais, Date birthday, double latitud, double longitud, String correo, String nombre) {
        super(nickname, password, pais, birthday, latitud, longitud, correo, nombre);
    }
    
    @Override
    public String toString() {
        return String.format("Nickname: %s%nPassword: %s%nPais: %s%nFecha de nacimiento: %s%nCorreo: %s%nNombre: %s%n",nickname,password,pais,birthday,correo,nombre);
    }

    public boolean isMembresia_VentaDirecta() {
        return membresia_VentaDirecta;
    }

    public void setMembresia_VentaDirecta(boolean membresia_VentaDirecta) {
        this.membresia_VentaDirecta = membresia_VentaDirecta;
    }
}
