import java.util.Scanner;

public class TesteNumPrimo {
	public static void main(String[] args) {

		Scanner entradaDeNum = new Scanner(System.in);
		
		double num;
		int i = 2;
		System.out.println("Digite um numero:");
		
		num = entradaDeNum.nextDouble();
		
		if (num % i == 0) {
			System.out.println("numero primo");
		}else {
			System.out.println("Numero não primo");
		}
	}
}
