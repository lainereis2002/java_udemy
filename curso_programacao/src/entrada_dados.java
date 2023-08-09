import java.util.Scanner;

public class entrada_dados {

	public static void main(String[] args) {
		// para inicializar a função e poder ter scanners no código
		Scanner sc = new Scanner(System.in);

		// ler apenas uma palavra//
		String x;
		x = sc.next();
		System.out.println("A palavra digitada foi: " + x);

		// ler um número inteiro//
		int y;
		y = sc.nextInt();
		System.out.println("O número digitado foi: " + y);

		// ler número com ponto flutuante//
		double z;
		z = sc.nextDouble();
		System.out.println("O número com ponto flutuante foi: " + z);

		// ler um caractere//
		char a;
		a = sc.next().charAt(0);
		System.out.println("O caractere digitado foi: " + a);

		// ler vários dados na mesma linha//
		String b;
		int c;
		double d;
		b = sc.next();
		c = sc.nextInt();
		d = sc.nextDouble();
		System.out.println("A string foi: "+b+", o inteiro foi: "+c+"o ponto flutuante foi: "+d);

		// ler um texto ATÉ A QUEBRA DE LINHA//
		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// ler um texto ATÉ A QUEBRA DE LINHA - com elemento a mais
		String ss1, ss2, ss3;
		int e;
		e = sc.nextInt();
		sc.nextLine(); //para não deixar um quebra de linha pendente e a primeira str var ficar sem dado//
		ss1 = sc.nextLine();
		ss2 = sc.nextLine();
		ss3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(e);
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);

		// para encerrar o funcionamento da função
		sc.close();

	}

}
