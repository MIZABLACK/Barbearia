package folha;

import java.util.Scanner;

public class Planta {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();
        System.out.println(" seu nome completo é: " + nomeCompleto);

        System.out.println(" Digite a sua idade:");
        int idade = scan.nextInt();
        System.out.println(" Sua idade é:"  + idade);

    }
}
