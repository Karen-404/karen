/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.clasescanner;

/**
 *
 * @author SO-LAB1-PC24
 */
public class Clasescanner {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese su edad");
        int edad = entrada.nextInt();
        if (edad > 0 && edad < 120) {
            if (edad >= 0 && edad <= 12) {
                
            }
        }
        System.out.println("eres un niño");
    }else if (edad>=13 && edad<=35){
            System.out.println("eres un joven");
    }else if (edad>=32 && edad<=120){
            System.out.println("eres un adulto");
    }else{ 
            System.out.println("edad fuera del limite");
    }
}

