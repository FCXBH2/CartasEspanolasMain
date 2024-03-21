/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cartasespanolasmain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class Juego {
    LinkedHashSet<Palo> CartaEspanola = new LinkedHashSet();
    public void LlenarBaraja(){
        CartaEspanola.removeAll(CartaEspanola);
        byte AUX=0;
        for(int i=0;i<40;i++){
            switch (AUX){
                case (0):
                    Palo espada = new Espada("Espada");
                    CartaEspanola.add(espada);
                    AUX=(byte) (Math.random() * 3);
                    break;
                case (1):
                    Palo oro = new Oro("Oro");
                    CartaEspanola.add(oro);
                    AUX=(byte) (Math.random() * 3);
                    break;
                case (2):
                    Palo bastos = new Bastos("Bastos");
                    CartaEspanola.add(bastos);
                    AUX=(byte) (Math.random() * 3);
                    break;
                case (3):
                    Palo copas = new Copas("Copa");
                    CartaEspanola.add(copas);
                    AUX=(byte) (Math.random() * 3);
                    if(AUX==3){
                        AUX=0;
                    }
                    break;
            }
        }
    }
    public void MostrarBaraja(){
        for(Palo P:CartaEspanola){
            System.out.println(P);
        }
    }
    public void BarajarFirst(){
        ArrayList<Palo> P = new ArrayList(CartaEspanola);
        Collections.sort(P, new OrdenNumero());
        CartaEspanola.removeAll(CartaEspanola);
        CartaEspanola.addAll(P);
    }
    public void BarajarSecond(){
        ArrayList<Palo> P = new ArrayList(CartaEspanola);
        Collections.sort(P, new OrdenNombre());
        CartaEspanola.removeAll(CartaEspanola);
        CartaEspanola.addAll(P);
    }
    public void BarajarThird(){
        ArrayList<Palo> P = new ArrayList(CartaEspanola);
        CartaEspanola.removeAll(CartaEspanola);
        CartaEspanola.addAll(P.reversed());
    }
    public Palo SiguienteCarta(){
        byte i=0;
        byte AUXI=(byte) (Math.random() * CartaEspanola.size());
        for(Palo P:CartaEspanola){
            if(i==AUXI && CartaEspanola.isEmpty()!=true){
                CartaEspanola.remove(P);
                return P;
            } else if (CartaEspanola.isEmpty()==true){
                JOptionPane.showInputDialog("No hay mas Cartas.");
                return null;
            }
            i++;
        }
        return null;
    }
    public byte Tamano(){
        return (byte) CartaEspanola.size();
    }
    public ArrayList<Palo> DarCartas(byte B){
        ArrayList<Palo> P = new ArrayList();
        
        return P;
    }
}
