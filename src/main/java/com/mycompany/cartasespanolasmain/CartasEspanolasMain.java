/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cartasespanolasmain;

import javax.swing.JOptionPane;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class CartasEspanolasMain {

    public static void main(String[] args) {
        
        boolean Bucle=true;
        System.out.println("Cartas.");
        System.out.println("-------");
        Juego juego = new Juego();
        juego.LlenarBaraja();
        do
        {
            String S = JOptionPane.showInputDialog("Barajar / Siguiente Carta / Cartas Restantes");
            if(S.equals("Barajar")){
                int Barajar=0;
                do
                {
                    Barajar=(byte) (Math.random() * 3);
                }while(Barajar==0);
                if(Barajar==1){
                    
                }
            }
            if(S.equals("Siguiente Carta")){
                juego.SiguienteCarta();
            }
            if(S.equals("Cartas Restantes")){
                System.out.println("");
                System.out.println("------------------");
                juego.MostrarBaraja();
                System.out.println("------------------");
                System.out.println("");
            }
        }while(Bucle==true);
    }
}
