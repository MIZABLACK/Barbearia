package aula17;

import java.util.Scanner;

public class Excici01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Ente com a nota");

        double nota = scan.nextDouble();

        if (nota >=0 && nota <=10){
            System.out.println("Você digitou:" + nota );
        } else {
            System.out.println("Nota iválida ,digite novamene.");

        }

    }
}
