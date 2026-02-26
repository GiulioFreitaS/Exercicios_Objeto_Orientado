/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hipotenusa;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Hipotenusa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculo da hipotenusa:");
        
        double Base , Altura;
        double Hipotenusa;
        
        System.out.println("Insira o valor da Base: ");
       Base = sc.nextDouble();
       
       System.out.println("Insira o valor da Altura: ");
       Altura = sc.nextDouble();
       
       Hipotenusa = Base*Base + Altura*Altura;
       
       System.out.println("Esse é o valor da hipotenusa:" + Hipotenusa);
       
       
        
        
    }
}
