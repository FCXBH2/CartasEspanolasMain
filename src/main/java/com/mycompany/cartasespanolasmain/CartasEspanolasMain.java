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
            ArrayList<Jugador> J = new ArrayList();
            boolean Bucle=true;
            byte AUXB=0;
            byte Numero_Jugadores=0;
            
            do
            {
                Numero_Jugadores=Byte.parseByte(JOptionPane.showInputDialog("Cantidad de jugadores(Maximo 4)"));
                AUXB=Numero_Jugadores;
            }while(Numero_Jugadores<=0 && Numero_Jugadores>=5);
            for(int i=0;i<Numero_Jugadores;i++){
                Jugador J1 = new Jugador(JOptionPane.showInputDialog("Nombre del Jugador "+(i+1)));
                J.add(J1);
            }
            System.out.println("                                                              Cantidad de Jugadores: "+Numero_Jugadores);
            System.out.println("                                                              ------------------------");
            Juego juego = new Juego();
            juego.LlenarBaraja();
            Numero_Jugadores=0;
            do
            {
                for(int i=0;i<AUXB-1;i++){
                    J.get(i).setTurno(false);
                }
                J.get(Numero_Jugadores).setTurno(true);
                
            String S = JOptionPane.showInputDialog("Turno del Jugador "+J.get(Numero_Jugadores).getNombre()+"  ||  Siguiente Carta / Dar Cartas / Otro Menu");
            if(S.equals("Siguiente Carta")){
                if(J.get(Numero_Jugadores).isTurno()==true){
                    J.get(Numero_Jugadores).getP().add(juego.SiguienteCarta());
                }
            }
            if(S.equals("Dar Cartas")){
                byte AUXI=Byte.parseByte(JOptionPane.showInputDialog("Cantidad de Cartas que quieres recibir."));
                J.get(Numero_Jugadores).getP().addAll(juego.DarCartas(AUXI));
                
            }
            if(S.equals("Otro Menu")){
                String SX=JOptionPane.showInputDialog("Barajar / Cantidad Cartas / Cartas Jugador / Cartas Restantes / Cartas Monton");
                if(SX.equals("Barajar")){
                juego.Barajar();
                }
                if(SX.equals("Cartas Monton")){
                juego.CartaMonton();
                }
                if(SX.equals("Cartas Restantes")){
                System.out.println("");
                System.out.println("------------------");
                juego.MostrarBaraja();
                System.out.println("------------------");
                System.out.println("");
                }
                if(SX.equals("Cantidad Cartas")){
                JOptionPane.showMessageDialog(null, "Cartas Disponibles: "+ juego.Tamano());
                }
                if(SX.equals("Cartas Jugador")){ //Esto es solo opcional, para saber si realmente esta agarrando las cartas, no tiene relevancia en el proyecto.
                System.out.println("--------------------------");
                System.out.println("Cartas del Jugador "+J.get(Numero_Jugadores).getNombre());
                System.out.println(J.get(Numero_Jugadores).getP());
                System.out.println("--------------------------");
                System.out.println("");
                }
                
            }
            if(Numero_Jugadores>=AUXB-1){
                Numero_Jugadores=0;
            } else {
                Numero_Jugadores++;
            }
        }while(Bucle==true);
        } catch(Exception E){ // Esto lo hago por si ocurre una exception
            System.out.println("Por ahora solo una Exception en general: "+E.fillInStackTrace());
        } finally{
            JOptionPane.showMessageDialog(null, "Saliendo del finally...");
        }
    }
}
