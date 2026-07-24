// Exercício 4

import java.util.Scanner;

public class VerificaValorProduto {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float precoProduto1;
		float precoProduto2;
		
		System.out.print("Insira o preco do produto 1: ");
		precoProduto1 = leia.nextFloat();
		
		if (precoProduto1 < 0 || precoProduto1 > 1000){
			System.out.print("VALOR INVALIDO");
		} else {
			System.out.print("Insira o preco do produto 2: ");
			precoProduto2 = leia.nextFloat();
			if (precoProduto2 < 0 || precoProduto2 > 1000){
				System.out.print("VALOR INVALIDO");
			} else {
				if (precoProduto1 < precoProduto2){
					System.out.print("O produto 1 eh o mais barato");
			} else {
				if (precoProduto1 > precoProduto2){
					System.out.print("O produto 2 eh o mais barato");
				} else {
					System.out.print("Os precos dos dois produtos sao iguais");
				}
			}
		}
	}		
	}
}

