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
        
        
        int[] arr = {5,4,3,2,1};
        
        //SelectionSort objSelectionSort = new SelectionSort();
        //objSelectionSort.selectionSort(arr);
        //System.out.println("Numero de operaciones: " + objSelectionSort.selectionSort(arr));
        
        BubbleSort objBubbleSort = new BubbleSort();
        objBubbleSort.bubbleSort(arr);
        System.out.println("El numero de operaciones es: " + objBubbleSort.bubbleSort(arr));
        
        
        
        int[] arrr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Peor caso (orden inverso)
    
        //InsertionSortExample objInsertionSortExample = new InsertionSortExample();
        //objInsertionSortExample.insertionSort();
        //System.out.println("Número de operaciones: " + objInsertionSortExample.insertionSort());

        //SelectionSortExample objSelectionSortExample = new SelectionSortExample();
        //objSelectionSortExample.sort(arrr);
        //System.out.println("Número de operaciones: " + objSelectionSortExample.sort(arrr));

        //bubbleSortExample objBubbleSortExample = new bubbleSortExample();
        //objBubbleSortExample.bubbleSort(arrr);
        //System.out.println("Número de comparaciones: " + objBubbleSortExample.bubbleSort(arrr));
    }
}
