import java.util.Scanner;

public class TesteNumPrimo {
	public static void main(String[] args) {

		Scanner entradaDeNum = new Scanner(System.in);

		int num;
		int i = 2;
		
		System.out.println("Digite um numero:\n");
		num = entradaDeNum.nextInt();
		for (i = 2; i <= num; i++) {
			if (num % i == 0) {
				System.out.println("O numero " + num + " � divisivel por " + i + ", portanto � primo!");
			} else {
				System.out.println("O numero " + num + " n�o � divisivel por " + i + ", portanto n�o � primo!");
			}
//			System.out.println(i);
		}

	}
}
