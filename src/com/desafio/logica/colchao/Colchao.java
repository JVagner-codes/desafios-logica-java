package com.desafio.logica.colchao;

import java.util.Scanner;

public class Colchao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // dimensões do colchão
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        // dimensões da porta
        int altura = scan.nextInt();
        int largura = scan.nextInt();

        if (((largura >= b || largura >= c)
                || (altura >= b || altura >= c))
                        && (altura >= a || largura >= a)) System.out.println("S");

        else System.out.println("N");
    }
}
