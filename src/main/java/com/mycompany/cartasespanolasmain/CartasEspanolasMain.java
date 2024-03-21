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
        try{
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
                juego.Barajar();
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
            if(S.equals("Cartas Monton")){
                juego.CartaMonton();
            }
        }while(Bucle==true);
        } catch(Exception E){ // Esto lo hago por si ocurre una exception
            System.out.println("Por ahora solo una Exception en general: "+E.fillInStackTrace());
        } finally{
            JOptionPane.showMessageDialog(null, "Saliendo del finally...");
        }
    }
}
