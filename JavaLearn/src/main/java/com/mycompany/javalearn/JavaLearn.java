/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javalearn;

/**
 *
 * @author jorge
 * @Matricula 14446
 * @Fecha 6/2/25
 */

// Clase para mandar a llamar todas las demas clases
public class JavaLearn {
    //Funcion que manda a llamar todas las demas funciones
    public static void main(String[] args) {
        //Arreglos arreglo = new Arreglos();
        //arreglo.listOfStudents();
    
        //Piedrapapeltijera gameObject = new Piedrapapeltijera();
        //gameObject.game();
        
        //UserData userDataObject = new UserData();
        //String fullName = userDataObject.fullName("Jorge", "Chaparro");
        //System.out.println(fullName);
        
        StudentGrades student = new StudentGrades();
        
        // Calcular la calificación del parcial
        int partialGrade = student.calculatePartialGrade(85, 90);
        System.out.println("Calificacion del parcial: " + partialGrade);
        
        // Calcular la calificación final del semestre
        int finalGrade = student.calculateFinalGrade(80, 75, 90, 85);
        System.out.println("Calificacion final del semestre: " + finalGrade);
        
        // Verificar el estatus de asistencia
        String attendanceStatus = student.checkFailureByAbsences(64, 7);
        System.out.println(attendanceStatus);
    }
 
}
