// Exercício 3

import java.util.Scanner;

public class CompraMacas {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int numeroMacas;
		System.out.print("Informe o numero de macas compradas: ");
		numeroMacas = leia.nextInt();
		
		if (numeroMacas > 0 && numeroMacas < 12){
			double valorMaca = 1.30;
			double custoTotal = numeroMacas * valorMaca;
			System.out.println("\nNumero de macas compradas: " + numeroMacas);
			System.out.println("Valor de cada maca: " + valorMaca);
			System.out.println("Custo total da compra: " + custoTotal);
		} else {
			if (numeroMacas >= 12){
				double valorMaca = 1;
				double custoTotal = numeroMacas * valorMaca;
				System.out.println("\nNumero de macas compradas: " + numeroMacas);
				System.out.println("Valor de cada maca: " + valorMaca);
				System.out.println("Custo total da compra: " + custoTotal);
			} else {
				System.out.print("Digite um numero maior que zero!");
			}
		}
		
	}
}

