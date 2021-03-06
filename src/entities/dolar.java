package entities;

public class dolar {
	
	public static final double IOF = 0.06;
	
	public static double converter(double cotacao, double valor) {
		return cotacao * valor * (1.0  + IOF);
		
	}
}
