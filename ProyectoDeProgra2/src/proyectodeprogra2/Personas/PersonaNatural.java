/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodeprogra2.Personas;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author daba5
 */
public abstract class PersonaNatural extends Persona implements Serializable {
    
    protected String nickname;
    protected String password;
    protected String pais;
    protected Date birthday;
    protected double longitud;
    protected double latitud;
    
    public PersonaNatural() {
       
    }

    public PersonaNatural(String nickname, String password, String pais, Date birthday, String correo, String nombre) {
        super(correo, nombre);
        this.nickname = nickname;
        this.password = password;
        this.pais = pais;
        this.birthday = birthday;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
