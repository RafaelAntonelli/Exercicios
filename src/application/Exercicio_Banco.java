package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Exercicio_Banco {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Enter account holder: ");
	String name = sc.nextLine();
	System.out.print("Enter accout number: ");
	int accountNumber = sc.nextInt();
	
	
	Banco banco = new Banco(accountNumber, name);
	double value = 0;
	String y = "y";
	System.out.print("Is there a inicial deposit (y/n)? ");
	if (y.equals(sc.next())) {
		System.out.print("Enter initial deposit value: " );
		value = sc.nextDouble();
		banco.depositValue(value);
	} 
	else {
		System.out.print(banco.getDeposit());
	}
	
	System.out.println();
	
	System.out.println("Updated data:");
	System.out.println("Holder: " + banco);
	
	System.out.println("Enter a deposit value: ");
	value = sc.nextDouble();
	banco.depositValue(value);
	
	System.out.println("Updated data:");
	System.out.println("Holder: " + banco);
	
	System.out.println("Enter a withdraw value: ");
	value = sc.nextDouble();
	banco.withdrawtValue(value);
	
	System.out.println("Updated data:");
	System.out.println("Holder: " + banco);
	
	sc.close();

	}

}
