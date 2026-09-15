/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_operaciones;

/**
 *
 * @author bisonte
 */
public class EVA1_7_OPERACIONES {

  /*
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    //EL TIPO DE DATO DERETMINA LAS OPERCIONES
    
    //ENTEROS, REALES, CADENAS, LOGICO, ETC.
    
    //EXPRESIÓN:  VALORES   VARIABLES   FUNCIONES   OPERADORES    
    // QUE SE EVALUAN PARA OBTENER UN RESULTADO
    
    //OPERACIONES CON NÚMEROS: 
    
    //ARITMÉTICAS:
    int suma;
    int valor1;
    int valor2;
    //DECLARANDO 3 VARIABLES DEL MISMO TIPO 
       
    //ASIGNCAIÓN: PONER UN VALOR EN UNA VARIABLE
       //operador --> símbolo que trabaja SOBRE identificadores.
       
       //  =  ---> asignacion --> poner el valor 
       //  == ---> comparación 
       valor1 = 100;  //asignar el valor de 100 a la variable valor1
       
       valor2 = 50; 
       
       suma = valor1 + valor2; //expresión, asignar a la variable suma la operacion entre valor1 y valor2 (+)
       
       // + --> esta entre dos enteros, se interpreta como que los debe sumar 
       
       
       System.out.print("valor1 = ");
       System.out.println(valor1);
       System.out.print("valor2 = ");
       System.out.println(valor2);
       System.out.print("suma = ");
       System.out.println(suma);
       
       //OPERACIONES RESPETAN REGLAS MATEMÁTICAS
       
       
       //MULTIPLICACION
       
       // * 
       int multi;
       multi = valor1 * valor2;
       
       System.out.print("Multiplicacion = ");
       System.out.println(multi);
       
       
       
       // DIVISION 
       
       //  / ---> OPERADOR DE DIVISION
       int divi;
       divi = valor1 / valor2;
       
        System.out.print("Division = ");
       System.out.println(divi);
       
       valor1 = 10; 
       valor2 = 3;
       divi = valor1 / valor2;
       
       
       System.out.print("valor1 = ");
       System.out.println(valor1);
       System.out.print("valor2 = ");
       System.out.println(valor2);
       
        System.out.print("Division = ");
       System.out.println(divi);
       
       
       double resu;
       resu = valor1 / valor2;
       
        System.out.print("Division = ");
       System.out.println(resu);
       
       double val2copia;
       val2copia = 3; 
       resu = valor1 / val2copia;
       
        System.out.print("Division = ");
       System.out.println(resu);
    
    
    
  }
  
}
