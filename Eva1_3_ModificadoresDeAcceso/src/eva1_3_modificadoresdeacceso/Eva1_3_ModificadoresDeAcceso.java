/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_modificadoresdeacceso;

/**
 *
 * @author saeol
 */
public class Eva1_3_ModificadoresDeAcceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona per1 = new Persona ();// instanciar un objeto
        per1.setId("09234852");
        per1.Setnombre("Andres");
        per1.setedad(78);
        System.out.println("Tu nombre es: "+ per1.getnombre());
        System.out.println("Tu id es: "+ per1.getId());
        System.out.println("Tu edad es: "+ per1.getedad());
        
     
        
    }
    
}
        class Persona{
    //atributos = variables
        private String id;
        private String nombre;
        private  int edad;
        //comportamientos = metodos 
        //para leer y modificar los atributos usamos metodos de lectura y escritura
        //asignar valores = set
        //leer valores = get
        public String getId(){
        return id;}
        public String getnombre(){
        return nombre;}
        public int getedad(){
            return edad;
        }
        public void setId(String valor){
        id = valor;}
        public void Setnombre(String valor){
        nombre = valor;}
        public void setedad(int valor){
            edad = valor;
        }
        
        
        }

    
