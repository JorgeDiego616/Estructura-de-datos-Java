/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;

/**
 *
 * @author jorge
 * @Matricula 14446
 * @Fecha 24/2/25
 */

// Clase que calcula el total con descuento
public class SalesWithDiscount {
    
    // Suma todo con el descuento
    // @Parametro sales: ventas
    // @Parametros total: Total con descuento
    public double totalWithDiscount() {
        double[] sales = {100,200,150};
        double total = 0;
            
        for(int i = 0;i < sales.length;i++) {
            total += (sales[i]*0.9);
        }
        return total;
    }
}
