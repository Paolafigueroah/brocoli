/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.brocoli.ui;

import java.util.Scanner;
import mx.itson.brocoli.negocio.Operacion;

/**
 *
 * @author Paola Figueroa
 */
      public class Main {
    public static void main(String[] args) {
        String texto = "218241 López Duarte Luis Daniel,216622 Perea Domínguez José ADRIÁN,216625 Olivarría Escobedo Jesús Fernando,298306 Duarte Hernández Mario Iván,216674 López Soto Alán Gerardo,204906 Fernández Esquivel Manuel Ernesto,216633 Laprada Jiménez Diana María,216512 Avilés Albane Pedro Adolfo,216981 Perez Olivarría Iván Ulises";
        
        // Dividir la cadena en elementos separados por coma y espacio
        String[] alumnos = texto.split(",\\s*");
        
        // Iterar a través de los elementos y procesar cada uno
        for (String alumno : alumnos) {
            // Dividir cada elemento en ID y nombre completo
            String[] partes = alumno.split("\\s+", 2);
            
            // Verificar si hay al menos dos partes (ID y nombre completo)
            if (partes.length >= 2) {
                String id = partes[0];
                String nombreCompleto = partes[1];
                
                // Dividir el nombre completo en primer nombre y primer apellido
                String[] nombreApellido = nombreCompleto.split("\\s+", 2);
                
                // Verificar si hay al menos dos partes (primer nombre y primer apellido)
                if (nombreApellido.length >= 2) {
                    String primerNombre = nombreApellido[0];
                    String primerApellido = nombreApellido[1];
                    
                    // Imprimir la información del alumno
                    System.out.println("[ID: " + id + "] [Nombre y apellido: " + primerNombre + " " + primerApellido + "]");
                }
            }
        }
    }
}