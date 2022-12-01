package br.edu.univas;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        iniciarContador(scanner);
    }
    public static void iniciarContador(Scanner scanner){
        System.out.println("Por favor digite um número entre 50 e 100 (ambos estão inclusos)");
        int numero = scanner.nextInt();
        if(numero < 50 || numero > 100) {
            iniciarContador(scanner);
        } else {
            long somaTotal = retornaSoma(numero);
            System.out.println(somaTotal);
        }
    }
    public static long retornaSoma(int n){
            if(n == 0)
                return 0;
            else
                return n + retornaSoma(n - 1);
    }
}
