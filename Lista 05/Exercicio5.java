// Exercício 5

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anoAtual;
		System.out.print("Informe o ano atual: ");
		anoAtual = leia.nextInt();
		
		if (anoAtual >= 0){
			int anoNascimento;
			System.out.print("Informe o ano do seu nascimento: ");
			anoNascimento = leia.nextInt();
			
			if (anoNascimento <= anoAtual){
				if (anoAtual - anoNascimento >= 16){
					System.out.println("\nPode votar neste ano.");
				} else {
					System.out.println("\nNao pode votar neste ano.");
				}
			} else {
				System.out.println("\nErro!");
			}
		} else {
			System.out.println("\nDigite um valor positivo!");
		}
		
		
		
		
	}
}

