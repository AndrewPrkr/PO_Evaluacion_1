/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_accessmodifiers;
import vehiculos_sin.bicicletas;


/**
 *
 * @author saeol
 */
public class Eva1_13_accessmodifiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil micarro = new Automovil();
        micarro.setAno(1998);
        System.out.println("Este es el ano del carro" + micarro.getAno());
        bicicletas mibici =  new bicicletas();
        mibici.setRodada(200);
        System.out.println("Esta es la rodada"+ mibici.getRodada());
        
        
        
        
        // TODO code application logic here
    }
    
}
