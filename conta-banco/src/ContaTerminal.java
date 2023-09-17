import br.com.dio.entidade.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o número da agência: ");
        String agencia = sc.nextLine();

        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Entre com o seu saldo: ");
        double saldo = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(numero, agencia, nome, saldo);
        System.out.println(conta);
        sc.close();

    }

}
