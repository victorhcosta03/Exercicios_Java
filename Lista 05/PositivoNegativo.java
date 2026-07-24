// Exercício 2

import java.util.Scanner;

public class PositivoNegativo {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valor;
		
		System.out.print("Digite um valor: ");
		valor = leia.nextDouble();
		
		if (valor >= 0){
			System.out.print("\nO valor eh positivo.");
		} else {
			System.out.print("\nO valor eh negativo.");
		}
	}
}

