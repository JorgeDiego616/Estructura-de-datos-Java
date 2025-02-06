/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javalearn;

/**
 *
 * @author jorge
 */
public class JavaLearn {
    public static void main(String[] args) {
        //Arreglos arreglo = new Arreglos();
        //arreglo.listOfStudents();
    
        Piedrapapeltijera gameObject = new Piedrapapeltijera();
        gameObject.game();
        
        UserData userDataObject = new UserData();
        String fullName = userDataObject.fullName("Jorge", "Chaparro");
        System.out.println(fullName);
    }
 
}
