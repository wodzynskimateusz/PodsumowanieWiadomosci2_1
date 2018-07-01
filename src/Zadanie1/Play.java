package Zadanie1;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj PESEL");
        String pesel = sc.nextLine();

        try {
            Zad1 zad1 = new Zad1();
            int dni = zad1.oblicz(pesel);

            System.out.println("Jesteś na tym świecie już " + dni + " dni.");
            System.out.println(dni + " modulo 2 to: " + dni % 2 + ".");
        }
        catch (Exception e){
            System.out.println("Wprowadzono niepoprawny PESEL");
        }
    }
}
