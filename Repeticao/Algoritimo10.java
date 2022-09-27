/*
 Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
 O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

 */

package Repeticao;

import java.util.Scanner;

public class Algoritimo10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero, mut;
		System.out.println("Digite o numero que deseja saber a tabuada: ");
		numero = input.nextInt();
		for(int i = 0 + 1; i <= 10; i++) {
			mut = numero * i;
			System.out.println(numero + " X " + i + " = " + mut);
			
			
		}

	}

}
