package cl.desafiolatam;

import java.util.Scanner;

public class Desafio18deAbril {

	public static void main(String[] args) {		
		
		int n;
		
		System.out.println("Cuantos caracteres quiere: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		
		System.out.println("");
		System.out.println("");

		for (int j = 1; j <= n; j++) {
			if (j % 2 == 0){
				System.out.print(".");}
			else {System.out.print("*");}
						
			};
			
			System.out.println("");
			System.out.println("");
			
			for (int i = 1; i <= n; i++) {
				
				if (i % 4 == 1.0) {
					System.out.print("1");
				}
				if (i % 4 == 2.0) {
					System.out.print("2");
				}
				if (i % 4 == 3.0) {
					System.out.print("3");
				}
				if (i % 4 == 0) {
					System.out.print("4");
					}
			     }
			
			System.out.println("");
			System.out.println("");
			
               for (int q = 1; q <= n; q++) {
				
				if (q % 3 == 1.0) {
					System.out.print("|");
				}
				if (q % 3 == 2.0) {
					System.out.print("|");
				}
				if (q % 3 == 0) {
					System.out.print("*");
		
		
	}
	}
               
               sc.close();
               }}


