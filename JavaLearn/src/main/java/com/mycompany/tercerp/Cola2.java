/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tercerp;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author jorge
 */
public class Cola2 {
    Queue<String> cola = new LinkedList<>();
    
    public void enqueve(String elemento){
        cola.add(elemento);
    }
    
    public void peek() {
        System.out.println("El primer cliente es: " + cola.peek());
    }
    
    public void dequeve() {
        cola.poll();
    }
    
}
