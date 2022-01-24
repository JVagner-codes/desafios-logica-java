package com.desafio.logica.batalhadedigitrons;

import java.util.Scanner;

public class BatalhaDeDigitrons {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int bonus, ataqueB, defesaB, levelB, ataqueG, defesaG, levelG;
        for (int i = 0; i < t; i++) {
            bonus = scan.nextInt();
            ataqueB = scan.nextInt();
            defesaB = scan.nextInt();
            levelB = scan.nextInt();
            ataqueG = scan.nextInt();
            defesaG = scan.nextInt();
            levelG = scan.nextInt();

            int valorGB = ((ataqueB + defesaB) / 2) + (levelB % 2 == 0 ? bonus : 0);
            int valorGG = ((ataqueG + defesaG) / 2) + (levelG % 2 == 0 ? bonus : 0);

            if (valorGB > valorGG) System.out.println("Bruno");
            else if (valorGG > valorGB) System.out.println("Guarte");
            else System.out.println("Empate");
        }

    }
}
