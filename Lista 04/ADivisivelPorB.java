// Exercício 6

import java.util.Scanner;

public class ADivisivelPorB {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		float a;
		float b;
		
		System.out.print("Insira o valor de a: ");
		a = leia.nextFloat();
		
		if (a < 0 || a > 1000){
			System.out.println("Valor invalido.");
		} else {
			System.out.print("Insira o valor de b: ");
			b = leia.nextFloat();
			
			if (b < 0 || b > 20){
				System.out.println("\nValor invalido.");
			} else{
				if (a < b){
					System.out.println("\nO valor de a eh menor do que o valor de b.");
				} else{
					if (a % b == 0){
						System.out.println("\nEh divisivel.");
					} else{
						System.out.println("\nNao eh divisivel.");
					}
				}
			}
		}
				
	}
}
