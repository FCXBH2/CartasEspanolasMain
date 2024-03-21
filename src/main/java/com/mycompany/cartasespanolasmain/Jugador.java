/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cartasespanolasmain;

import java.util.ArrayList;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class Jugador {
    String Nombre;
    boolean Turno=false;
    ArrayList<Palo> P = new ArrayList();
    public Jugador(String Nombre){
        this.Nombre=Nombre;
    }
    public ArrayList<Palo> getP() {
        return P;
    }

    public boolean isTurno() {
        return Turno;
    }

    public void setTurno(boolean Turno) {
        this.Turno = Turno;
    }

    public String getNombre() {
        return Nombre;
    }
    
}
