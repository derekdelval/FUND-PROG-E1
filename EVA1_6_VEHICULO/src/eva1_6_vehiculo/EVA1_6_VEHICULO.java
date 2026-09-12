/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_vehiculo;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_6_VEHICULO {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   
    
    String marca;
    String modelo;
    int  año;
    String color;
    double kilom;
    double  precio;
    
    Scanner captu = new Scanner (System.in);
    
    
    System.out.print("Captura la marca: ");
    
    marca = captu.nextLine();
    
    System.out.print("Captura el modelo: ");
    
    modelo = captu.nextLine();
    
    System.out.print("Captura el año: ");
    
    año = captu.nextInt();
    
    captu.nextLine();
    
    System.out.print("Captura el color: ");
    
    color = captu.nextLine();
    
    System.out.print("Captura el kilometraje: ");
    
    kilom = captu.nextDouble();
    
    System.out.print("Captura el precio: $");
    
    precio = captu.nextDouble();
    
    
    
    
    
    System.out.println(">>>>>>>Datos del Carro<<<<<<<<");
    
        System.out.print("Marca: ");
        System.out.println(marca);
           
        
           
        System.out.print("Modelo: ");
        System.out.println(modelo);
        
        
        System.out.print("Año: ");
        System.out.println(año);
        
        System.out.print("color: ");
        System.out.println(color);
           
        
           
        System.out.print("Kilometraje: ");
        System.out.print(kilom);
        System.out.println("km");
        
        
        System.out.print("precio: $");
        System.out.println(precio);
        
        
        
        
  }
  
}
