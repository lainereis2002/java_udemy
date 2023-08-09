import java.util.Locale;
import java.util.Scanner;

public class exerc_5 {

	public static void main(String[] args) {
		//ler codigo quantidaede e valor unitário - na mesma linha - peça 1
		// a mesma coisa para a peça 2
		//mostre o total a ser pago
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, quant1, quant2;
		double valor1, valor2;
		
		cod1 = sc.nextInt();
		quant1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		quant2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f ", ((quant1*valor1)+(quant2*valor2)));
		
		sc.close();

	}

}
