/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.brocoli.negocio;

/**
 * Contiene metodos para trabajar con tipos de datos String.
 * @author Paola Figueroa
 */
public class Operacion {

    /**    
     * Separa una cadena de texto a partir de la expresión guion medio.
     * @param valor Cadena de texto que será separada a partir de la expresión dada.
     * @return Array de string, en donde cada posición representa una división de la cadena de texto.
     */
    public String[] separar(String valor){
        String[] elementos = valor.split("-");
        return elementos;
        
    }   
}