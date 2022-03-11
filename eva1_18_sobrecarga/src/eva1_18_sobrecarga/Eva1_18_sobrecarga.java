/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_sobrecarga;

/**
 *
 * @author saeol
 */
public class Eva1_18_sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        prueba obj = new prueba();
        System.out.println(100);
        System.out.println("Area de un rectangulo de 15x20:" + calcularArea());
    }
    public static double calcularArea)(double base, double altura){
    return base * altura;
}
    public static double calcularArea(double radio){
        return Math.PI * Math.pow(radio, 2)
    }
    
}
class prueba{}
