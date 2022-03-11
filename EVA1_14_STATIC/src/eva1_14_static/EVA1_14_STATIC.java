/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_static;

/**
 *
 * @author saeol
 */
public class EVA1_14_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        formulasmatematicas misfor = new formulasmatematicas();
        double area = misfor.calcularAreaCirculo(100);
        System.out.println("Area del circulo " + area);
        
        
    }
    
}

class formulasmatematicas{
    
    public double calcularAreaCirculo(double radio){
        double area;
        area = 3.1416 * radio * radio;
        return area;
        
    }
}
