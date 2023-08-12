import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 5;
		
		System.out.println("Bom dia!");
		if (x > 0) { //ele printa
			System.out.println("Boa tarde!");
		}
		
		if (x < 0) { //ele não printa
			System.out.println("Boa tarde!");
		}
		System.out.println("Boa noite!");
		
		
		int hora;
		
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		else if (hora < 18) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
		}
		

		
		sc.close();
	}
}
