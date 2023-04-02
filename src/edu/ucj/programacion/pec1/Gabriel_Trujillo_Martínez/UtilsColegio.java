package edu.ucj.programacion.pec1.Gabriel_Trujillo_Martínez;

import java.util.Scanner;

public class UtilsColegio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int alumnos;
		int aulas;
		int asientos;
		int planta;
		String nombre_colegio;
		String dirección_colegio;
		nombre_colegio =scan.nextLine();
		System.out.println("Cual es el nombre del colegio");
		dirección_colegio =scan.nextLine();
		System.out.println("Cual es la dirección del colegio");
		alumnos = scan.nextInt();
		System.out.println("Introduzca el número de alumnos del colegio");
		aulas = scan.nextInt();
		System.out.println("Introduzca el número de aulas del colegio");
		asientos = scan.nextInt();
		System.out.println("Introduzca el número de asientos en cada clase del colegio");
		planta = scan.nextInt();
		System.out.println("Introduzca el número de plantas del colegio");
		GestionColegios Colegio= new GestionColegios();
		Aula aula= new Aula();
		Colegio.setNombre(nombre_colegio);
		Colegio.setDirección(dirección_colegio);
		Colegio.setNúmero_de_aulas(aulas);
		Colegio.setNúmero_de_alumnos(alumnos);
		
		
	        
	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < Colegio.getNúmero_de_alumnos(); i++) {
	            System.out.println("Ingresar datos del alumno " + (i+1) + ":");
	            String nombre = scanner.nextLine();
	            System.out.print("Nombre: ");
	            String apellidos = scanner.nextLine();
	            System.out.print("Apellidos: ");
	            String dni = scanner.nextLine();
	            System.out.print("dni: ");
	            Alumno alumnados[]= new Alumno[Colegio.getNúmero_de_alumnos()];
	            }
	        
	        
	       
	        	}
		
		 }
		
	
	

	

