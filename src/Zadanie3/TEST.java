package Zadanie3;

public class TEST {
    public static void main(String[] args) {

        Gazeciarz gazeciarz = new Gazeciarz();
        Odbiorca odbiorca1 = new Odbiorca("Karol", gazeciarz);
        Odbiorca odbiorca2 = new Odbiorca("Anna", gazeciarz);

        gazeciarz.updateObserver("Politico");

        System.out.println("--------------------");
        gazeciarz.removeObserver(odbiorca2);

        gazeciarz.updateObserver("Newsweek");
    }
}
