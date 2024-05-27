import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Número da conta: ");
		int numero = sc.nextInt();

		System.out.print("Número da Agência: ");
		String agencia = sc.next();

		System.out.print("Nome: ");
		String nome = sc.next();

		System.out.print("Saldo: ");
		double saldo = sc.nextDouble();

		System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " 
		+ agencia + ", conta " + numero + " e seu saldo " 
		+ saldo + " já está disponível para saque! Obrigado!");

		sc.close();
	}

}
