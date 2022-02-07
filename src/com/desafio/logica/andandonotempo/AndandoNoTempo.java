package com.desafio.logica.andandonotempo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class AndandoNoTempo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b == c || a + c == b || b + c == a || a == b || a == c || b == c)
            System.out.println("S");
        else
            System.out.println("N");

        scanner.close();
    }

}


