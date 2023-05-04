package cl.desafiolatam;

import java.util.Scanner;

public class SoloPares2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros pares que desea:  ");
        int n = sc.nextInt();
        int contador = 0;
        int i = 1;
        
        while (contador < n) {
            if (i % 2 == 0) {
                System.out.println(i);
                contador++;  // CONTADOR AUMENTA SOLO CUANDO EL NUMERO ES PAR
            }
            i++; // ACÁ i AUMENTARA DE UNO EN UNO 
        }
        sc.close();
	}
}

