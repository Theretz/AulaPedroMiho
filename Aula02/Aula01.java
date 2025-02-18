package Desafios;

import java.util.Scanner;

public class Desafio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double p = sc.nextInt();
		System.out.println("Digite a segunda nota: ");
		double s = sc.nextInt();
		System.out.println("Digite a terceira nota: ");
		double t = sc.nextInt();
		double m = (p + s + t)/3;
		System.out.println("A média final é " + m);
	}
}
