import java.util.Scanner;

public class exe1_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int chave = 2002;
		int senha = sc.nextInt();
		
		while (chave != senha) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
