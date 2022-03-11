/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_15_formulas;

/**
 *
 * @author saeol
 */
public class EVA_15_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
class Formulas{
    public static double convewrtirCaF(double celsius){
        return celsius * 1.8 + 32.0;
        
    }
    public static double convewrtirFaC(double farenheit){
        return (farenheit - 32.0)/ 1.8;
        
    }
    public static double convewrtirFaK(double farenheit){
        return 5/9 * (farenheit - 32.0)+ 273.15;
    }
    
}
