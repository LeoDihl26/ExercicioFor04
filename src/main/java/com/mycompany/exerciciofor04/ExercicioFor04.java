/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossível".
*/

package com.mycompany.exerciciofor04;

import java.util.Scanner;

public class ExercicioFor04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos pares de números quer:");
        int n = sc.nextInt();
        System.out.println("Digite dois números para dividirem um pelo outro:");
        for (int i = 0; i < n; i++) {
            System.out.println("1º Número:");
            int x = sc.nextInt();
            System.out.println("2º Número:");
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double div = (double) x / y;
                System.out.println("o resultado de " + x + " dividido por " + y +" é: " + div);
            }
        }
        sc.close();
    } 
}
