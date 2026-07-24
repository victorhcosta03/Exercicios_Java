// Exercicio 11

/*
	Desenvolva um programa em Java que receba dois valores numéricos e uma das opções que representam uma das operações aritméticas 
	(ler em String e testar como char): ‘+’ , ‘-‘, ‘*’ e ‘/’. 
	Calcule e mostre a operação efetuada e o seu resultado.
 */

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valor1;
		System.out.print("Digite um valor: ");
		valor1 = leia.nextDouble();
		
		double valor2;
		System.out.print("Digite outro valor: ");
		valor2 = leia.nextDouble();
		
		String operacao;
		System.out.print("Digite '+', '-', '*' ou '/' para escolher a operacao que deseja realizar: ");
		operacao = leia.next();
		
		double resultado = 0;
		
		char operacaoChar = operacao.charAt(0);
		
		switch (operacaoChar){
			case '+':
			resultado = valor1 + valor2;
			System.out.println("\nOperacao: " + valor1 + " + " + valor2 + " = " + resultado);
			break;
			
			case '-':
			resultado = valor1 - valor2;
			System.out.println("\nOperacao: " + valor1 + " - " + valor2 + " = " + resultado);
			break;
			
			case '*':
			resultado = valor1 * valor2;
			System.out.println("\nOperacao: " + valor1 + " * " + valor2 + " = " + resultado);
			break;
			
			case '/':
			if (valor2 != 0){
				resultado = valor1 / valor2;
				System.out.println("\nOperacao: " + valor1 + " / " + valor2 + " = " + resultado);
				
			} else {
				System.out.println("\nErro! Nao eh possivel dividir por 0.");
			}
			break;
			
			
			default:
			System.out.println("\nOperacao invalida!");
		}
		
		
	}
}

