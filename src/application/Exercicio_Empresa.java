package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empresa;

public class Exercicio_Empresa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		List<Empresa> list = new ArrayList<>();
		
		
		for (int i = 0; i<N; i++) {
			System.out.println("Employee #" + (i +1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			
			Empresa emp = new Empresa(id, name, salary);

			list.add(emp);
		}
			
			
			System.out.println("Enter the employee id that will have salary increase: ");
			int idSalary = sc.nextInt();
			Integer pos = position(list, idSalary);
			if (pos == null) {
				System.out.println("This id does not exist!");
			}
			else {
				System.out.println("Enter the percentage: ");
				double percentage = sc.nextDouble();
				list.get(pos).increaseSalary(percentage);
			}
			
			System.out.println();
			System.out.println("List of employees: ");
			for (Empresa emp : list) {
				System.out.println(emp);
			}

		
		sc.close();
	}
	
	public static Integer position(List<Empresa> list, int id) {
		for (int i = 0; i<list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
