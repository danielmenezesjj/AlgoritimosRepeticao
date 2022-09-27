package Repeticao;

import java.util.Scanner;

//Faça um programa que leia e valide as seguintes informações:
//Nome: maior que 3 caracteres;
//Idade: entre 0 e 150;
//Salário: maior que zero;
//Sexo: 'f' ou 'm';
//Estado Civil: 's', 'c', 'v', 'd';

public class Algoritimo03 {

	public static void main(String[] args) {
		int verf = 1;
		while(verf !=0) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um nome maior que 3 caracteres: ");
		String nome = input.next();
		System.out.println("Digite sua idade entre 0 a 150 anos: ");
		int idade = input.nextInt();
		System.out.println("Digite seu salario sendo maior que 0: ");
		float salario = input.nextFloat();
		System.out.println("Digite seu sexo, somente M OU F: ");
		String sexo = input.next();
		System.out.println("Digite seu estado civil, apenas S, C, V OU D: ");
		String estado = input.next();
		if(nome.length() > 3 && idade > 0 &&  idade <= 150 && salario > 0 || sexo == "m" || sexo == "f" || estado == "s" || estado == "c" || estado == "v" || estado == "d") {
			System.out.println("Infomações validas!!");
			
		}else {
			System.out.println("Informações invalidas, digite novamente");
			System.out.println("Digite um nome maior que 3 caracteres: ");
			nome = input.next();
			System.out.println("Digite sua idade entre 0 a 150 anos: ");
			idade = input.nextInt();
			System.out.println("Digite seu salario sendo maior que 0: ");
			salario = input.nextFloat();
			System.out.println("Digite seu sexo, somente M OU F: ");
			sexo = input.next();
			System.out.println("Digite seu estado civil, apenas S, C, V OU D: ");
			estado = input.next();
		}
		
	}

	}

}
