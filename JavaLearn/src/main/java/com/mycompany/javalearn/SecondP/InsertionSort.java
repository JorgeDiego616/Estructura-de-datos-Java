/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn.SecondP;

/**
 *
 * @author jorge
 * @Matricula 14446
 * @Fecha 6/3/25
 */

// Notacion O(n^2) => T(n) = (n(n - 1)) / 2

// Clase para ordenar un arreglo de menor a mayor usando el insertion sort: compara 2 elementos empezando por el primero y el segundo elemento y va moviendo a la derecha los mas grandes y compara cada uno
// @Parametro array: Lista de numeros.
public class InsertionSort {
    int[] array = {10,9,8,7,6,5,4,3,2,1};
    
    // Esta funcion ordena un arreglo
    // @Parametro numOpe: mumero de operaciones
    // @Parametro length: longitud del arreglo
    // @Parametro key: el dato a cambiar
    // @Parametro j: uno anterior al key
    public void sort() {
        int numOpe = 0;
        int length = array.length;
        for(int i = 1;i < length; i++) {
            int key = array[i];
            int j = i-1;
            //numOpe += 1;
            
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
                numOpe += 1;
            }
            array[j + 1] = key;
            //numOpe += 1;
            //System.out.println(array);
        }
        
        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            System.out.println(j);
            //System.out.println("Operaciones: " + numOpe); 
        }
        System.out.println("Operaciones: " + numOpe);
        //System.out.println("Final" + array);
    }
}
