/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;

/**
 *
 * @author jorge
 * @Matricula 14446
 * @Fecha 10/2/25
 */

// Clase para saber de si una lista cuales son par, none y cero
public class NonParCero {
    
    // Funcion para saber si hay none o pares o ceros en una lista
    // @Parametro numeros: La lista de numeros
    // @Parametro par: Para los pares
    // @Parametro none: Para los nones
    // @Parametro cero: Para los ceros
    public void calculate() {
        int[] numeros = {
            
            0, 2, 5, 8, 11, 14, 17, 20, 23, 26, 
            29, 32, 35, 38, 41, 44, 47, 50, 53, 56, 
            59, 62, 65, 68, 71, 74, 77, 80, 83, 86, 
            89, 92, 95, 98, 0, 3, 6, 9, 12, 15, 
            18, 21, 24, 27, 30, 33, 36, 39, 42, 45
        };
        
        int par = 0;
        int none = 0;
        int cero = 0;
        for (int i = 0; i < numeros.length; i++) {  // (int number : numeros)
        if(numeros[i] == 0) {
            cero += 1; //cero++
        } else if ((numeros[i] % 2) == 0) {
            par += 1; //par++
        } else {
            none += 1; //none++
        }
        }
    
        System.out.println("Total de números pares: " + par);
        System.out.println("Total de números nones: " + none);
        System.out.println("Total de ceros: " + cero);
    }
}
