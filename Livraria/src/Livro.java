
public class Livro {

	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;
	
	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro: ");
		System.out.println("Nome: "+nome);
		System.out.println("Descri��o: "+descricao);
		System.out.println("Valor: "+valor);
		System.out.println("ISBN: "+isbn);
		
		autor.mostrarDetalhes();
				
	}
}
