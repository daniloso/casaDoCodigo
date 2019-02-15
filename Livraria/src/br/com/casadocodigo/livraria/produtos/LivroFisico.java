package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.Autor;

public class LivroFisico extends Livro implements Promocional {
	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public double getTaxaImpressao() {
		return this.getValor()*0.5;
	}
	
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem>3) {
			return false;
		}
		double desconto = getValor()*porcentagem;
		setValor(getValor()-desconto);
		System.out.println("Aplicando desconto no valor do livro: ");
		return true;
	}
}
