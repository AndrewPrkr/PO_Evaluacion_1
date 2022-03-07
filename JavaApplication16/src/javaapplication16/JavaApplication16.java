/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author saeol
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pc PC1 = new pc ();//crear objeto
        PC1.setMobo("AORUS B450");
        PC1.setProcesador("Ryzen 5 3600");
        PC1.setalmacenamiento(1000);
        PC1.setgpu("1070ti");
        PC1.setpsu(750);
        PC1.setprecio(20000);
   
        PC1.impriirdatos();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            
            
      
        // TODO code application logic here
    }
    
}
class pc{
private String Procesador;
private String gpu;
private String Mobo;
private int psu;
private String ram;
private int almacenamiento;
private double precio;
private double preciofinal;

public void setProcesador(String valor){
Procesador = valor;}
public void setgpu(String valor){
    gpu = valor;
}
public void setprecio(double valor){
    precio = valor;
}
public void setMobo(String valor){
    Mobo = valor;
}
public void setcaluclarprecio(double valor){
    preciofinal = valor;
}
public void setpsu(int valor ){
    psu = valor;
}
public void setram (String valor){
    ram = valor;
}
public void setalmacenamiento (int valor){
    almacenamiento = valor;
}
public void impriirdatos(){
    System.out.println("Tiene un procesador:" + Procesador);
    System.out.println("La gpu es:" + gpu);
    System.out.println("La motherboard es: " + Mobo);
    System.out.println("La ram es: "+ ram);
    System.out.println("El precio es "+ precio* 1.16);
    
}

public double getprecio(){
    return precio;
}
public String getProcesador(){
    return Procesador;
}
public String getgpu(){
    return gpu;
}
public String getMobo(){
    return Mobo;
}
public int getpsu(){
    return psu;
}
public String getram(){
    return ram;
    
}
public double getcalcularprecio(){
    return preciofinal;
}
public int getalmacenamiento(){
    return almacenamiento;
}

}

