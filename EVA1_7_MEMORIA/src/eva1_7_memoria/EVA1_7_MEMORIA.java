/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_memoria;

/**
 *
 * @author saeol
 */
public class EVA1_7_MEMORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 5;
        String cadena = "Hola ";
        Prueba obj = new Prueba();
        
        System.out.println("Valor = " + valor);
        System.out.println("Cadena = " + cadena);
        System.out.println("Objeto = "+ obj);
        
    }
    
    
}
class Prueba{
        public void saludar(){
            System.out.println("Hola mundo");
        
    }
    }