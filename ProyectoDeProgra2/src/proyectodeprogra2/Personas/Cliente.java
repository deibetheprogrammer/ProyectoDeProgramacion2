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
public class Cliente extends PersonaNatural implements Serializable {
    
    
    public Cliente() {
        
    }

    public Cliente(String nickname, String password, String pais, Date birthday, double latitud, double longitud, boolean membresia, Date contratacion, String correo, String nombre) {
        super(nickname, password, pais, birthday, latitud, longitud, membresia, contratacion, correo, nombre);
    }

    @Override
    public String toString() {
        return nickname;
    }
    
    
}
