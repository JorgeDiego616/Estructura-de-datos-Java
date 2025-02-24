/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Scan {
    public void scannerThings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame tu edad: ");
        String edad = sc.nextLine();
        System.out.println("Tu edad es de: " + edad);
        //System.out.println(String.format("Tu edad es de: %d", edad));
    }
}
