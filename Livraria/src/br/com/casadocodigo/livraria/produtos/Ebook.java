package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.Autor;

public class Ebook extends Livro implements Promocional{
	
	private String waterMark;
	
	public Ebook(Autor autor) {
		super(autor);
	}
	
	
	public String getWaterMark() {
		return waterMark;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	@Override
	public void mostrarDetalhes() {
		System.out.println("***Mostrando detalhes do Ebook*** ");
		System.out.println("Nome: "+super.getNome());
		System.out.println("Descrição: "+super.getDescricao());
		System.out.println("ISBN: "+super.getIsbn());
		System.out.println("Marca d'água: "+this.waterMark);
			
		if (super.temAutor()) {
			super.getAutor().mostrarDetalhesAutor();
		}
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		
		if (porcentagem>0.15) {
			System.out.println("Desconto não pode ser maior do que 15%");
			System.out.println("---");
			return false;
			
		}else {
			double valor = super.getValor();
			super.setValorComDesconto (valor-=super.getValor()*porcentagem);	
			System.out.println("Valor com desconto: "+super.getValorComDesconto());
			System.out.println("---");
			return true;
		}
		
	}
}
