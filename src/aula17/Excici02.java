package aula17;

import java.util.Scanner;

public class Excici02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValidas = false;

        do {

            System.out.println(" Entre com o mone do usuário:");
             String nomeUser = scan.next();

            System.out.println("Entre com a senha:");
            String senha = scan.next();

            if (nomeUser.equalsIgnoreCase(senha)) {
                //infoValidas = false;

                System.out.println("Senha igual a usuário, digite novamnete.");
            } else {
                infoValidas = true;
                System.out.println("Senha e usuário válidos.");
            }

        } while(!infoValidas);

    }
}
