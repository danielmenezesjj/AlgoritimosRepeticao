package Repeticao;

import java.util.Scanner;

//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, 
//mostrando uma mensagem de erro e voltando a pedir as informações.


public class Algoritimo02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int verf = 1;
		while(verf != 0) {
			System.out.println("Digite o nome de usuario: ");
			String usuario = input.next();
			System.out.println("Digite a senha de ususario: ");
			String senha = input.next();
			if(usuario.equals(senha)) {
				System.out.println("Usuario e senha não podem ser iguais, digite novamente");
				System.out.println("Digite o nome de usuario: ");
				usuario = input.next();
				System.out.println("Digite a senha de ususario: ");
				senha = input.next();
				
			}else {
				System.out.println("Usuario logado com sucesso!");
				break;
			}
			
		}

		
	}

}
