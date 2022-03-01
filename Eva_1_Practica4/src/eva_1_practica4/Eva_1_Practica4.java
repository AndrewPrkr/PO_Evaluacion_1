/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_practica4;

/**
 *
 * @author saeol
 */
public class Eva_1_Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        auto micarro = new auto();//Objeto
        micarro.setTipo_Vehiculo("Sedan");
        micarro.setano (2018);
        micarro.setmarca("Audi");
        micarro.setmodelo("A4");
        micarro.setprecio(345897.99);
        System.out.println("El tipo de vehiculo es: "+ micarro.getTipo_Vehiculo());
        System.out.println("El vehiculo es un: "+  micarro.getano());
        System.out.println("El modelo del carro es: "+ micarro.getmodelo());
        System.out.println("El precio es de:"+ micarro.getprecio());
        
        
        
        
        
        
        
    }
    
}

    class auto{//Tipos de datos abstractos
        //
    private String marca;
    private String modelo;
    private String Tipo_vehiculo;
    private int ano;
    private double precio;
    //Comporatiomientos: set/get
    public void setmarca(String valor){ //valor es una variable
    marca = valor; }
    public void setmodelo(String valor){
    modelo = valor;}
    
    public void setTipo_Vehiculo(String valor){
    Tipo_vehiculo = valor;}
    public void setano(int valor){
    ano = valor;}
    public void setprecio(double valor){
    precio = valor;}
        
    
    
    public String getmarca(){
    return marca;}
    public String getmodelo(){
        return modelo;}
    public String getTipo_Vehiculo(){
        return Tipo_vehiculo;}
    public int getano(){
        return ano;
    }
    public double getprecio(){ 
        return precio;
    }
    }

