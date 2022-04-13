package com.company;
import java.util.Scanner;
/*
System.out.print("Digite o número referente ao dia da semana: ");
Imprima o nome do dia da semana (domingo, segunda-feira, etc.)
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-DOMINGO \n2-SEGUNDA \n3-TERÇA \n4-QUARTA \n5-QUINTA \n6-SEXTA \n7-SÁBADO");
        System.out.print("Escolha o numero de um dia da semana: ");
        int diaDaSemana = scanner.nextInt();
        switch (diaDaSemana) {
            case 1: System.out.println("O dia escolhido foi: Domingo.");
                break;
            case 2: System.out.println("O dia escolhido foi: Segunda");
                break;
            case 3: System.out.println("O dia escolhido foi: Terça");
                break;
            case 4: System.out.println("O dia escolhido foi: Quarta");
                break;
            case 5: System.out.println("O dia escolhido foi: Quinta");
                break;
            case 6: System.out.println("O dia escolhido foi: Sexta");
                break;
            case 7: System.out.println("O dia escolhido foi: Sábado");
                break;
            default:
                System.out.println("Digite um dia válido!");
        }
        scanner.close();
    }
}