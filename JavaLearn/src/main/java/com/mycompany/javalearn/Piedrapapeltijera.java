/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;

/**
 *
 * @author jorge
 * @Matrícula 14446
 * @Fecha 4/2/25
 */

import java.util.Random;

public class Piedrapapeltijera {
    // Funcion que simula el juego de priedra papel y tijera
    // @Parametro gameChoices: Para las opciones a elegir del juego 
    public void game() {
        String[] gameChoices = {"Piedra", "Papel", "Tijera"};
        Random random = new Random();
        //String[] eleccion = {};
        //for (int i = 0; i < 2; i++) {
            //int E = random.nextInt(gamee.length);
            //eleccion[i] = gamee[E];
        //}
        
        int eleccionJugador1 = random.nextInt(gameChoices.length);
        String eleccion1 = gameChoices[eleccionJugador1];
        
        int eleccionJugador2 = random.nextInt(gameChoices.length);
        String eleccion2 = gameChoices[eleccionJugador2];
        
        if(eleccionJugador1 == eleccionJugador2) {
    
            System.out.println("Empate");
            System.out.println("Jugador 1 = " + eleccion1 + " Jugador 2 = " + eleccion2);
            
        } else if (eleccionJugador1 == 1 && eleccionJugador2 == 0) {
            System.out.println("Jugador 1 gana");
            System.out.println("Jugador 1 = " + eleccion1 + " Jugador 2 = " + eleccion2);
        
        } else if (eleccionJugador1 == 0 && eleccionJugador2 == 2) {
            System.out.println("Jugador 1 gana");
            System.out.println("Jugador 1 = " + eleccion1 + " Jugador 2 = " + eleccion2);
            
        } else if (eleccionJugador1 == 2 && eleccionJugador2 == 1) {
            System.out.println("Jugador 1 gana");
            System.out.println("Jugador 1 = " + eleccion1 + " Jugador 2 = " + eleccion2);
            
        } else {
            System.out.println("Jugador 2 gana");
            System.out.println("Jugador 1 = " + eleccion1 + " Jugador 2 = " + eleccion2);
            
        }
        
        //int E = random.nextInt(gamee.length);
        //String eleccion1 = gamee[E];
        //System.out.println(gamee[E]);
    }
}
