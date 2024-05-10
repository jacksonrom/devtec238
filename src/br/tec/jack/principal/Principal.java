package br.tec.abrindoportas.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// BLOCO - Declaração de variáveis
		String name, cpf, phoneNumber;
		double nota1, nota2, media, notar, mediar;
		int count;
		Scanner read = new Scanner(System.in);
		
		for(count = 0; count <= 5; count++) {
		
			// BLOCO - Entrada de dados
			System.out.println("Digite o seu nome: ");
			name = read.next();
			System.out.println("Digite o seu CPF: ");
			cpf = read.next();
			System.out.println("Digite o seu Telefone: ");
			phoneNumber = read.next();
			
			System.out.println("Digite a 1ª nota: ");
			nota1 = read.nextDouble();
			
			System.out.println("Digite a 2ª nota: ");
			nota2 = read.nextDouble();
			
			// BLOCO - Processamento de dados
			media = (nota1 + nota2)/2;
			
			// BLOCO - Saída de dados
			if(media >= 7) {
				System.out.println("Aluno: " + name 
						+ " de CPF: " + cpf 
						+ " Telefone: " + phoneNumber
						+ " Aprovado com média: " + media);
			}else if(media < 7){
				System.out.println("Aluno: " + name 
						+ " de CPF: " + cpf 
						+ " Telefone: " + phoneNumber
						+ " Recuperação: " + media);
				
				System.out.println("Digite a nota recuperação");
				notar = read.nextDouble();
				mediar = (media + notar)/2;
				
				if(mediar >= 5) {
					System.out.println("Aluno: " + name 
							+ "de CPF: " + cpf 
							+ "Telefone: " + phoneNumber
							+ "Aprovado com média: " + mediar);
				}else {
					System.out.println("Aluno: " + name 
							+ "de CPF: " + cpf 
							+ "Telefone: " + phoneNumber
							+ "Reprovado com média: " + mediar);
				}
			}
		}
		
	} // fim metohod main
} //fim class Principal
