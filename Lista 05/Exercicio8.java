// Exercício 8

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int inicio;
		System.out.print("Informe a hora do inicio do jogo: ");
		inicio = leia.nextInt();
		
		if (inicio >= 0 && inicio <= 24){
			int fim;
			System.out.print("Informe a hora do fim do jogo: ");
			fim = leia.nextInt(); 
			
			int duracao = 0;
			
			if (fim >= 0 && fim <=24){
				if (inicio == fim){
				
				System.out.println("\nA duracao do jogo foi de 24 horas.");
			} else {
				if (inicio < fim){
					duracao = fim - inicio;
					
				} else {
					duracao = 24 - inicio + fim;
					System.out.println("\nO jogo iniciou em um dia e terminou no dia seguinte.");
					
				}
				
				System.out.println("\nA duracao do jogo foi de " + duracao + " horas ");
				
			}
			} else {
				System.out.println("\nO valor digitado deve estar entre 0 e 24.");
			}
				
		} else {
			System.out.println("\nO valor digitado deve estar entre 0 e 24.");
		}
		
	}
}

