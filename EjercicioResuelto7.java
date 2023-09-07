import java.util.Scanner;
public class EjercicioResuelto7 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int a,b;
        System.out.println("Ingrese el primer numero: ");
        a=entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        b= entrada.nextInt();
        if(a>b){
            System.out.println(a+" es mayor que "+b);
        } else if (a<b) {
            System.out.printf(a+" es menor que "+b);
        }
        else{
            System.out.println(a+" es igual que "+b);
        }
    }
}
