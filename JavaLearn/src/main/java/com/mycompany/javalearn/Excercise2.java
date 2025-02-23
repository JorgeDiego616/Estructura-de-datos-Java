/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;

/**
 *
 * @author jorge
 */
public class Excercise2 {
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
