// Exercício 10

/*
	Escreva um programa em Java para ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. 
	Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, 
	calcular e escrever o seu salário total.
*/

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double salarioFixo;
		System.out.print("Informe o valor do salario fixo: ");
		salarioFixo = leia.nextDouble();
		
		if (salarioFixo >= 0){
			double valorVendas;
			System.out.print("Informe o valor obtido com as vendas: ");
			valorVendas = leia.nextDouble();
			if(valorVendas >= 0){
				double comissao = 0;
				if (valorVendas <= 1500){
					comissao = valorVendas * 0.03;
				} else {
					comissao = 1500 * 0.03 + (valorVendas - 1500) * 0.05;
				}
				
				double salarioTotal = salarioFixo + comissao;
				System.out.println("\nSalario total: " + salarioTotal);
				
			} else {
				System.out.println("\nO valor deve ser positivo.");
			}
			
		} else {
			System.out.println("\nO valor deve ser positivo.");
		}
		
	}
}
