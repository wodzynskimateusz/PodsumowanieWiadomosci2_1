package Zadanie1;

import java.util.Calendar;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj PESEL");
        String pesel = sc.nextLine();

        int rokUrodzenia = 1900 + Integer.parseInt(pesel.substring(0, 2));
        int miesiacUrodzenia = Integer.parseInt(pesel.substring(2, 4));
        int dzienUrodzenia = Integer.parseInt(pesel.substring(4, 6));

        Calendar obecnie = Calendar.getInstance();
        int rokObecnie = obecnie.get(Calendar.YEAR);
        int miesiacObecnie = obecnie.get(Calendar.MONTH) + 1;
        int dzienObecnie = obecnie.get(Calendar.DAY_OF_MONTH);

        int counter = 0;

        // ZLICZAM DNI W PEŁNYCH LATACH
        for (int rok = rokUrodzenia + 1; rok < rokObecnie; rok++) {
            counter += isLeap(rok) ? 366 : 365;
        }

        // TABLICA Z LICZBA DNI W MIESIACU
        int dlugoscMiesiaca[] = {0, 31, 28, 31, 30, 31, 30, 31,
                31, 30, 31, 30, 31};

        // ZLICZAM DNI W ROKU OBECNYM I ROKU URODZENIA
             // rok urodzenia - do końca roku
        for (int miesiac = miesiacUrodzenia + 1; miesiac <= 12; miesiac++) {
            counter += (miesiac == 2 && isLeap(rokUrodzenia)) ?
                    dlugoscMiesiaca[miesiac] + 1 :
                    dlugoscMiesiaca[miesiac];
        }
            // rok obecny - od początku roku
        for (int miesiac = 1; miesiac < miesiacObecnie; miesiac++) {
            counter += (miesiac == 2 && isLeap(rokObecnie)) ?
                    dlugoscMiesiaca[miesiac] + 1 :
                    dlugoscMiesiaca[miesiac];
        }
            // dni w obecnym miesiacu
        counter += dzienObecnie;

            // dni w miesiacu urodzenia
        counter += dlugoscMiesiaca[miesiacUrodzenia] - dzienUrodzenia;

        System.out.println("Jesteś na tym świecie już " + counter + " dni.");
        System.out.println(counter + " modulo 2 to: " + counter%2 + ".");

    }

    public static boolean isLeap(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
}
