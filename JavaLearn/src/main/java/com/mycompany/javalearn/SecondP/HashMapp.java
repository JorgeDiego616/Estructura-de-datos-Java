/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn.SecondP;

import java.util.HashMap;

/**
 *
 * @author jorge
 */
public class HashMapp {
    public void hash() {
        
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        
        
        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington DC");
        System.out.println(capitalCities);
    }
}
