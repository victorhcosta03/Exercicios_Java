// Exercício 3

public class VerificaValorProdutoRandom {
	
	public static void main (String[] args) {
		double precoProduto1 = Math.random() * 1000;
		double precoProduto2 = Math.random() * 1000;
		
		System.out.printf("Preco do produto 1: %.2f" , precoProduto1);
		System.out.printf("\nPreco do produto 2: %.2f" , precoProduto2);
		
		if (precoProduto1 < precoProduto2){
			System.out.print("\nO produto 1 eh o mais barato");
		} else {
			 if (precoProduto1 > precoProduto2){
			System.out.print("\nO produto 2 eh o mais barato");
		} else {
			System.out.print("\nOs preços dos dois produtos sao iguais");
		}
	}
	}
}

