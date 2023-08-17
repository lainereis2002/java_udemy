import java.util.Scanner;

public class cond_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor = sc.nextInt();
		int soma = 0;
		
		for (int i=0; i<valor; i++) {
			int num = sc.nextInt();
			soma +=num;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
