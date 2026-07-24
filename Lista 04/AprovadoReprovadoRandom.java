// Exercício 1

public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		float nota = (float) (Math.random() * 10);
		
		System.out.printf("Nota: %.2f%n", nota);
		
		if (nota < 6){
			System.out.println("\nReprovado!");
		} else {
			System.out.println("\nAprovado!");
		}
	}
}

