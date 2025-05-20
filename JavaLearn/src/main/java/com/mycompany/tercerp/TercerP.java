/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tercerp;
import java.util.*;

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
        
        
        
        //Cola2 objCola2 = new Cola2();
        //objCola2.enqueve("Sergio");
        //objCola2.enqueve("Mario");
        //objCola2.peek();
        //objCola2.dequeve();
        //objCola2.peek();
        
        
        
        Arbol objArbol = new Arbol();
        Nodo raiz = new Nodo(1);
        raiz.izquierda = new Nodo(2);
        raiz.derecha = new Nodo(3);
        raiz.izquierda.izquierda = new Nodo(4);
        raiz.izquierda.derecha = new Nodo(5);
        raiz.derecha.izquierda = new Nodo(6);
        raiz.derecha.derecha = new Nodo(7);
        // Llamar al método DFS en preorden
        System.out.println("Recorrido en preorden:");
        objArbol.dfsPreorden(raiz);
        
        
        
        Grafo objGrafo = new Grafo();
        // Agregar conexiones (aristas)
        objGrafo.agregarArista(1, 2);
        objGrafo.agregarArista(1, 3);
        objGrafo.agregarArista(2, 4);
        objGrafo.agregarArista(2, 5);
        objGrafo.agregarArista(3, 6);
        objGrafo.agregarArista(3, 7);

        // Iniciar DFS desde el nodo 1
        System.out.println("Recorrido DFS desde el nodo 1:");
        objGrafo.dfs(1, new HashSet<>());
    }
}
