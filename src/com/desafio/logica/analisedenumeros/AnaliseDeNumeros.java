package com.desafio.logica.analisedenumeros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnaliseDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somatorioPositivo = 0;
        int somatorioNegativo = 0;
        int somatorioPar = 0;
        int somatorioImpar = 0;

        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) somatorioPar++;
            else somatorioImpar++;

            if(numero < 0) somatorioNegativo++;
            else if (numero > 0) somatorioPositivo++;
        }

        System.out.println(somatorioPar + " par(es)");
        System.out.println(somatorioImpar + " impar(es)");
        System.out.println(somatorioPositivo + " positivo(s)");
        System.out.println(somatorioNegativo + " negativo(s)");
    }
}
