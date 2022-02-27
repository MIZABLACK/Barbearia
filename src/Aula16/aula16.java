package Aula16;

public class aula16 {

    public static void main(String[] args){

        int i = 1;
        int max = 10;

        System.out.println("Contsndo até " + max);

        while ( i<= max){
            System.out.println("Valor de i:" + i);

            i++; // i = i + i; ou i += 1;

        }
        System.out.println(i); // valor 11
        do {
            i++;
            System.out.println("valor de i :" + i);
        } while (i < 13);
        System.out.println(i);

    }
}