package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Exercicio_Notas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Notas nota = new Notas();
		
		
		nota.name = sc.nextLine();
		nota.tri1 = sc.nextDouble();
		nota.tri2 = sc.nextDouble();
		nota.tri3 = sc.nextDouble();
		System.out.printf("FINAL GRADE = %.2f POINTS%n", nota.somaNotas());
		
		
		
		sc.close();
	}
}
