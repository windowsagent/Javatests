/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.util.*;

/**
 *
 * @author windowsagent-wm
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduce la calificacion: ");
        int num;
        num = myObj.nextInt();
        if(num == 5){
            System.out.println("25");} else {
            if(num == 6){
                System.out.println("3");} else{
            if (num == 7){
                System.out.println("49");} else{
            if (num == 8){
                System.out.println("4");} else{
            if (num == 9){
                System.out.println("89");} else{
            if (num == 10) {
                System.out.println("136");} else{
                System.out.println("Cantidad incorrecta");
            }
            }
            }
            }
            }
        }
    }
    
}
