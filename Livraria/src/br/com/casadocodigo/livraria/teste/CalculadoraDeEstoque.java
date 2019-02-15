package br.com.casadocodigo.livraria.teste;

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		double livroJava8;
		double livroTDD;
		
		livroJava8 = 59.90;
		livroTDD = 59.90;
		
		double soma = livroJava8+livroTDD;
		
		System.out.println("O total em estoque é de: "+soma+" livros!");
		
		if (soma<150){
			System.out.println("Seu estoque esta muito baixo");
			
		}else if(soma>=2000) {
			System.out.println("Seu estoque esta muito alto");
		}else {
			System.out.println("Seu estoque esta bom");
		}
	}
}
