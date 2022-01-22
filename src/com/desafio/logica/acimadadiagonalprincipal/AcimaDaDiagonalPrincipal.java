package com.desafio.logica.acimadadiagonalprincipal;

import java.util.Scanner;

public class AcimaDaDiagonalPrincipal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String operacao = scan.next();
        double[][] matriz = new double[12][12];

        double resultado = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = scan.nextDouble();
            }
        }

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if ((i == 0 && j >= 1)
                        || (i == 1 && j >= 2)
                        || (i == 2 && j >= 3)
                        || (i == 3 && j >= 4)
                        || (i == 4 && j >= 5)
                        || (i == 5 && j >= 6)
                        || (i == 6 && j >= 7)
                        || (i == 7 && j >= 8)
                        || (i == 8 && j >= 9)
                        || (i == 9 && j >= 10)
                        || (i == 10 && j >= 11)) {
                    resultado += matriz[i][j];
                }
            }
        }

        if (operacao.equalsIgnoreCase("M")) {
            resultado /= 66;
        }
        System.out.printf("%.1f", resultado);
    }
}