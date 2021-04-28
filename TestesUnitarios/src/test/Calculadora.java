package test;

public class Calculadora {
	public double somar(double num1, double num2) {
		return num1 + num2;
	}
	
	public double subtrair(double num1, double num2) {
		return num1 - num2;
	}
	
	public double dividir(double num1, double num2) {
		double result = 0.0;
	try {
			if(num1/num2 < Double.MAX_VALUE) {
				return num1 / num2;
			
		} else { 
			System.out.print("Divisão por zero");
			return 0;
			}	
	    }
		catch (Exception e) {
			System.out.print("Erro de divisão por 0"+e);
			return 0;
		}
		
		
	}
	
	public double multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	
}
