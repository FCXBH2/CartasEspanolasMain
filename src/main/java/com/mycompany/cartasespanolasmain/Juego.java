/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cartasespanolasmain;

import java.util.LinkedHashSet;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class Juego {
    LinkedHashSet<Palo> CartaEspanola = new LinkedHashSet();
    public void LlenarBaraja(){
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
}
