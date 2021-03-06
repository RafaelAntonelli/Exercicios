package entities;

public class Notas {
	public String name;
	public double tri1, tri2, tri3;
	public double resultado;
	
	public double somaNotas() {
		double somar = tri1 + tri2 + tri3;
		if (somar >= 60.00 && somar <= 100.00) {
			System.out.println("PASS");
		}
		else if (somar >= 0.0 && somar <= 59.00) {
		this.resultado = somar - 60.00;
			System.out.println("FAILED");
			System.out.println("MISSING " + resultado + " POINTS");
		}
		
		return somar;
	}
}


	
	
	
