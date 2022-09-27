package Repeticao;

import java.util.Scanner;

/*
 * Faça um programa que leia 5 números e informe a soma e a média dos números.
 */

public class Algoritimo06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3, n4, n5, soma, media, verf = 1;
		while(verf > 0) {
			System.out.println("Digite o n1:");
			n1 = input.nextInt();
			System.out.println("Digite o n2:");
			n2 = input.nextInt();
			System.out.println("Digite o n3:");
			n3 = input.nextInt();
			System.out.println("Digite o n4:");
			n4 = input.nextInt();
			System.out.println("Digite o n5:");
			n5 = input.nextInt();
			soma = n1 + n2 + n3 + n4 + n5;
			System.out.println("A soma entre os numeros eh: " + soma);
			media = soma / 5;
			System.out.println("A media entre os numeros eh: "+ media);
			break;
		}
	}

}
