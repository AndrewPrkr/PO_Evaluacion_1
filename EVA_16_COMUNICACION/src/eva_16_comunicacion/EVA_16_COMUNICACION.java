/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_16_comunicacion;

/**
 *
 * @author saeol
 */
public class EVA_16_COMUNICACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseA objA = new ClaseA();
        ClaseB objB = new ClaseB();
        objA.setValrtA(100);
        objB.setValrB(20);
        // TODO code application logic here
    }
    
}
class ClaseA{
    private int valrtA;

    public int getValrtA() {
        return valrtA;
    }

    public void setValrtA(int valrtA) {
        this.valrtA = valrtA;
    }
    
}
class ClaseB{
    private int valrB;

    public int getValrB() {
        return valrB;
    }

    public void setValrB(int valrB) {
        this.valrB = valrB;
    }
    
    
}
