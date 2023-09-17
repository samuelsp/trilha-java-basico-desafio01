import exceptions.ParametrosInvalidosException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro: ");
            int primeiroParametro = sc.nextInt();

            System.out.println("Digite o segundo parâmetro: ");
            int segundoParametro = sc.nextInt();

            contar(primeiroParametro, segundoParametro);
        }

        catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
            e.printStackTrace();
        }

        catch (InputMismatchException e) {
            System.out.println("Os valores dos parâmetros devem ser números inteiros.");
            e.printStackTrace();
        }

        finally {
            sc.close();
        }

    }

    static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException {
        if (paramUm > paramDois) {
            throw new ParametrosInvalidosException();
        }

        int contador = paramDois - paramUm;
        for (int i = 1; i <= contador; i++) {
            System.out.print(i + " ");
        }
    }
}
