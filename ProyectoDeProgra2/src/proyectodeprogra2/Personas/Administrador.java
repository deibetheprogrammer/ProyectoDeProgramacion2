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
public class Administrador extends PersonaNatural implements Serializable {

    public Administrador() {
    }

    public Administrador(String nickname, String password, String pais, Date birthday, String correo, String nombre) {
        super(nickname, password, pais, birthday, correo, nombre);
    }


}
