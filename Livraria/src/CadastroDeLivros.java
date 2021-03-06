
public class CadastroDeLivros {
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Z�");
		autor.setCPF("123.456.789-10");
		autor.setEmail("ze@casadocodigo.com.br");
		
		Livro livro = new Livro(autor);
		livro.setNome("Java 8 Pr�tico");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.9);
//		livro.setIsbn ("978-85-66250-46-6"); 
		livro.setAutor(autor);
		livro.mostrarDetalhes();
		livro.aplicaDescontoDe(0.1);
				
		Autor outroAutor = new Autor();
		outroAutor.setCPF("987.654.321-0");
		outroAutor.setNome("J�o");
		outroAutor.setEmail("jao@casadocodigo.com.br");
		
		Livro outroLivro = new Livro(outroAutor);
		outroLivro.setNome ("L�gica de programa��o");
		outroLivro.setDescricao ("Crie seus primeiros programas");
		outroLivro.setValor(59.9);
		outroLivro.setIsbn ("978-85-66250-22-0");
//		outroLivro.setAutor(outroAutor);
		outroLivro.mostrarDetalhes();
		outroLivro.aplicaDescontoDe(0.4);
		
		Autor autorEbook = new Autor();
		autorEbook.setCPF("987.654.321-0");
		autorEbook.setNome("J�o");
		autorEbook.setEmail("jao@casadocodigo.com.br");
		
		Ebook ebook = new Ebook(autorEbook);
		ebook.setNome ("L�gica de programa��o - Ebook");
		ebook.setDescricao ("Crie seus primeiros programas");
		ebook.setValor(59.9);
		ebook.setIsbn ("978-85-66250-22-0");
//		ebook.setAutor(outroAutor);
		ebook.setWaterMark("N�o sei o que escrever");
		ebook.mostrarDetalhes();
		ebook.aplicaDescontoDe(0.15);
		
	}
}
