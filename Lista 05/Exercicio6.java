// Exercício 6

import java.util.Scanner;

public class Exercicio6 {
	
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
				System.out.println("\nO primeiro valor eh o maior");
				System.out.println("Valor: " + valor1);
			} else {
				System.out.println("\nO segundo valor eh o maior");
				System.out.println("Valor: " + valor2);
			}
		} else {
			System.out.print("\nOs valores devem ser diferentes!");
		}
		
		
	}
}

