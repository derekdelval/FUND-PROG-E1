/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_operaciones_cadenas;

/**
 *
 * @author bisonte
 */
public class EVA1_9_OPERACIONES_CADENAS {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   
    
    //TAMBIEN HAY OPERADORES PARA CADENAS
    // CONCATENACION: PEGAR CADENAS DE TEXTO --> +
    
      // CAUNDO UN OPERADOR HACE DIFERENTES ACCIONES SE LE LLAMA "SOBRECARGA"
      //SOLO SE PUEDEN SUMAR LAS CADENAS, NO SE PUEDEN HACER OTRO DITPO DE OPERACIONES
    String cade;
    cade = "Hola" + " " + "mundo";
    
    System.out.println(cade);
    cade = "Valor = " + 100;
    System.out.println(cade);
    
    
    cade = "Valor booleanos = " + false; 
    System.out.println(cade);
  }
  
}
