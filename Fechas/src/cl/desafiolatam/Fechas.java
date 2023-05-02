package cl.desafiolatam;

import java.util.Scanner;

public class Fechas {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
	

		int ver1 = 0;  // LO USARE PARA VERIFICAR QUE SEA EL FORMATO 

		
		while ( ver1 != 1 ) { 
			
			
			System.out.println("Favor de ingresar la fecha en el siguiente formato \nDD/MM/AAAA: ");
			System.out.println("Primera Persona: ");	
			//Fecha Primera Persona
			String fecha1 = sc.nextLine();
			int largo = fecha1.length();
			// System.out.println(largo);  -----< acá veo cuanto es el largo del formato para que continue
			//ESTO ES PARA QUE TENGO EL FORMATO REQUERIDO DD/MM/AAAA
			while (largo != 10) {
				System.out.println("ingrese el formato correcto!!: \nfecha primera persona  :");
				fecha1 = sc.nextLine();
				largo = fecha1.length();
				}
				
				if ( largo == 10 ) {
					System.out.println("primera fecha agregada");
					
				}
				
			
			//Fecha Segunda persona
			System.out.println("Segunda persona ");
			String fecha2 = sc.nextLine();
			int largo2 = fecha2.length();
			
			while (largo2 != 10) {
				System.out.println("ingrese el formato correcto!!: \nfecha segunda persona  :");
				fecha2 = sc.nextLine();
				largo2 = fecha2.length();
				}
			if ( largo2 == 10 ) {
				System.out.println("segunda fecha agregada");
				
			}
			
		    String d = fecha1.substring(0,2);
		    int dia1 = Integer.parseInt(d);
		    String m = fecha1.substring(3,5);
		    int mes1 = Integer.parseInt(m);
		    String a = fecha1.substring(6,10);
		    int anio1 = Integer.parseInt(a);
		    
		    //Fecha segunda persona

		    
		    String d2 = fecha2.substring(0,2);
		    int dia2 = Integer.parseInt(d2);
		    String m2 = fecha2.substring(3,5);
		    int mes2 = Integer.parseInt(m2);
		    String a2 = fecha2.substring(6,10);
		    int anio2 = Integer.parseInt(a2);
		    
		// ACA VEO SI CUMPLE LOS REQUISITOS SI ES ASI VER1 CUMPLE CON CERRAR EL PROGRAMA 
		    if (dia1 > 0 && dia1 <31 && dia2 > 0 && dia2 <31 && mes1 > 0 && mes1 < 13 && 
		    		mes2 > 0 && mes2 < 13){
		    	ver1 = 1;
		    	System.out.println("programa terminado con ezito ! : ");
		    	}
		    
		    else {
		    	System.out.println("INGRESE EL FORMATO CORRECTO DD/MM/AAAA");
		    	};
		    
		    if ( anio1 < anio2) {
		    	System.out.println("Primera persona es mayor");
		    	break;
		    }
		    if (anio1 == anio2 && mes1 < 2){
		    	System.out.println("Primera persona es mayor");
		    	break;
		    }
		    
		    if (anio1 == anio2 && mes1 == mes2 && dia1 < dia2){
		    	System.out.println("Primera Persona es mayor");
		    	break;
		    }
		    else 
		    	System.out.println("Segunda Persona es mmayor");
		    ;
				
		};


	}
}


