/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

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
        int a = 8;
        int ab = a%2;
        if (ab==1){
            System.out.println("Resultado (en cubo):");
            System.out.println(a*a*a);
        }else{
            System.out.println("Resultado (al cuadrado):");
            System.out.println(a*a);
        }
    }
    
}
