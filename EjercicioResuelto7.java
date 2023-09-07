//Determinar si un numero es mayor, menor o igual que otro
import java.util.Scanner;
public class EjercicioResuelto7 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int a,b; //Declaracion de variables
        System.out.println("Ingrese el primer numero: ");
        a=entrada.nextInt(); //Entrada del primer numero
        System.out.println("Ingrese el segundo numero: ");
        b= entrada.nextInt(); //Entrada del segundo numero
        if(a>b){ //Condicional, pregunta si es mayor
            System.out.println(a+" es mayor que "+b);
        } else if (a<b) { //Condicional, pregunta se es menor
            System.out.printf(a+" es menor que "+b);
        }
        else{ //Si no se cumplen los casos, entonces son iguales
            System.out.println(a+" es igual que "+b);
        }
    }
}
