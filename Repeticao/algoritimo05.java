package Repeticao;

import java.util.Scanner;

public class algoritimo05 {
/*
 * Faça um programa que leia 5 números e informe o maior número.
 */
	public static void main(String[] args) {
		int n1, n2, n3, n4, n5, verf= 1;
		Scanner input = new Scanner(System.in);
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
			if(n1 > n2 && n1 >  n3 && n1 > n4 && n1 > n5) {
				
				System.out.println("O maior numero eh: " + n1);
				break;
				
			}else if(n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5){
				System.out.println("O maior numero eh: " + n2);
				break;
				
			}else if(n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
				
				System.out.println("O maior numero eh: " + n3);
				break;
				
			}else if(n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) {
				System.out.println("O maior numero eh: " + n4);
				break;
				
			}else if(n5 > n1 && n5 > n2 && n5 > n3 && n5 > n4) {
				
				System.out.println("O maior numero eh: " + n5);
				break;
				
			}
			
		}
		

	}

}
