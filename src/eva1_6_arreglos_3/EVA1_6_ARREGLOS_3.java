/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_arreglos_3;

import java.util.Scanner;

/**
 *
 * @author Evelyn
 */
public class EVA1_6_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//EL USUARIO LO LLENARA 
        int aiEdad[];//ARREGLO SIN INICIALIZAR
        Scanner scCaptu = new Scanner(System.in);//CAPTURA DESDE EL TECLADO
        //System.out.println(aiEdad[5]); ERROR, SE DEBE INICIALIZAR (new)
        System.out.println("Introduce la cantidad de eedades a capturar: ");
        int iCant = scCaptu.nextInt();//CAPTURA DESDE EL TECLADO, AL DAR ENTER, UN ENTERO
        aiEdad = new int [iCant];//INICIALIZAMOS EL ARREGLO
        for (int i = 0; i < aiEdad.length; i++) {// i< icant
            System.out.println("Introduce edad: ");
            aiEdad[i] = scCaptu.nextInt();
        }
        //IMPRIMAN LA EDAD 
        //for(variable: arreglo) for-each ---> para-cada
        for (int b : aiEdad) {//EN LA VARIABLE SE PONDRA CADA UNA DE LAS EDADES, SOLO LEA LOS VALORES NO LAS POSICIONES 
            System.out.println("Edad = " + b);
            
        }
        
        
    }
    
}
