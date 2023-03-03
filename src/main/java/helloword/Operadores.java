/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloword;

/**
 *
 * @author Diego
 */
public class Operadores {

    int tweets = 10 + 1;
    int bancosCriados = 8 - 1;
    double juros = 100 * 0.5F;
    double tarifaPorDia = 0.5 / 30;
    double resto = 11 % 2;
    double preco = 45.9;
    double teste;

    public static int quantidadeAnos;
    public static int horasTrabalhadas;
    public static int valorHora;
    public static int salario;

    public static int Salario(String[] args) {
        quantidadeAnos = 50;
        horasTrabalhadas = 40;
        valorHora = 50;
        salario = 0;
        if (quantidadeAnos
                > 10) {
            salario = 1500 + (valorHora * horasTrabalhadas);
        } else if ((quantidadeAnos > 1) && (quantidadeAnos
                < 3)) {
            salario = 2000 + (valorHora * horasTrabalhadas);
        } else {
            salario = 3000 + (valorHora * horasTrabalhadas);
        }
        return salario;
    }

}
