/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_formula_general;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_14_FORMULA_GENERAL {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   
    
    double a, b, c, formula, x1, x2;
    
    
    
    Scanner captu = new Scanner(System.in);
    
    //pedir los valores de la ecuacion
    
    
    System.out.println("cual es el PRIMER valor de la ecuaion?");
    
    a = captu.nextDouble();
    
    System.out.println("cual es el SEGUNDO valor de la ecuaion?");
    
    b = captu.nextDouble();
    
    System.out.println("cual es el TERCER valor de la ecuaion?");
    
    c = captu.nextDouble();
    
    //calculo de formula general
    
    
        
    x1 = ((-1 * b) + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);      
    x2 = ((-1 * b) - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
    
   
    
  
    System.out.println("Los valores de x son:  X1:" + x1 + " y  X2:" + x2);
    
    
    
    
    
  }
  
}
