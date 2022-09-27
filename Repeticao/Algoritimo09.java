package Repeticao;

import java.util.Scanner;

/*
 Altere o programa anterior para mostrar no final a soma dos números.
 */
public class Algoritimo09 {

	public static void main(String[] args) {
		int n1, n2, soma = 0, verf = 1;
		Scanner input = new Scanner(System.in);
		while(verf > 0) {
			System.out.println("Digite um numero: ");
			n1 = input.nextInt();
			System.out.println("Digite outro numero: ");
			n2 = input.nextInt();
			for(int i = n1 + 1; i < n2; i++) {
				System.out.println(i);
				soma =+ i;
			}
			System.out.println("A soma entre esses numeros eh: " + soma);
		}

	}

}
