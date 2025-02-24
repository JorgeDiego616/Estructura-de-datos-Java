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
 * @Fecha 23/2/24
 */

// La clase usa una ArrayList
public class ArrayListExample {
    ArrayList<String> cars = new ArrayList<String>();
    
    // Agrega valores al ArrayList
    public void addCars(String car) {
        cars.add(car);
        System.out.println(cars.size());
    }
    
    // Muestra la longitud de la lista ArrayList
    public int returnSize() {
        return cars.size();
    }
    
    // Remueve los valores de la lista ArrayList
    public void removeCar(int carIndex) {
        cars.remove(carIndex);
    }
    
    // Remueve todos los elementos de la ArrayList
    public void removeAll() {
        cars.clear();
    }
}
