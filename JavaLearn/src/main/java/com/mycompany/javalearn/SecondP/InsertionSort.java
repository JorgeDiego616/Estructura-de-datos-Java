/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn.SecondP;

/**
 *
 * @author jorge
 */
public class InsertionSort {
    
    int[] array = {10,9,8,7,6,5,4,3,2,1};
    public void sort() {
        int numOpe = 0;
        int length = array.length;
        for(int i = 1;i < length; i++) {
            int key = array[i];
            int j = i-1;
            //numOpe += 1;
            
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
                numOpe += 1;
            }
            array[j + 1] = key;
            //numOpe += 1;
            //System.out.println(array);
        }
        
        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            System.out.println(j);
            //System.out.println("Operaciones: " + numOpe); 
        }
        System.out.println("Operaciones: " + numOpe);
        //System.out.println("Final" + array);
    }
}
