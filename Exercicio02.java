package com.company;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a meta de faturamento anual da empresa para o ano que ja passou: ");
        double metaDeFaturamento = scanner.nextDouble();
        System.out.print("Insira o parâmetro referente ao faturamento real da empresa no ultimo ano: ");
        double faturamentoReal = scanner.nextDouble();
        double mediaSalarial = 1500.0;
        boolean metaAlcancada= faturamentoReal >= metaDeFaturamento;
        double oitentaPorcentoDaMeta = (metaDeFaturamento * 80)/100;
        boolean metaQuaseAlcancada = faturamentoReal < metaDeFaturamento && faturamentoReal >= oitentaPorcentoDaMeta;
        double oitentaPorcentoDoSalario = (mediaSalarial * 80)/ 100;
        if (metaAlcancada) {
            System.out.println("Parabens, a empresa atingiu suas metas. Você ganhou um bonus de " +mediaSalarial+" Reias!!!!");
        } else if (metaQuaseAlcancada) {
            System.out.println("Você receberar um bonus de: "+oitentaPorcentoDoSalario+" Reais.");
        } else {
            System.out.println("Infelizmente, esse ano não tem bônus.");
        }
        scanner.close();
    }
}