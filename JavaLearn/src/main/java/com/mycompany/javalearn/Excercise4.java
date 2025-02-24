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

// La clase saca la calificacion de el alumno
public class Excercise4 {
    
    // La clase suma lo del examen y las tareas
    // @Parametro examScore: la calificacion del examen
    // @Parametro homeworksScore: la calificacion de los trabajos
    // @Parametro finalGrade: El total de la calificacion del alumno
    public void calificacionParcial(int exam, int homework) {
        double examScore = (double)exam * 0.7;
        double homeworksScore = (double)homework * 0.3;
        
        double finalGrade = examScore + homeworksScore;
        
        System.out.println("La calificacion del alumno es de: " + (int)finalGrade);
    }
}
