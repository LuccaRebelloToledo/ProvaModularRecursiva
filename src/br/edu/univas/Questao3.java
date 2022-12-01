package br.edu.univas;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        iniciarParesImpares(scanner);
    }

    public static void iniciarParesImpares(Scanner scanner){
        System.out.println("Por favor digite um número entre 50 e 100 (ambos estão inclusos)");
        int numero = scanner.nextInt();
        if (numero < 50 || numero > 100) {
            iniciarParesImpares(scanner);
        } else {
            parOuImpar(numero);
        }
    }
    public static void parOuImpar(int numero){
        if(numero % 2 == 0){
            imprimiPar(numero);
        } else {
            imprimiImpar(numero);
        }
    }

    public static void imprimiPar(int numero){
        if (numero == 1) {
            return;
        }
        imprimiPar(numero - 1);
        if ((numero % 2) == 0) {
            System.out.println(numero);
        }
    }
    public static void imprimiImpar(int numero){
        if (numero == 0) {
            return;
        }
        imprimiImpar(numero - 1);
        if ((numero % 2) != 0) {
            System.out.println(numero);
        }
    }
}
