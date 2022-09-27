package Repeticao;

import java.util.Scanner;

/*
 Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
 */
public class Algoritimo07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i <= 50; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
				
			}
			
		}
	}

}
