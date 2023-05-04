package cl.desafiolatam;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int fibonacci;
        
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 2; i < n; i++) {
            fibonacci = num1 + num2;
            System.out.print(fibonacci + " ");
            num1 = num2;
            num2 = fibonacci;
        }
        
        sc.close();
        
    }


}

