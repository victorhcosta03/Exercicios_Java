// Exercício 10

/*
	Considere um sistema de gerenciamento de mercadorias de uma loja. 
	Implemente um programa que declare variáveis para representar os seguintes dados: número do pedido, código do produto, quantidade e valor total da compra. 
	Inicialize essas variáveis com valores apropriados. 
	Por fim, exiba os valores armazenados.
 */

public class Exercicio10 {
	
	public static void main (String[] args) {
		
		int numeroPedido = 256, quantidade = 25;
		long codigoProduto = 624597230431L;
		float valorTotal = 1384.90F;
		
		System.out.println("Numero do pedido: " + numeroPedido);
		System.out.println("Codigo do produto: " + codigoProduto);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Valor total da compra: " + valorTotal);
		
	}
}

