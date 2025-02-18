package Desafios;

import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o capital inicial: ");
		int c = sc.nextInt();
		System.out.println("Digite a taxa %: ");
		double i = sc.nextDouble();
		System.out.println("Digite o tempo (meses): ");
		int t = sc.nextInt();
		double j = c * (i/100) * t;
		System.out.println("O valor do juros é de: " + j);
	}
	
	
}
