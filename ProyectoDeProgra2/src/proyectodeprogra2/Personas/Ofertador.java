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
    private boolean membresia_VentaSubasta;
    private boolean membresia_Renta;
    private boolean membresia_Carwash;

    public Ofertador() {
    }
  
    public Ofertador(String nickname, String password, String pais, String birthday, String correo, String nombre) {
        super(nickname, password, pais, birthday, correo, nombre);
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

    public boolean isMembresia_VentaSubasta() {
        return membresia_VentaSubasta;
    }

    public void setMembresia_VentaSubasta(boolean membresia_VentaSubasta) {
        this.membresia_VentaSubasta = membresia_VentaSubasta;
    }

    public boolean isMembresia_Renta() {
        return membresia_Renta;
    }

    public void setMembresia_Renta(boolean membresia_Renta) {
        this.membresia_Renta = membresia_Renta;
    }

    public boolean isMembresia_Carwash() {
        return membresia_Carwash;
    }

    public void setMembresia_Carwash(boolean membresia_Carwash) {
        this.membresia_Carwash = membresia_Carwash;
    }
    
    
}
