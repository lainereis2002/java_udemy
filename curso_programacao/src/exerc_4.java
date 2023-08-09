import java.util.Locale;
import java.util.Scanner;

public class exerc_4 {

	public static void main(String[] args) {
		//leia o número de um funcionário, suas horas de trabalho, o valor que recebe
		//calcule o salário
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valor;
		numero = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f", horas*valor);
		
		sc.close();
	}

}
