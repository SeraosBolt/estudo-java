/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloword;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Diego
 */
public class Vetores {

    public int[] geraNumero(int qtdNumeros, int maxNumber) {
        Random rand = new Random();

        int numsAleatorios[] = new int[qtdNumeros];
        for (int i = 0; i < qtdNumeros; i++) {
            int randInt = rand.nextInt(maxNumber);
            numsAleatorios[i] = randInt;
        }
        return numsAleatorios;
    }
}
