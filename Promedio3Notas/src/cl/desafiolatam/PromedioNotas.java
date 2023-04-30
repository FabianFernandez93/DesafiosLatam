package cl.desafiolatam;
import java.util.Scanner;

public class PromedioNotas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String estado = "";
		
		
		System.out.printf("Ingrese nombre: ");
		String estudiante = sc.nextLine();
		
		System.out.printf("Ingrese Nombre Asignatura: ");
		String asignatura = sc.nextLine();
		
		System.out.printf("Ingrese Nombre Docente: ");
		String docente = sc.nextLine();
		
		System.out.printf("Ingrese Nota1: ");
		int nota1 = sc.nextInt();
		System.out.println(nota1);
		
		System.out.printf("Ingrese Nota2: ");
		int nota2 = sc.nextInt();
		System.out.println(nota2);
		
		System.out.printf("Ingrese Nota3: ");
		int nota3 = sc.nextInt();
		System.out.println(nota3);
		
		float promedio = (nota1 + nota2 + nota3) / 3;
		System.out.println(promedio);
				
		System.out.printf(
				"Estudiante: %s\n"
				+ "Asignatura: %s\n"
				+ "Docente: %s\n"
				+ "Nota 1: %d\n"
				+ "Nota 2: %d\n"
				+ "Nota 3: %d\n"
				+ "Promedio: %f\n",
				estudiante, asignatura, docente, nota1, nota2, nota3,
				promedio);
		
		if (promedio < 4) {
			estado = "Dar Prueba de Recuperación";
			System.out.println(estado); }
		if (promedio >= 4 && promedio <= 5.5f) {
			estado = "Dar Prueba de examen";
			System.out.println(estado); }
		else{
			estado = "Eximido";
			System.out.println(estado);
		};
}
}
		
