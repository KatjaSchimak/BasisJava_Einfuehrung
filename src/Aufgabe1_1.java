public class Aufgabe1_1 {
    public static void main(String[] args) {
        String vorname = "Katja ";
        String nachname = "Schimak";
        int alter = 35;
        char geschlecht = 'f';
        double noten = 1.5;
        boolean verheiratet = false;
        int geburtstag = 30;
        int geburtsmonat = 9;
        int geburtsjahr = 1986;

        System.out.println("Name: " + vorname + nachname);
        System.out.println("Alter: " + alter);
        System.out.println("Geschlecht: " + geschlecht);
        System.out.println("Verheiratet? " + verheiratet);
        System.out.println("Notendurchschnitt: " + noten);
        System.out.println("Geburtstag: " + geburtstag + ". " + geburtsmonat + ". " + geburtsjahr);
    }
}
