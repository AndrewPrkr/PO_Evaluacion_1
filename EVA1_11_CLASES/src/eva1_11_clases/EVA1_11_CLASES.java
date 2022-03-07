/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_clases;

/**
 *
 * @author saeol
 */
public class EVA1_11_CLASES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona obj1 = new Persona ();
        obj1.setedad(98);
        System.out.println("Esta es la edad:" + obj1.getedad());
        
    }
  
            
    
}
  class Persona {
      private String id;
        private String nombre;
        private  int edad;
        
        public String getid(){
            return id;
        }
        public String getnombre(){
            return nombre;
        }
        public int getedad(){
            return edad;
        }
        
        public void setid(String valor){
            id = valor;
        }
        public void setnombre(String valor){
            nombre = valor;
        }
        public void setedad(int valor){
            edad = valor;
        }
  }