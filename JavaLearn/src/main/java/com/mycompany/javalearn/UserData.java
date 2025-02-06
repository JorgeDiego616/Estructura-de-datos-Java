/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearn;

/**
 *
 * @author jorge
 * @Matricula 14446
 * @Fecha 6/2/25
 */

// Clase que recibe 2 argumentos string para retornar un nombre
public class UserData {
    
    //Funcion para retornar un nombre completo
    //@Parametro mensajeFormat: Es el mensaje usando .format()
    //@Parametro mensaje: Es el mensaje usando una +
    public String fullName(String firstName, String lastName) {
        //String mensaje = firstName + " " + lastName;
        String mensajeFormat = String.format("El Nombre es: %s %s", firstName, lastName);
        //return mensaje;
        return mensajeFormat;
    }
}
