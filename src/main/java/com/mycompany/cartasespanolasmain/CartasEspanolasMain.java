/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cartasespanolasmain;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class CartasEspanolasMain {

    public static void main(String[] args) {
        ArrayList<Palo> Jugador = new ArrayList();
        boolean Bucle=true;
        System.out.println("Cartas.");
        System.out.println("-------");
        Juego juego = new Juego();
        juego.LlenarBaraja();
        do
        {
            String S = JOptionPane.showInputDialog("Barajar / Siguiente Carta / Dar Cartas / Cartas Restantes / Cantidad Cartas / Cartas Jugador");
            if(S.equals("Barajar")){
                int Barajar=0;
                do
                {
                    Barajar=(byte) (Math.random() * 3);
                }while(Barajar==0);
                if(Barajar==1){
                    juego.BarajarFirst();
                } else if (Barajar==2){
                    juego.BarajarSecond();
                } else if (Barajar==3){
                    juego.BarajarThird();
                }
            }
            if(S.equals("Siguiente Carta")){
                Jugador.add(juego.SiguienteCarta());
            }
            if(S.equals("Cartas Restantes")){
                System.out.println("");
                System.out.println("------------------");
                juego.MostrarBaraja();
                System.out.println("------------------");
                System.out.println("");
            }
            if(S.equals("Cantidad Cartas")){
                JOptionPane.showMessageDialog(null, "Cartas Disponibles: "+ juego.Tamano());
            }
            if(S.equals("Cartas Jugador")){
                System.out.println("");
                    System.out.println("---------------------");
                for(Palo P:Jugador){
                    
                    System.out.println(P);
                    
                }
                System.out.println("---------------------");
                    System.out.println("");
            }
            if(S.equals("Dar Cartas")){
                byte AUXI=Byte.parseByte(JOptionPane.showInputDialog("Cantidad de Cartas que quieres recibir."));
                Jugador.addAll(juego.DarCartas(AUXI));
                
            }
        }while(Bucle==true);
    }
}
