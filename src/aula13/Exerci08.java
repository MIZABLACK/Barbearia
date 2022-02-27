package aula13;

import java.util.Scanner;

public class Exerci08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner( System.in);

        System.out.println(" Entre com o valor/hora");
        double valorhora = scan.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mês  ");
        double horas = scan.nextDouble();

        double salario = valorhora * horas;

        System.out.println(" O salario é de:" + salario);

    }
}
