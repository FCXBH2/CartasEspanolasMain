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
public class OrdenNombre implements Comparator<Palo> {

    @Override
    public int compare(Palo P1, Palo P2) {
        return P1.getPalo().compareTo(P2.getPalo());
    }
    
}
