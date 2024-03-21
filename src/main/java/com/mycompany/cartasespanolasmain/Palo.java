/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cartasespanolasmain;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public abstract class Palo {
    private byte numero;
    private String palo="Palo";
    public Palo(String Palo){
        this.palo=Palo;
        do
        {
            numero= (byte) (Math.random() * 12);
        }while(numero==9 || numero==8 || numero==0);
    }

    @Override
    public String toString() {
        return "Carta: " + "numero: " + numero + ", palo: " + palo + ".";
    }

    public byte getNumero() {
        return numero;
    }
    public String getPalo() {
        return palo;
    }

    
}
