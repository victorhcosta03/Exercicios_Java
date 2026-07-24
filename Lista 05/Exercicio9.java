// Exercício 9

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o numero de horas trabalhadas no mes: ");
		int horas = leia.nextInt();
		
		
		System.out.print("Informe o valor do salario por hora: ");
		double salarioHora = leia.nextDouble();
		
		
		double salario;
		
		
		if (horas <= 160){
			salario = salarioHora * horas;
			
		} else {
			double horaExtra = horas - 160;
			double horaNormal = horas - horaExtra;
			double salarioHoraExtra = salarioHora * 1.5;
			salario = salarioHora * horaNormal + salarioHoraExtra * horaExtra;
		}
	
		System.out.println("\nSalario total do funcionario: " + salario);
		
	}
}

