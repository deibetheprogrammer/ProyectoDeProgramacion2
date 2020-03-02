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
    
    private boolean membresia;
    
    public Cliente() {
        
    }

    public Cliente(String nickname, String password, String pais, Date birthday, String correo, String nombre) {
        super(nickname, password, pais, birthday, correo, nombre);
    }

    public boolean isMembresia() {
        return membresia;
    }

    public void setMembresia(boolean membresia) {
        this.membresia = membresia;
    }

    @Override
    public String toString() {
        return String.format("Nickname: %s%nPassword: %s%nPais: %s%nFecha de nacimiento: %s%nCorreo: %s%nNombre: %s%n",nickname,password,pais,birthday,correo,nombre);
    }
    
    
}
