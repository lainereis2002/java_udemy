import java.util.Scanner;

public class exerc_1 {

	public static void main(String[] args) {
		//faça um programa para ler dois valores inteiros
		//depois mostrar na tela a soma desses números
		
		Scanner sc =  new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("SOMA = " + (a+b));
		
		sc.close();
	}

}
