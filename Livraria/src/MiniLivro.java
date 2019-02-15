
public class MiniLivro extends Livro implements Promocional{
	public MiniLivro (Autor autor) {
		super(autor);
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
