/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_temperatura_2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_11_TEMPERATURA_2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
 
   Scanner captu = new Scanner(System.in);
    
    double temp, fare, kelvin;
    
    //SOLICITAR LOS DATOS AL USUARIO
    
    System.out.println("cual es la temperatura en grados fahrenheit?");
    
    fare = captu.nextDouble(); 
    
    //HACER EL CALCULO
    
    temp = ( fare - 32) / 1.8; //grados celsius 
    kelvin = ( fare - 32 ) * (5 / 9.0) + 273.15; // grados kelvin
    
    
    //MOSTRAR RESULTADOS AL USUARIO
    
    
    System.out.println(fare + "°F = " + temp + " C°");
    
    System.out.println(fare + "°F = " + kelvin + " K");
    
  
  
  
  
  }
  
}
