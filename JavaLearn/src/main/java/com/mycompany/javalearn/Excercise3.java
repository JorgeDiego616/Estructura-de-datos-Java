/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;

/**
 *
 * @author jorge
 * @Matricula 14446
 * @Fecha 23/2/25
 */

// La clase suma los valores de un arreglo de 3 listas
public class Excercise3 {
    
    // Suma los valores de cada lista
    // @Parametro matriz: El arreglo Bidimensional
    // @Parametro total: Total de la suma
    public void sumaValoresArregloBidimensional() {
        int[][] matriz = {
            {10,30,25,4},
            {12,21,995,2},
            {23,11,5,9}
        };
        
        int total = 0;
        
        for (int i = 0;i < matriz.length;i++) {
            for(int j = 0;j < matriz[i].length;j++) {
                total += matriz[i][j];
            }
        }
        
        System.out.println("La suma de todos los elementos de un arreglo bidimensional: " + total);
    }
}
