package br.com.dio.entidade;

/**
 * Conta Bancaria - Representa uma entidade conta bancaria com os principais atributos
 *
 * @author Samuel Pereira
 * @version 1.0
 * @since 15/09/23
 *
 */
public class ContaBancaria {
    private int numero;
    private String agencia;
    private String nome;
    private double saldo;

    /**
     * Constructor
     *
     * @param numero int
     * @param agencia String
     * @param nome String
     * @param saldo double
     *
     */
    public ContaBancaria(int numero, String agencia, String nome, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return ("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, " +
                "conta %d e seu saldo de %.2f já está disponível para saque.")
                .formatted(this.nome, this.agencia, this.numero, this.saldo);
    }
}
