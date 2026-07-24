// Exercício 12

public class OperadorTernario {
	
	public static void main (String[] args) {
		int a = (int)(Math.random() * 100);
		int b = (int)(Math.random() * 100);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println(a < b ? "a < b" : "a >= b" );
	}
}

