/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cartasespanolasmain;

import java.util.Comparator;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class OrdenNumero implements Comparator<Palo> {
    @Override
    public int compare(Palo P1, Palo P2) {
        if(P1.getNumero()>P2.getNumero()) return 1;
        if(P2.getNumero()==P2.getNumero()) return -1;
        return 0;
    }
}
