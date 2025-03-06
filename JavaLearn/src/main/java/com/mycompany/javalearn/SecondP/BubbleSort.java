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

// Clase que ordena un arreglo de menor a mayor usando el estilo Bubble sort: Analiza el arreglo dividiendo el contenido en pares y por pares ve cual es el mas pequeño y lo posiciones y asi se va.
public class BubbleSort {
    
    // Funcion que ordena un arreglo en orden
    // @Parametro n: Longitud de del arreglo
    // @Parametro comparisons: numero de operaciones
    // @Parametro temp: Para hacer el cambio de la variable
    public int bubbleSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0; // Contador de comparaciones

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                comparisons++; // Contar comparaciones
                if (arr[j] > arr[j + 1]) {
                    
                    // Intercambio
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return comparisons;
    }
}
