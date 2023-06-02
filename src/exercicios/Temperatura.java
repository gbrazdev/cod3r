package exercicios;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner myObj = new Scanner(System.in);

System.out.println("Digite a temperatura em fahrenheit (F°)");

double f = myObj.nextDouble();

double converte = f - 32 * 5/9;

System.out.println("A temperatura em Celcius (C°) é " + converte + "C°");
		
		
	}

}
