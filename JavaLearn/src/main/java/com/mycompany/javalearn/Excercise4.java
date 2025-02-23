/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;

/**
 *
 * @author jorge
 */
public class Excercise4 {
    public void calificacionParcial(int exam, int homework) {
        double examScore = (double)exam * 0.7;
        double homeworksScore = (double)homework * 0.3;
        
        double finalGrade = examScore + homeworksScore;
        
        System.out.println("La calificacion del alumno es de: " + (int)finalGrade);
    }
}
