import java.util.Locale;
import java.util.Scanner;

public class exerc_2 {

	public static void main(String[] args) {
		//faça o programa ler o valor de um raio de um círculo
		//depois mostrar o valor da área com 4 casas decimais
		//área = pi * raio^2
		//pi = 3,14159
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi;
		raio = sc.nextDouble();
		pi = 3.14159;
		area = pi * Math.pow(raio, 2.0);
		
		System.out.printf("A = %.4f", area);
		
		sc.close();
	}

}
