/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cartasespanolasmain;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.shuffle;
import java.util.LinkedHashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class Juego { //Lo hice solo, no se si hacia falta realmente armar un grupo de 4...
    LinkedHashSet<Palo> CartaEspanola = new LinkedHashSet();
    ArrayList<Palo> AUX = new ArrayList();
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
    } // He hecho el metodo de manera que se pueda restablecer los valores y cantidades, para iniciar un nuevo juego si es el caso.
    public void MostrarBaraja(){
        for(Palo P:CartaEspanola){
            System.out.println(P);
        }
    } 
    public void Barajar(){ // Utilizando el metodo de las colecciones "Shuffle" pude ordenar esta Lista de Palos.
        ArrayList<Palo> P = new ArrayList(CartaEspanola);
        shuffle(P);
        CartaEspanola.removeAll(CartaEspanola); //Un orden sale y otro ingresa.
        CartaEspanola.addAll(P);
    }
    public Palo SiguienteCarta(){
        byte i=0;
        byte AUXI=(byte) (Math.random() * CartaEspanola.size());
        for(Palo P:CartaEspanola){
            if(i==AUXI && CartaEspanola.isEmpty()!=true){
                AUX.add(P);
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
    } // Retorna el tamaño del conjunto.
    public ArrayList<Palo> DarCartas(byte B){
        ArrayList<Palo> P = new ArrayList();
        if(CartaEspanola.size()<=B){
            for(int i=0;i<B;i++){
            AUX.add(CartaEspanola.getLast());
            P.add(CartaEspanola.getLast());
            CartaEspanola.removeLast();
            }
        }
        if(P.isEmpty()!=true){
            return P;
        }
        return null;
    } //Devuelve cierta cantidad de cartas que el usuario pidio.
    public void CartaMonton(){ //No entendi bien el Enunciado.
        System.out.println("Cartas Que ya han salido del conjunto");
        System.out.println("");
        System.out.println("-------------");
        for(Palo Lil:AUX){
            System.out.println(Lil);
        }
        System.out.println("-------------");
        System.out.println("");
    }
}
