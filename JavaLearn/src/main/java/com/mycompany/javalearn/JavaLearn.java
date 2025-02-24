/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.javalearn;

import java.util.Scanner;

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
        //StudentGrades student = new StudentGrades();

        // Calcular la calificación del parcial
        //int partialGrade = student.calculatePartialGrade(85, 90);
        //System.out.println("Calificacion del parcial: " + partialGrade);

        // Calcular la calificación final del semestre
        //int finalGrade = student.calculateFinalGrade(80, 75, 90, 85);
        //System.out.println("Calificacion final del semestre: " + finalGrade);

        // Verificar el estatus de asistencia
        //String attendanceStatus = student.checkFailureByAbsences(64, 6);
        //System.out.println(attendanceStatus);
        
        
        // Uso de la clase scanner
        //Scanner objScanner = new Scanner(System.in);
        
        
        // Obtener variables para la clase TriangleArea y correr el programa
        //System.out.print("Ingresa la base del triangulo: ");
        //double base = objScanner.nextDouble();
        
        //System.out.print("Ingresa la altura del tringulo: ");
        //double height = objScanner.nextDouble();
        
        //TriangleArea objTriangle = new TriangleArea();
        //double area = objTriangle.calculateArea(base, height);
        
        //System.out.println(String.format("El area del tringulo con base %.2f y altura %.2f es: %.2f", base, height, area));
        //objScanner.close();
        
        
        // Obtener variables para la clase CircleArea y correr el programa
        //System.out.print("Ingresa el area del circulo: ");
        //double radio = objScanner.nextDouble();
        
        //CircleArea objCircle = new CircleArea();
        //double areaC = objCircle.calculateArea(radio);
        
        //System.out.println(String.format("El area del circulo con radio %.2f es: %.2f", radio, areaC));
        //objScanner.close();
        
        
        // Uso de la clase ArrayListExample
        //ArrayListExample objArrayListEx = new ArrayListExample();
        
        //objArrayListEx.addCars("Toyota");
        //objArrayListEx.removeCar(0);
        //System.out.println(objArrayListEx.returnSize());
        //objArrayListEx.removeAll();
        
        
        //MultidimensionalArray objMultidimensional = new MultidimensionalArray();
        
        //objMultidimensional.printbidimensionalArray();
        

        
        //NonParCero objNonParCero = new NonParCero();
        //objNonParCero.calculate();
        
        
        //Excercise2 objExcercise2 = new Excercise2();
        //objExcercise2.calculateIVASales();
        
        //Excercise3 objExcercise3 = new Excercise3();
        //objExcercise3.sumaValoresArregloBidimensional();
        
        //Excercise4 objExcercise4 = new Excercise4();
        //objExcercise4.calificacionParcial(87, 90);
        
        //Excercise5 objExcercise5 = new Excercise5();
        //objExcercise5.aprovadosReprovados();
        
        Excercise1 objExcercise1 = new Excercise1();
        objExcercise1.arrayListAdd("Python", "Java", "Cobol", "C++", "C#");
        objExcercise1.arrayListRemove(3);
        objExcercise1.arrayListEdit(3, "C# actualmente");
        objExcercise1.arrayListLength();
        objExcercise1.arrayListRemoveAll();
        objExcercise1.arrayListLength();
        
        
        Scan objscan = new Scan();
        objscan.scannerThings();
    }

}
