package br.com.casadocodigo.livraria.produtos;
public class CarrinhoDeCompras {

	private double total;
	
	public double getTotal() {
		return total;
	}
	
	public void adiciona(Produto produto) {
		System.out.println("Adicionando "+produto);
//		livro.aplicaDescontoDe(0.05);
		total +=produto.getValor();
								
	}
	
	
}
