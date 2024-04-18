package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //local de declaração de variáveis
        Scanner scanner = new Scanner(System.in);
        int menu = 0;


        //seção do layout do menu
        System.out.println("-------------------------------------------------------------------");
        System.out.println("|                      Programa de Resolução                      |");
        System.out.println("|                           de Cálculos                           |");
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        System.out.println("Bem vindo ao programa de resolução de cálculos!");
        System.out.println("Escolha a opção desejada:");
        System.out.println("1 - Conversor de moedas");
        System.out.println("2 - Conversor de medidas");
        System.out.println("3 - Conversor de temperatura");

        //Lê a entrada do teclado do usuário
        System.out.print("Opção: ");
        menu = scanner.nextInt();

        //Execução do menu no nível correto

        switch (menu) {
            case 1:
                System.out.println("Entrou no conversor de moedas");
                break;
            case 2:
                System.out.println("Entrou no conversor de medidas");
                break;
            case 3:
                System.out.println("Entrou no conversor de temperatura");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }


        return;


        //Execução do menu no nível complicado
        //if (menu == 1) {
        // System.out.println("Entrou no conversor de moedas");
        //  } else {
        //     if (menu == 2) {
        //          System.out.println("Entrou no conversor de medidas");
        //      } else {
        //          if (menu == 3) {
        //              System.out.println("Entrou no conversor de temperatura");
        //    }else {
        //      System.out.println("Opção inválida");
        // }
        //      }

        //  }
    }
}
