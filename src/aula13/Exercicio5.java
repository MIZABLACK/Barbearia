package aula13;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println(" Entre com quantidade de metros");
        double metros = scan.nextDouble();

        //1m = 100 cm
        double cm = metros * 100;

        System.out.println(metros + " m é igual a" + cm + " cm");

    }
}
