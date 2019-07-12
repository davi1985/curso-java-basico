package com.davi.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
        /**
         * Faça um programa que calcule o valor total investido por um
         * colecionador em sua coleção de CDs e o valor médio gasto em cada
         * um deles. O usuário deverá informar a quantidade de CDs e o valor
         * para em cada um.
         */
        Scanner scan = new Scanner(System.in);

        int qtdCds;
        double cdValue;
        double totalCds = 0;
        double media;
        System.out.println("Digite a quantidade de cds adqueridos:");
        qtdCds = scan.nextInt();

        for (int i = 0; i < qtdCds; i++) {
            System.out.println("Digite o valor do "+(i+1)+"º cd:");
            cdValue = scan.nextDouble();
            totalCds += cdValue;
        }
        media = totalCds / qtdCds;
        System.out.println("O colecionador investiu: R$ " + totalCds);
        System.out.println("Media de preço R$ " + media);
        
        scan.close();
    }

}
