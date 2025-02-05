/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;

/**
 *
 * @author jorge Chaparro Núñez
 * @Matrícula 14446
 * @Fecha 4/2/25
 */


public class Arreglos {
    
    // Funcion para desplegar una lista de alumnos
    // @Parametro numLista: numero de lista de cada alumno
    // @Parametro nombres: Lista de nombres
    // @Parametro i: Valor para el ciclo for
    public void listOfStudents() {
        int numLista = 0;
        String[] nombres = new String[14];
        nombres[0] = "Rebeca";
        nombres[1] = "Argel";
        nombres[2] = "Leslie";
        nombres[3] = "Sebas";
        nombres[4] = "Jorge";
        nombres[5] = "Rodrigo";
        nombres[6] = "Mario";
        nombres[7] = "Sebastian";
        nombres[8] = "Cristhian";
        nombres[9] = "Oscar";
        nombres[10] = "Carlo";
        nombres[11] = "Cesar";
        nombres[12] = "Camila";
        nombres[13] = "Justin";
        
        for(int i = 0; i < 14; i++){
            numLista += 1;
            System.out.println(numLista + " : " + nombres[i]);
        }
        System.out.println("Total de alumnos: " + nombres.length);
 
    }
    
    // Funcion para calcular un promedio
    // @Parametro calificaciones: Lista de calificaciones
    // @Parametro sumatoria: Suma de todas las calificaciones
    // @Parametro conteo: Para saber el numero de lista de cada calificacion
    // @Parametro i: Valor para el ciclo for
    // @Parametro resultado: Promedio de las calificaciones
    public void average() {
        double[] calificaciones = new double[4];
        calificaciones[0] = 9;
        calificaciones[1] = 8;
        calificaciones[2] = 8.5;
        calificaciones[3] = 9;
        
        double sumatoria = 0;
        int conteo = 0;
        
        for(int i = 0; i < calificaciones.length; i++){
            sumatoria += calificaciones[i];
            conteo += 1;
            System.out.println("Parcial " + conteo + " : " + sumatoria);
        }
        double resultado = sumatoria / calificaciones.length;
        System.out.println("Promedio: " + resultado);
    }
}
