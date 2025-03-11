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
// Clase que ordena un arreglo de forma Selection sort: Analiza el arreglo y toma el mas pequeño y lo acomoda, luego toma el mas pequeño de los demas elementos y los acomodoa y asi se va.
public class SelectionSort {
    
    // Funcion que ordena un arreglo
    // @Parametro n: longitud del arreglo
    // @Parametro comparisons: numero de operaciones
    // @Parametro minIndex: numero a comparar del arreglo
    // @Parametro temp: Valor del arreglo a sustituir
    public int selectionSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++; // Incrementa el contador de comparaciones
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambio de elementos
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return comparisons; // Devuelve el total de comparaciones
    }
}

