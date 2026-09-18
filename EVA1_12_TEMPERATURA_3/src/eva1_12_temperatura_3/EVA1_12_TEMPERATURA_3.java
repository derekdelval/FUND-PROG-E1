/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_temperatura_3;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_12_TEMPERATURA_3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner captu = new Scanner(System.in);
    
    double temp, fare, kelvin;
    
    //SOLICITAR LOS DATOS AL USUARIO
    
    System.out.println("cual es la temperatura en grados kelvin?");
    
    kelvin = captu.nextDouble(); 
    
    //HACER EL CALCULO
    
    temp = ( kelvin - 273.15); 
    fare = ( kelvin - 273.15 ) * (9 / 5.0) + 32 ;
    
    
    //MOSTRAR RESULTADOS AL USUARIO
    
    
    System.out.println(kelvin + " K = " + temp + " C°");
    
    System.out.println(kelvin + " K = " + fare + " °F");
  }
  
}
