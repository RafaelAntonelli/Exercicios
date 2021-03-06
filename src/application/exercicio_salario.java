package application;

import java.util.Locale;
import java.util.Scanner;

import entities.salario;

public class exercicio_salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		salario emp = new salario();
		
		System.out.println("Nome: ");
		emp.name = sc.nextLine();
		System.out.println("Salario: ");
		emp.salarioB = sc.nextDouble();
		System.out.println("Impostos: ");
		emp.imposto = sc.nextDouble();
		System.out.println();
		
		System.out.printf("Employee: " + emp);
		System.out.println();
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + emp);
		
		
		
		
		
		sc.close();
	}

}
