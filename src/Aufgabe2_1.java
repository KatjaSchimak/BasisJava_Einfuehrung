import java.util.Scanner;

public class Aufgabe2_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int glueckszahl = 7;

        System.out.println("Bitte gib eine Zahl ein:");
        int zahl = s.nextInt();
        System.out.println("Meine Glueckszahl lautet: " + glueckszahl);
        System.out.println("Deine Zahl lautet: " + zahl);

        if (zahl == glueckszahl) {
            System.out.println("Glueckwunsch, das ist meine Glueckszahl");
        }

        if (zahl > 9&&zahl<100) {
            System.out.println(zahl + " ist zweistellig");
        }

        if (zahl % 10 == 0) {
            System.out.println(zahl + " ist eine runde und eine gerade Zahl");
        }
        else if (zahl % 2 == 0) {
            System.out.println(zahl + " ist eine gerade Zahl");
        }

    }
}