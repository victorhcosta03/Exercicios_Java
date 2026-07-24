// Exercicio 12

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o preco do produto: ");
		double preco = leia.nextDouble();
		
		if (preco >= 0){
			
			System.out.print("Informe o codigo do produto: ");
			int codigo = leia.nextInt();
			
			String regiao;
			float frete;
			
			switch (codigo) {
				case 1:
				regiao = "Norte";
				frete = 0.1f;
				break;
				
				case 2:
				
				case 5:
				
				case 9:
				regiao = "Sul";
				frete = 0.03f;
				break;
				
				case 3:
				
				case 10:
				
				case 11:
				
				case 12:
				
				case 13:
				
				case 14:
				
				case 15:
				regiao = "Leste";
				frete = 0.012f;
				break;
				
				case 7:
				
				case 20:
				regiao = "Oeste";
				frete = 0.073f;
				break;
				
				default:
				regiao = "Importado";
				frete = 0.222f;
				break;
			}
			
			double valorFrete = preco * frete;
			double valorFinal = preco + valorFrete;
			
			System.out.println("\nPreco do produto: " + preco);
			System.out.println("Regiao de procedencia: " + regiao);
			System.out.printf("Valor do frete: %.2f%n", valorFrete);
			System.out.printf("Valor final a ser pago: %.2f%n", valorFinal);
			
		} else {
			System.out.println("\nO preco deve ser maior que 0");
		}
	}
}
