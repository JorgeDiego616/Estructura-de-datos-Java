/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn.SecondP;

/**
 *
 * @author jorge
 */
public class BusquedaBinaria {
     public int busquedaBinaria(int[] arr, int objetivo) {
        int ope = 0;
        int inicio = 0;  // Índice del primer elemento del arreglo
        int fin = arr.length - 1;  // Índice del último elemento del arreglo
        
        // Mientras el inicio no sea mayor que el fin, seguimos buscando
        while (inicio <= fin) {
            ope ++;
            int medio = (inicio + fin) / 2;  // Índice del elemento central entre inicio y fin
            
            // Si el valor medio es el que estamos buscando, retornamos el índice
            if (arr[medio] == objetivo) {
                System.out.println("Numero de operaciones: " + ope);
                return medio; 
            }
            
            // Si el objetivo es mayor que el valor medio, buscamos en la mitad derecha
            else if (arr[medio] < objetivo) {
                fin = medio - 1;  // Ajustamos el fin para buscar a la izquierda
            }
            
            // Si el objetivo es menor que el valor medio, buscamos en la mitad izquierda
            else {
                inicio = medio + 1;  // Ajustamos el inicio para buscar a la derecha
            }
        }
        System.out.println("Numero de operaciones: " + ope);
        
        // Si no encontramos el objetivo, retornamos -1
        return -1;
    }

}
