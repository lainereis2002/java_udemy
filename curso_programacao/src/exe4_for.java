import java.util.Locale;
import java.util.Scanner;

public class exe4_for {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			double x = sc.nextInt();
			double denominador = sc.nextInt();
			
			if (denominador == 0) {
				System.out.println("divisão impossivel");
			}
			else {
				System.out.printf("%.1f %n", x/denominador);
			}
		}

		sc.close();
	}

}
