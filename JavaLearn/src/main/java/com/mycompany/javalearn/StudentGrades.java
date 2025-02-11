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
// Clase para calcular el rendimiento de el alumno.
public class StudentGrades {

    // Calcula la cali del parcial.
    // @Parametro caliPartialExams: Porcentage de la calificaion parcial
    // @Parametro caliHomeworks: Porcentage de tareas y trabajos
    // @Parametro finalCali: Calificacion final
    public int calculatePartialGrade(int examScore, int homeworkScore) {
        double caliPartialExams = examScore * 0.7;
        double caliHomeworks = homeworkScore * 0.3;

        double finalCali = caliPartialExams + caliHomeworks;

        //String mensaje = "La calificacion final es: " + caliFinal;
        return (int) finalCali;
    }

    // Calcula la calificacion final de todo
    // @Parametro caliAllExams: Porcentage de la calificacion de los 3 parciales juntos
    // @Parametro caliFinalExams: Porcentage de la calificacion final
    // @Parametro caliFinalSemester: Calificacion de todo el semestre
    public int calculateFinalGrade(int firstPartial, int secondPartial, int thirdPartial, int finalExam) {
        double caliAllExams = ((firstPartial + secondPartial + thirdPartial) / 3) * 0.5;
        double califinalExams = finalExam * 0.5;

        int caliFinalSemester = (int) caliAllExams + (int) califinalExams;

        return caliFinalSemester;
    }

    // Clase para quecar las inasistencias del alumno
    // @Parametro nonAttendance: Inasistencias de alumno.
    public String checkFailureByAbsences(int totalHours, int absences) {
        double nonAttendance = (double) totalHours * .1;
        
        if (nonAttendance > absences) {
            return "Cumples con las asistencias minimas";
        } else {
            return "Estas reprobado por faltas";
        }
    }
}
