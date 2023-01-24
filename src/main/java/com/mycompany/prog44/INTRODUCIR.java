/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog44;

import java.util.Scanner;

/**
 *
 * @author vjtej
 */
public class INTRODUCIR {
    public static String introduce(String cadena){
     String dato;
     System.out.println("VAMOS A JUGAR A ADIVINAR UN NUMERO");
     System.out.println("introduce 1-configuracion,2-jugar,3-salir");
     Scanner entradaTeclado = new Scanner(System.in);
     dato = entradaTeclado.next();
     return dato;
    }
}
