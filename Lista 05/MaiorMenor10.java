// Exercício 1

import java.util.Scanner;

public class MaiorMenor10 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valor;
		
		System.out.print("Insira um valor: ");
		valor = leia.nextDouble();
		
		if (valor > 10){
			System.out.println("\nEH MAIOR QUE 10!");
		} else {
			if (valor < 10) {
				System.out.println("\nNAO EH MAIOR QUE 10!");
			} else {
				System.out.println("\nEH IGUAL A 10!");
			}
		}
	}
}

