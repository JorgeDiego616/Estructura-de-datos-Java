/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;

/**
 *
 * @author jorge
 */
public class MultidimensionalArray {
    public void printbidimensionalArray() {
        // Declaracion e inicializacion de un arreglo 2x2
        int[][] matrix = {
            {1, 2}, // [0][0] = 1 [0][1] = 1
            {3, 4} // [1][0] = 3 [1][1] = 4
        };
        
        // Recorrer e imprimir la matrix
        for (int i = 0; i < matrix.length; i++) {
            //System.out.println("Fila numero " + i);
            System.out.println("Longitud de la fila " + matrix[i].length);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
