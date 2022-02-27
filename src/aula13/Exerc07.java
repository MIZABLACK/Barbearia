package aula13;

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Entre com o tamanho do lado do quadrado:");
        double lado = scan.nextDouble();

        // area = lado * lado
        double area = Math.pow(lado, 2);

        System.out.println(" Aarea do quadrado é: " + area);
        System.out.println(" O doblo da area do quadradoé: " + (area * 2));
    }
}
