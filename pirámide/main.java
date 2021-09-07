/*
 * Copyright (c) 2021 windowsagent
 * Este programa es software libre: Puedes redistribuirlo, y/o modificarlo
 * dentro de los terminos de la licencia GPL de GNU, publicada como "GNU General
 * Public License" por la "Free Software Foundation", versión 3.
 *
 * Este programa es distribuido con esperanza de que sea útil, pero sin ninguna
 * GARANTÍA; ni si quiera con la garantía de servir para cualquier propósito
 * específico.
 */
package pirámide;

/**
 *
 * @author windowsagent-wm
 */
import java.util.*;
public class main {

  public static void main (String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.print("¿De cuantas columnas quieres la pirámide?-");
      int columnas = sc.nextInt();
      int x = 0;

    for (int i = 1; i <= columnas; ++i, x = 0) {
      for (int espacios = 1; espacios <= columnas - i; ++espacios) {
        System.out.print("  ");
      }
      // TODO: Aprender gradle porque es lo que todo el mundo usa
      // No acostumbrarme a for loops o si no terminaré escribiendo código
      // ineficiente. ¿Has intentado ponerle insertar 200 en este programa?
      // Las terminales de Unix de los 70s eran más rápidas que esto

      while (x != 2 * i - 1) {
        System.out.print("* ");
        ++x;
      }

      System.out.println();
    }
  }
}
// 100% no me aproveche de los recursos de la naturaleza de stackoverflow
