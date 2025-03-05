/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn.SecondP;

/**
 *
 * @author jorge
 */
public class Mainn {
    public static void main(String[] args) {
    
        //InsertionSort objInsertionSort = new InsertionSort();
        //objInsertionSort.sort();
        
        
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        SelectionSort objSelectionSort = new SelectionSort();
        objSelectionSort.selectionSort(arr);
        System.out.println("Numero de operaciones: " + objSelectionSort.selectionSort(arr));
    }
}
