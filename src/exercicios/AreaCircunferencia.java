package exercicios;

import java.util.Scanner;

public class AreaCircunferencia {

	public static void main(String[] args) {
		final double PI = 3.14159;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Digite o raio");
		double raio = myObj.nextDouble();
		
		double area = (PI * raio * raio);
		
		System.out.println("A area é " + area);
	}
}
