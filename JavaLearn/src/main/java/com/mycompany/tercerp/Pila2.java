/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tercerp;

import java.util.Stack;

/**
 *
 * @author jorge
 */
public class Pila2 {
    Stack<String> pila = new Stack<>();
    public void push(String elementos) {
        
        // PUSH: Agregando elementos
        pila.push(elementos);
        
        //pila.push("Plato 2");
        //pila.push("Plato 3");
    }
    
    public void peek(){
        // PEEK: Consultando el elemento en la cima
        System.out.println("Elemento en la cima: " + pila.peek());
    }
    
    public void pop(){
        // POP: Eliminando elementos de la pila
        System.out.println("Elemento removido: " + pila.pop());
        //System.out.println("Elemento removido: " + pila.pop());
    }
    
    public void peekfinal(){
        // PEEK: Estado final de la pila
        System.out.println("Elemento en la cima ahora: " + pila.peek());
    }
}
