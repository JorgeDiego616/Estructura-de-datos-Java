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

// La clase calcula de unas compras el total con IVA
public class Excercise2 {
    
    // Calcula su total con el IVA
    // @Parametro ventas: El arreglo
    // @Parametro total: Para el total
    public void calculateIVASales() {
        int[] ventas = {300,250,890,39,590};
        double total = 0;
        
        for(int i = 0;i < ventas.length;i++) {
            total += (ventas[i]*1.16);
            System.out.println(total);
        }
        
        System.out.println("El total a pagar es de: " + total);
    }
}
