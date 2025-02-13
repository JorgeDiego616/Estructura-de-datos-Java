/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;

import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class ArrayListExample {
    ArrayList<String> cars = new ArrayList<String>();
    
    public void addCars(String car) {
        cars.add(car);
        System.out.println(cars.size());
    }
    
    public int returnSize() {
        return cars.size();
    }
    
    public void removeCar(int carIndex) {
        cars.remove(carIndex);
    }
    
    public void removeAll() {
        cars.clear();
    }
}
