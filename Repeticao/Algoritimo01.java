package Repeticao;

import java.util.Scanner;

//Faça um programa que peça uma nota, entre zero e dez. 
//Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.


public class Algoritimo01 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int verf = 1;
	while(verf != 0) {
	System.out.println("Digite uma nota entre 0 e 10: ");
	int nota = input.nextInt();
	if(nota >= 0 && nota <= 10) {
		System.out.println("Nota valida!");
		break;
		
	}else {
		System.out.println("Nota invalida, digite novamente: ");
		nota = input.nextInt();
	}
	
	
	}
	
	

	}

}
