/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;

/**
 *
 * @author jorge
 * @Matricula 14446
 * @Fecha 24/2/25
 */

// Clase que se encarga de calcular la calificacion final
public class GradeCalculationPartial {
    
    // Da la calificacion final usando lo del examen y tareas
    // @Parametro finalGrade: saca el porcentage del examen y de las tareas y las suma
     public void partialCalification(int exam, int homework) {
        
        double finalGrade = ((double)exam * 0.7) + ((double)homework * 0.3);
        
        System.out.println("Calificación final: " + finalGrade);
    }
}
