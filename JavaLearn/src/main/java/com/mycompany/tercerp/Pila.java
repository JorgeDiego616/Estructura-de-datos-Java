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
public class Pila {

    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        // PUSH: Agregando elementos
        pila.push("Plato 1");
        pila.push("Plato 2");
        pila.push("Plato 3");

        // PEEK: Consultando el elemento en la cima
        System.out.println("Elemento en la cima: " + pila.peek());

        // POP: Eliminando elementos de la pila
        System.out.println("Elemento removido: " + pila.pop());
        System.out.println("Elemento removido: " + pila.pop());

        // PEEK: Estado final de la pila
        System.out.println("Elemento en la cima ahora: " + pila.peek());
    }
}

