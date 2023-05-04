package cl.desafiolatam;
import java.util.Scanner;
public class SumaImparLimite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el límite inferior del intervalo: ");
        int min = sc.nextInt();
        System.out.print("Ingrese el límite superior del intervalo: ");
        int max = sc.nextInt();
        int suma = 0;
        
        if (min % 2 == 0) { // Si el límite inferior es par, se ajusta a un número impar
            min++;
        }
        
        for (int i = min; i <= max; i += 2) {
            suma += i;
        }
        
        System.out.println("La suma de los números impares en el intervalo [" + min + ", " + max + "] es " + suma);
    sc.close();
	
	}
}