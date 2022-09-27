package Repeticao;

import java.util.Scanner;

/*
 Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. 
 Depois modifique o programa para que ele mostre os números um ao lado do outro.
 
 */

public class Algoritimo04 {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			System.out.println("Opção 1- Imprimir um do lado do outro\nOpção 2- Imprimir um em baixo do outro");
			System.out.println("Digite a opção desejada: ");
			int entrada = input.nextInt();
			switch(entrada) {
			case 1:
				lado();
				break;
				
			case 2:
				embaixo();
				break;
			}

	}
	
	public static void lado() {
		for(int i = 0; i <= 20; i++) {
			System.out.print(" " +  i);
			
		}
	}
	
	public static void embaixo() {
		for(int i = 0; i <= 20; i++) {
			System.out.println(" " +  i);
		
		}
	}

}
