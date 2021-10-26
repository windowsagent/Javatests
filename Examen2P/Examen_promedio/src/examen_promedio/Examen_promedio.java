/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_promedio;
import java.util.*;

/**
 *
 * @author windowsagent-wm
 */
public class Examen_promedio {
        public static void main(String[] args) {
            
        Scanner myObj = new Scanner(System.in);
        int i;
        int num;
        int suma = 0;
        for(i=1;i<=13;i++){
            System.out.println("Inserta la calificacion "+i);
            num = myObj.nextInt();
            suma = suma + num;
        }
        int result = suma / 13;
        if(result <= 6){
            System.out.println("Tu grupo saco: "+result);
            System.out.println("Creo que reprobaron, shiales");} else{
            System.out.println("Tu grupo saco: "+result);
            System.out.println("Felicidades, el gobierno te va a pagar mas!");}
}
}
