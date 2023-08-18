package Operações;

import java.io.IOException;
import java.util.Scanner;

public class Calculadora {
    Scanner scanner = new Scanner(System.in);
    private double numA;
    private double numB;


    public void input() {

        System.out.println("Digite um numero: ");
        double num1 = scanner.nextInt();

        System.out.println("Agora digite outro numero: ");
        double num2 = scanner.nextInt();
        this.numA = num1;
        this.numB = num2;


    }

    public double getNumA() {
        return numA;
    }

    public double setNumA(double numA) {
        this.numA = numA;
        return numA;
    }

    public double getNumB() {
        return numB;
    }

    public double setNumB(double numB) {
        this.numB = numB;
        return numB;
    }

    public void sum() {
        double somaTotal = getNumA() + getNumB();
        System.out.println("O resultado final é: " + somaTotal);
        System.out.println("Pressione enter para voltar: ");
        scanner.nextLine();
        scanner.nextLine();
    }

    public void multiplication() {
        double multiplicationTotal = getNumA() * getNumB();
        System.out.println("O resultado final é: " + multiplicationTotal);
        System.out.println("Pressione enter para voltar: ");
        scanner.nextLine();
        scanner.nextLine();
    }

    public void division() {
        double divisionTotal = getNumA() / getNumB();
        System.out.println("O resultado final é: " + divisionTotal);
        System.out.println("Pressione enter para voltar: ");
        scanner.nextLine();
        scanner.nextLine();
    }

    public void subtraction() {
        double subtractionTotal = getNumA() - getNumB();
        System.out.println("O resultado final é: " + subtractionTotal);
        System.out.println("Pressione enter para voltar: ");
        scanner.nextLine();
        scanner.nextLine();
    }

    public void Menu() {
        boolean sair = false;
        try {
            while (!sair) {
                System.out.println("--------CALCULADORA--------");
                System.out.println("Seja bem vindo a calculadora!");
                System.out.println("----- :) ----- :) ----- :) ");
                System.out.println("Pressione enter para começar: ");
                scanner.nextLine();
                input();
                System.out.println("Agora, selecione o cálculo: ");
                System.out.println("1- Somar");
                System.out.println("2- Multiplicar");
                System.out.println("3- Dividir");
                System.out.println("4- Subtrair");
                System.out.println("5- Sair");
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1 -> sum();
                    case 2 -> multiplication();
                    case 3 -> division();
                    case 4 -> subtraction();
                    case 5 -> sair = true;
                }
            }
        } catch (Exception ex) {
            System.out.println("Numero inválido. Pressione enter para voltar: ");
            scanner.nextLine();
            scanner.nextLine();
            Menu();
        }
    }
}

