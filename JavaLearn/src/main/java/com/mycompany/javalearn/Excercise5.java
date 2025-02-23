/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;

/**
 *
 * @author jorge
 */
public class Excercise5 {
    public void aprovadosReprovados() {
        int[] alumnosCalificaciones = {89,76,54,93,83,85,95,10,78,10,43,8,63};
        int aprobados = 0;
        int reprobados = 0;
        for(int i = 0;i < alumnosCalificaciones.length;i++) {
            if(alumnosCalificaciones[i] >= 70) {
                aprobados += 1;
            } else {
                reprobados += 1;
            }
        }
        
        System.out.println("Aprobados: " + aprobados + ". Reprobados: " + reprobados);
    }
}
