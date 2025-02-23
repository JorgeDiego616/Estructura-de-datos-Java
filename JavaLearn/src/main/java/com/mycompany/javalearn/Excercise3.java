/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;

/**
 *
 * @author jorge
 */
public class Excercise3 {
    public void sumaValoresArregloBidimensional() {
        int[][] matriz = {
            {10,30,25,4},
            {12,21,995,2}
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
