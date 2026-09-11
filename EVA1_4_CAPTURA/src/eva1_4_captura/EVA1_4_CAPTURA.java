/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package eva1_4_captura;

import java.util.Scanner;

/**
*
* @author bisonte
*/
public class EVA1_4_CAPTURA {



/**
* @param args the command line arguments
*/
public static void main(String[] args) {

//Si se usan variables, se tienen que DECLARAR antes de usarse


//DECLARAR = Crear la variable para usarla en el programa


//TIPO_DATO NOMBRE_IDENTIFICADOR;


//USAMOS NOMBRES SIGNIFICATIVOS = Debe entenderse para que se usa la variable



String nombre;

//Entrada de datos en el teclado (JAVA)

Scanner captu = new Scanner(System.in);  //Otra variable = captu de tipo Scanner


System.out.println("Capture el nombre: ");



//Capturar del teclado y ponerlo en la variable nombre

//Escribir en la variable (poner el calor) ASIGNACION

nombre = captu.nextLine();


System.out.println("El valor capturado es ");

System.out.println(nombre); //Uso la variable --> LECTURA





}

}