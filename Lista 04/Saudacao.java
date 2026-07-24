// Exercício 7

import java.util.Scanner;

public class Saudacao {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int hora;
		int manualOuAleatorio;
		
		System.out.print("Digite 0 para informar a hora manualmente ou digite 1 para gerar a hora aleatoriamente: ");
		manualOuAleatorio = leia.nextInt();
		
		if (manualOuAleatorio == 0){
			System.out.print("Informe a hora do dia: ");
			hora = leia.nextInt();
			if (hora >= 0 && hora <= 6){
			System.out.println("\nZzzzz");
		} else{
			if (hora >= 7 && hora <= 11){
				System.out.println("\nBom dia");
			} else{
				if (hora >= 12 && hora <= 17){
					System.out.println("\nBoa tarde");
				} else{
					if (hora >= 18 && hora <= 23){
						System.out.println("\nBoa noite");
					} else{
						System.out.println("\nValor invalido!");
					}
				}
			}
		}
		} else{
			if (manualOuAleatorio == 1){
				hora = (int) (Math.random() * 24);
				System.out.println("\nHora: " + hora);
				if (hora >= 0 && hora <= 6){
			System.out.println("\nZzzzz");
		} else{
			if (hora >= 7 && hora <= 11){
				System.out.println("\nBom dia");
			} else{
				if (hora >= 12 && hora <= 17){
					System.out.println("\nBoa tarde");
				} else{
					if (hora >= 18 && hora <= 23){
						System.out.println("\nBoa noite");
					}
				}
			}
		}
			} else{
				System.out.println("\nErro! Digite 0 ou 1.");
			}
		}
		
		
	}
}

