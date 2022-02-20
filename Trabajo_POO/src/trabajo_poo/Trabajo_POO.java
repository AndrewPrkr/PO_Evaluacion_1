/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo_poo;

/**
 *
 * @author saeol
 */
public class Trabajo_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Implementacion.
        //Como crear un objeto en Java
        //primero creamos la clase fuera del main
        //Creamos un objeto desde una clase se le llama instanciar.
        Persona est = new Persona(); //declaramos un identificador (objeto)de tipo persona
        //Por regla general el objeto se debe inicializar al poner de nuevo la clase depsues de new
        // el  "." es un operador, este nos da acceso a las variables.
        est.edad = 30;
        est.id = "8734572349874";
        est.nombre = "Andres";
        est.Nacimiento = 2022 - est.edad; 
         System.out.println("El nombre es: " + est.nombre);
         System.out.println("El id es : " + est.id);
         System.out.println("La edad es:" + est.edad);
         System.out.println("La fecha de nacimiento es: " + est.Nacimiento);
         
         Persona est2 = new Persona();
          
        est2.Nacimiento = 2022 - est.edad;
        est2.edad = 80;
        est2.id = "2394857";
        est2.nombre = "Juanito";
        
        System.out.println("El nacimiento de la persona es: " + est2.Nacimiento);
        System.out.println("La edad de la persona es: "+ est2.edad);
        System.out.println("El id de la persona es: " + est2.id);
        System.out.println("El nombre de la persona es " + est2.nombre);
        
         
         
                
        
        

    }
    
}
//Clase persona fuera de las llaves del main.

class Persona// declaramos
{//dentro de las llaves va nuestra implementacion
    //Atributos de la clase
    //La mayoria de metodos van a ser verbos
    
    //Nuestra clase es la receta, nos falta cocinar el platillo
    //Sigue generar los objetos
   
    String nombre; //declaramos la variable con un atributo.
    String id; 
    int edad;
    int Nacimiento;
    
    
    
}
