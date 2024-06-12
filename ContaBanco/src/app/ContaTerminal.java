package app;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void Start() {
		Scanner scan= new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite o número da sua conta: \n");
		int numero = scan.nextInt();
		
		System.out.print("Digite a agência da sua conta: \n");
		String agencia = scan.next();
		
		System.out.print("Digite o seu nome: \n");
		String nomeCliente = scan.next();
		
		System.out.print("Digite o saldo da sua conta: \n");
		double saldo = scan.nextDouble();
	
		scan.close();
		
		String mensagemCompleta = "Olá "
				.concat(nomeCliente)
				.concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
				.concat(agencia)
				.concat(", conta ")
				.concat(Integer.toString(numero))
				.concat(" e seu saldo de ")
				.concat(Double.toString(saldo))
				.concat(" já está disponível para saque.");
	
		System.out.print(mensagemCompleta);
	}
	
}
