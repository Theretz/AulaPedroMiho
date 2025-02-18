package Desafios;

import java.util.Scanner;

public class Desafio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o captal inicial: ");
		int c = sc.nextInt();
		System.out.println("Digite a taxa de juros ao mes: ");
		int i = sc.nextInt();
		System.out.println("Digite o tempo dos juros mensais: ");
		int t = sc.nextInt();
		double m = c * Math.pow(1+i,t);
		System.out.println("O montante é "  + m);
		
		
		
	}

}
