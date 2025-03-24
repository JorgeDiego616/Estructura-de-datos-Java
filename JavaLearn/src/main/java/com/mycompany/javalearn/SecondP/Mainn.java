/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn.SecondP;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Mainn {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        //InsertionSort objInsertionSort = new InsertionSort();
        //objInsertionSort.sort();
        
        
        int[] arr = {5,4,3,2,1};
        
        //SelectionSort objSelectionSort = new SelectionSort();
        //objSelectionSort.selectionSort(arr);
        //System.out.println("Numero de operaciones: " + objSelectionSort.selectionSort(arr));
        
        //BubbleSort objBubbleSort = new BubbleSort();
        //objBubbleSort.bubbleSort(arr);
        //System.out.println("El numero de operaciones es: " + objBubbleSort.bubbleSort(arr));
        
        
        
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
        
        
        //BusquedaSecuencial objBusquedaSecuencial = new BusquedaSecuencial();
        //System.out.println("Dame el numero a buscar: ");
        //int num = sc.nextInt();
        //objBusquedaSecuencial.busqueda(4);
        //System.out.println("Se encontro en el indice: " + objBusquedaSecuencial.busqueda(num));
        
        
        
        //BusquedaBinaria objBusquedaBinaria = new BusquedaBinaria();
        //objBusquedaBinaria.busquedaBinaria(arrr, 4);
        //System.out.println("Se encontro el numero en el indice: " + objBusquedaBinaria.busquedaBinaria(arrr, 1));
        
        
        //HashMapp objHashMapp = new HashMapp();
        //objHashMapp.hash();
        
        
        IndexedSearch objIndexedSearch = new IndexedSearch();
        objIndexedSearch.search();
        
        
        IndexedSearch2 objIndexedSearch2 = new IndexedSearch2();
        objIndexedSearch2.buscar();
    }
}
