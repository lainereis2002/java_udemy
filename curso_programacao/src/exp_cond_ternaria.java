import java.util.Locale;
import java.util.Scanner;

public class exp_cond_ternaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		//o preco é menor que 20? se sim : se não
		
		//if (preco < 20.0) {
		//	desconto = preco * 0.1;
		//}
		//else {
		//	desconto = preco * 0.5;
		//}
		
		System.out.println(desconto);
		
		sc.close();
	}

}
