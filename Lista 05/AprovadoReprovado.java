// Exercício 4

import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double primeiraNota;
		
		System.out.print("Insira a nota da primeira avaliacao: ");
		primeiraNota = leia.nextDouble();
		
		if (primeiraNota >= 0 && primeiraNota <= 10){
		
			double segundaNota;
			
			System.out.print("Insira a nota da segunda avaliacao: ");
			segundaNota = leia.nextDouble();
			
			if (segundaNota >= 0 && segundaNota <= 10){
				double media = (primeiraNota + segundaNota) / 2;
				
				if (media >= 6){
					System.out.println("\nAluno aprovado");
				} else {
					System.out.println("\nAluno reprovado");
				}
				
				System.out.print("Media: " + media);
				
			} else {
				System.out.print("\nDigite um valor entre 0 e 10!");
			}
			
		} else {
			System.out.print("\nDigite um valor entre 0 e 10!");
		}
	}
}

