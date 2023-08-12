import java.util.Scanner;

public class exe5_if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod, quant;
		
		System.out.println("Digite o código e a quantidade: ");
		cod = sc.nextInt();
		quant = sc.nextInt();
		
		if (cod == 1) {
			System.out.println("Total: R$ " + 4.00*quant);
		}
		else if (cod == 2) {
			System.out.println("Total: R$ " + 4.50*quant);
		}
		else if (cod == 3) {
			System.out.println("Total: R$ " + 5.00*quant);
		}
		else if (cod == 4) {
			System.out.println("Total: R$ " + 2.00*quant);
		}
		else if (cod == 5) {
			System.out.println("Total: R$ " + 1.50*quant);
		}
		else {
			System.out.println("Codigo invalido");
		}
		
		sc.close();

	}

}
