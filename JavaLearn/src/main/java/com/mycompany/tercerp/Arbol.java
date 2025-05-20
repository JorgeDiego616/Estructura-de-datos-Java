/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tercerp;

/**
 *
 * @author jorge
 */




public class Arbol {
    // Método para recorrer en preorden (Raíz -> Izquierda -> Derecha)
    public static void dfsPreorden(Nodo nodo) {
        if (nodo == null) {
            return;
        }
        
        System.out.println(nodo.valor); // Visitar el nodo actual
        dfsPreorden(nodo.izquierda); // Recorrer subárbol izquierdo
        dfsPreorden(nodo.derecha); // Recorrer subárbol derecho
    }
}

    //public static void main(String[] args) {
        // Crear el árbol binario
        //Nodo raiz = new Nodo(1);
        //raiz.izquierda = new Nodo(2);
        //raiz.derecha = new Nodo(3);
        //raiz.izquierda.izquierda = new Nodo(4);
        //raiz.izquierda.derecha = new Nodo(5);
        //raiz.derecha.izquierda = new Nodo(6);
        //raiz.derecha.derecha = new Nodo(7);

        // Llamar al método DFS en preorden
        //System.out.println("Recorrido en preorden:");
        //dfsPreorden(raiz);
    //}
//}

class Nodo {
int valor;
Nodo izquierda, derecha;

public Nodo(int valor) {
    this.valor = valor;
    izquierda = derecha = null;
    }
}
