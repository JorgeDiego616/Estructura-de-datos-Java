/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tercerp;

/**
 *
 * @author jorge
 */
import java.util.*;

public class Grafo {
    public Map<Integer, List<Integer>> adjList;

    public Grafo() {
        adjList = new HashMap<>();
    }

    // Método para agregar una arista entre dos nodos
    public void agregarArista(int origen, int destino) {
        adjList.computeIfAbsent(origen, k -> new ArrayList<>()).add(destino);
        adjList.computeIfAbsent(destino, k -> new ArrayList<>()).add(origen); // No dirigido
    }

    // Método DFS para recorrer el grafo
    public void dfs(int inicio, Set<Integer> visitados) {
        if (visitados.contains(inicio)) {
            return;
        }

        visitados.add(inicio);
        System.out.println("Visitando nodo: " + inicio);

        for (int vecino : adjList.getOrDefault(inicio, new ArrayList<>())) {
            dfs(vecino, visitados);
        }
    }
}
    //public static void main(String[] args) {
        //Grafo grafo = new Grafo();

        // Agregar conexiones (aristas)
        //grafo.agregarArista(1, 2);
        //grafo.agregarArista(1, 3);
        //grafo.agregarArista(2, 4);
        //grafo.agregarArista(2, 5);
        //grafo.agregarArista(3, 6);
        //grafo.agregarArista(3, 7);

        // Iniciar DFS desde el nodo 1
        //System.out.println("Recorrido DFS desde el nodo 1:");
        //grafo.dfs(1, new HashSet<>());
    //}
//}
