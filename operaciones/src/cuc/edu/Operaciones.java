/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuc.edu;

/**
 *
 * @author invitado
 */
public class Operaciones {
    
    public static int sumar(int num1, int num2) {
        return num1+num2;
    }
    
    public static double sumar(double num1, double num2) {
        return num1+num2;
    }
    
    public static int[] sumar(int[] vect1, int[] vect2) {
        if(vect1.length == vect2.length){
            int[] suma = new int[vect1.length];
            for (int i = 0; i < suma.length; i++) {
                suma[i] = vect1[i] + vect2[i];
            } 
            return suma;
        }else
            return null;
    }
}
