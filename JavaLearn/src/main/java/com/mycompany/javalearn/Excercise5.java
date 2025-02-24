/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;

/**
 *
 * @author jorge
 * @Matricula 14446
 * @Fecha 23/2/25
 */

// Clase que ve quien aprobo y quien reprobo
public class Excercise5 {
    
    // VE cual alumno pasa y cual no
    // @Parametro alumnosCalificaciones: Arreglo de las calificacion de los alumnos
    // @Parametro aprobados: los que pasan
    // @Parametro reprobados: los que no pasan
    public void aprovadosReprovados() {
        int[] alumnosCalificaciones = {89,76,54,93,83,85,95,100,78,100,43,80,63};
        int aprobados = 0;
        int reprobados = 0;
        for(int i = 0;i < alumnosCalificaciones.length;i++) {
            if(alumnosCalificaciones[i] >= 70) {
                aprobados += 1;
                //System.out.println("Aprobado: " + alumnosCalificaciones[i]);
            } else {
                reprobados += 1;
                //System.out.println("Reprobado: " + alumnosCalificaciones[i]);
            }
        }
        
        System.out.println("Aprobados: " + aprobados + ". Reprobados: " + reprobados);
    }
}
