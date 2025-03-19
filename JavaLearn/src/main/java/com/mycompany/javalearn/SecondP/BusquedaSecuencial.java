/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn.SecondP;

/**
 *
 * @author jorge
 */
public class BusquedaSecuencial {
    public int busqueda(int numero) {
        int index = -1;
        int[] arreglo = {10,9,8,7,6,5,4,3,2,1};
        for(int i = 0;i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                index = i;
            } 
        }
        return index;
    }
}
