/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_exepciones;

import java.util.Scanner;


/**
 *
 * @author saeol
 */
public class Eva3_2_exepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad en numero entero");
        int iedad = input.nextInt();
        System.out.println("Tu edad:" + iedad);
        //input mismatch error da cando los datos no son compatibles con lo que se pide
        //cuando se dan errores no se producen excepciones las cuales no dejan que el programa avance por lo cual termina
        
        
        
       
    }
    
}
