
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args)
    {
        System.out.println("Inserta el primer y segundo número (separados por un espacio):");
        try (Scanner inp = new Scanner(System.in)) {
			int a,b;
			a = inp.nextInt();
			b = inp.nextInt();
			System.out.println("Inserta la operación a realizar: 1 para suma, 2 para resta 3 para multiplicación y 4 para división:");
			int choose;
			choose = inp.nextInt();
			switch (choose){
			case 1:
			    System.out.println(add( a,b));
			    break;
			case 2:
			    System.out.println(sub( a,b));
			    break;      
			case 3:
			    System.out.println(mult( a,b));
			    break;
			case 4:
			    System.out.println(div( a,b));
			    break;
			    default:
			        System.out.println("Inserta una operación válida");


			}
		}



    }
    public static int add(int x, int y)
    {
        int resultado = x + y;
        return resultado;
    }
    public static int sub(int x, int y)
    {
        int resultado = x-y;
        return resultado;
    }
    public static int mult(int x, int y)
    {
        int resultado = x*y;
        return resultado;
    }
    public static String div(int x, int y)
    {
        int resultado1 = (int) Math.ceil(y/y);
        int residuo = x%y;
        return "Tu residuo es: " + residuo + "tu cociente es: " + resultado1;
    }

}
