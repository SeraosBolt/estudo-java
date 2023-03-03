/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloword;

/**
 *
 * @author Diego
 */
public class ControleFluxo {

    private static final double TAXA_300 = 0.15;
    private static final double TAXA_500 = 0.25;
    private static final double TAXA_BASICA = 0.1;

    //CONDICIONAIS
    public void hasSaldo(int saque, int saldo) {
        if (saque > saldo) {
            System.out.println("Não existe saldo para esse saque");
        }
    }

    public void hasNome(String nome) {
        if (nome != null && nome.length() == 0) {
            System.out.println("Informe um nome válido");
        }
    }

    public double valorDesconto(double valorTotal) {
        double valorDesconto = 0;
        if (valorTotal <= 300) {
            valorDesconto += valorDesconto * TAXA_300;
        } else if (valorTotal >= 500) {
            valorDesconto += valorDesconto * TAXA_500;
        } else {
            valorDesconto += valorDesconto * TAXA_BASICA;
        }
        return valorDesconto;
    }

    // LOOPS
    public void main(String nome) {
        int i = 0;

        while (i < 2) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        } while (i < 2);

        for (int x = 0; x < 2; x++) {
            System.out.println(x);
        }

        String nomeUsuario = nome;

        switch (nomeUsuario) {
            case "Matheus":
                System.out.println("Melhor do Melhor");
                break;
            case "Ana":
                System.out.println("Coisa Mais Linda");
                break;
            default:
                System.out.println("Nome desconhecido");
        }
    }

    public String retornaDigito() {
        String conta = "00-234-2333";
        int posicao = 0;

        while (posicao < conta.length()) {
            char c = conta.charAt(posicao);

            if (c == '-') {
                break;
            }

            posicao++;
        }

        return conta.substring(0, posicao);
    }
}
