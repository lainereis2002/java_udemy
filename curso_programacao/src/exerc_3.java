import java.util.Scanner;

public class exerc_3 {

	public static void main(String[] args) {
		//ler quatro valores inteiros
		//mostrar a diferença do produto de A e B pelo produto de C e D
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		System.out.println("DIFERENCA = " + ((A*B)-(C*D)));
		
		sc.close();
	}

}
