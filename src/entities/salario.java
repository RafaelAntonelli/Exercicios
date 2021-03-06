package entities;

public class salario {
	public String name;
	public double salarioB;
	public double imposto;
	
	
	public double netSalary() {
		return salarioB - imposto;
	}
	
	public void increaseSalary(double percentage) {
		salarioB += salarioB * percentage / 100.0;
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", netSalary());
	}
}
