package com.desafio.logica.fasesdalua;

import java.util.Scanner;

public class FasesDaLua {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inicio = scan.nextInt();
        int fim = scan.nextInt();

        if (fim <= 2) System.out.println("nova");
        else if ((fim < 97) && (inicio < fim)) System.out.println("crescente");
        else if ((fim < 97) && (inicio > fim)) System.out.println("minguante");
        else System.out.println("cheia");

//        if (inicio >= 0 && fim <= 2) System.out.println("nova");
//        else if ((inicio >= 2 && fim <= 96) && (inicio < fim)) System.out.println("crescente");
//        else if ((inicio <= 97 && fim >= 3) && (inicio > fim))System.out.println("minguante");
//        else if (inicio >= 96 && fim <= 100) System.out.println("cheia");
    }
}
