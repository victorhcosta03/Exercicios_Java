// Exercício 5

public class ADivisivelPorBRandom {
	
	public static void main (String[] args) {
		int a = (int) (Math.random() * 1001);
		int b = (int) (Math.random() * 21);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		if ((b > 0) && (a % b == 0)){
			System.out.println("\nEh divisivel");
		} else {
			System.out.println("\nNao eh divisivel");
		}
	}
}

