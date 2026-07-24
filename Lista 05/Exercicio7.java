// Exercício 7

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valor1;
		System.out.print("Digite um valor: ");
		valor1 = leia.nextDouble();
		
		double valor2;
		System.out.print("Digite outro valor: ");
		valor2 = leia.nextDouble();
		
		if (valor1 != valor2){
			if (valor1 > valor2){
				System.out.println("\nValores em ordem crescente: " + valor2 + " e " + valor1);
			} else {
				System.out.println("\nValores em ordem crescente: " + valor1 + " e " + valor2);
			}
		} else {
			System.out.print("\nOs valores devem ser diferentes!");
		}
	}
}

