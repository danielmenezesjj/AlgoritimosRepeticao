package Repeticao;

import java.util.Scanner;

/*
 Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

 */
public class Algoritimo08 {

	public static void main(String[] args) {
		int n1, n2, verf = 1;
		Scanner input = new Scanner(System.in);
		while(verf > 0) {
			System.out.println("Digite um numero: ");
			n1 = input.nextInt();
			System.out.println("Digite outro numero: ");
			n2 = input.nextInt();
			for(int i = n1 + 1; i < n2; i++) {
				System.out.println(i);
			}
		}

	}

}
