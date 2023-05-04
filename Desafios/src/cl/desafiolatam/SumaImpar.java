package cl.desafiolatam;
import java.util.Scanner;

public class SumaImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();
        int suma = 0;
        
        for (int i = 1; i <= n; i += 2) { //SUMARA DESDE EL 1 HASTA EL N CUMPLIENDO LA CONDICION
            suma += i;
        }
        
        System.out.println("La suma de los números impares desde 0 hasta " + n + " es " + suma);
        sc.close();
        
    }


}


