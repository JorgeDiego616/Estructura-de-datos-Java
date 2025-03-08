/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn.SecondP;

/**
 *
 * @author jorge
 */
public class InsertionSortExample {
    int[] arr = {10,9,8,7,6,5,4,3,2,1}; // Peor caso (orden inverso)

    public void insertionSort() {
        int n = arr.length; // mi longitud
        int operaciones = 0; // cuenta mis operaciones
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                //j = j - 1;
                operaciones++;
            }
            arr[j + 1] = key;
        }
        
        System.out.println("Numero de operaciones: " + operaciones);
        //return operaciones;
    }
}
