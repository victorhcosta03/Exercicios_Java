// Exercício 2

import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float nota;
		
		System.out.print("Insira a nota: ");
		nota = leia.nextFloat();
		
		if(nota >= 0 && nota <= 10){
			if (nota < 6){
				System.out.print("Reprovado.");
			} else {
				System.out.print("Aprovado.");
			}
		} else{
			System.out.println("Valor invalido.");
		} 
	}
}

