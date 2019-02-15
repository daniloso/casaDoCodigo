
public class RegistroDeVendas {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Mauricio");
	
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("TDD");
		fisico.setValor(59.90);
		if (fisico.aplicaDescontoDe10Porcento()) {
			System.out.println("Valor agora é "+fisico.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test Driven Development");
		ebook.setWaterMark("blabla");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total "+carrinho.getTotal());
	}
}
