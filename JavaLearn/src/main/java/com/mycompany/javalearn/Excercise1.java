/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;
import java.util.ArrayList;

/**
 *
 * @author jorge
 * @Matricula 14446
 * @Fecha 23/2/25
 */

// La clase es para editar una lista ArrayList
public class Excercise1 {
    ArrayList<String> lenguajes = new ArrayList<String>();
    
    // Agrega valores al ArrayList
    public void arrayListAdd(String lenguaje1, String lenguaje2, String lenguaje3, String lenguaje4, String lenguaje5) {

        lenguajes.add(lenguaje1);
        lenguajes.add(lenguaje2);
        lenguajes.add(lenguaje3);
        lenguajes.add(lenguaje4);
        lenguajes.add(lenguaje5);
        System.out.println(lenguajes);
    }
    
    // Remueve los valores de la lista ArrayList
    public void arrayListRemove(int desconocidoNum) {
        lenguajes.remove(desconocidoNum);
        System.out.println(lenguajes);
    }
    
    // Edita la lista ArrayList
    public void arrayListEdit(int indexEdit, String change) {
        lenguajes.set(indexEdit, change);
        System.out.println(lenguajes);
    }
    
    // Muestra la longitud de la lista ArrayList
    public void arrayListLength() {
        System.out.println(lenguajes.size());
    }
    
    // Remueve todos los elementos de la ArrayList
    public void arrayListRemoveAll() {
        lenguajes.clear();
    }
}
