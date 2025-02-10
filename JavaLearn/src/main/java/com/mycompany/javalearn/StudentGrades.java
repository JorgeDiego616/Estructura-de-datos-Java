/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;

/**
 *
 * @author jorge
 * @Matricula 14446
 * @Fecha 10/2/25
 */

// Clase que cumple con los 
public class StudentGrades {
    public int calculatePartialGrade(int examScore, int homeworkScore) {
        double caliExamenesParcial = examScore * 0.7;
        double caliTrabajosTareas = homeworkScore * 0.3;
        
        double caliFinal = caliExamenesParcial + caliTrabajosTareas;
        
        //String mensaje = "La calificacion final es: " + caliFinal;
        
        return (int)caliFinal;
    
    }
    
    public int calculateFinalGrade(int firstPartial, int secondPartial, int thirdPartial, int finalExam) {
        double caliExamenes = ((firstPartial + secondPartial + thirdPartial) / 3) * 0.5;
        double caliExamenFinal = finalExam * 0.5;
        
        int caliFinalSemestre = (int)caliExamenes + (int)caliExamenFinal;
        
        return caliFinalSemestre;
        
    }
    
    public String checkFailureByAbsences(int totalHours, int absences) {
        double inasistencias = totalHours * .1;
        if (absences < inasistencias) {
            return "Estas reprobado por faltas";
        }
        
        return "Cumples con las asistencias minimas";
    }
}
