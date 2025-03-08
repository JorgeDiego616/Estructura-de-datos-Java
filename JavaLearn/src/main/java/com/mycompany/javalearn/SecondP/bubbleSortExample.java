/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn.SecondP;

/**
 *
 * @author jorge
 */
public class bubbleSortExample {
    public  int bubbleSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0; // cuenta mis comparaciones
       for (int i = 0; i < n - 1; i++) {
            
            for (int j = 0; j < n - 1 - i; j++) {
               comparisons++;
               
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; // Intercambio de elementos
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            } 
        }
        return comparisons;
    }
}
