import java.util.Scanner;

public class exe3_if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite dois números: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a%b==0 || b%a==0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao Sao Multiplos");
		}
		
		sc.close();
	}

}
