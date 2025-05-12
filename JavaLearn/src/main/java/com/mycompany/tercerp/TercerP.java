/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tercerp;

/**
 *
 * @author jorge
 */
public class TercerP {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ListaEnlazadasimpleee list = new ListaEnlazadasimpleee();
       
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(90);
        list.insert(5);

        //System.out.println("List:");
        //list.display();

        //System.out.println("Is 20 in the list? " + list.search(5));
        
        //int numeroRemove = 5;
        //list.delete(numeroRemove);

        //System.out.println("After deleting: " + numeroRemove);
        //list.display();
        
        
        
        //Pila2 objPila2 = new Pila2();
        //objPila2.push("Tazo dorado");
        //objPila2.push("Tazo exclusivo");
        //objPila2.pop();
        //objPila2.peekfinal();
        
        
        
        Cola2 objCola2 = new Cola2();
        objCola2.enqueve("Sergio");
        objCola2.enqueve("Mario");
        objCola2.peek();
        objCola2.dequeve();
        objCola2.peek();
    }
}
