package Desafios;

import java.util.Scanner;

public class Desafio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio: ");
		int r = sc.nextInt();
		double pi = 3.14;
		double a = pi * Math.pow(r, 2);
		double p = 2 * pi * r;
		System.out.println("A área do circulo é igual a: " + a);
		System.out.println("O perimetro do circulo é igual a: " + p );
	}
}
