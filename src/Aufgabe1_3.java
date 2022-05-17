public class Aufgabe1_3 {
    public static void main(String[] args) {

        String satz=" Hello World ";

        System.out.println("Satz 1: " +satz);
         int laenge=satz.length();
        System.out.println(laenge);
        System.out.println(satz.toUpperCase());
        System.out.println(satz.toLowerCase());

        String satz2=" Hallo Welt";
        boolean vergleich=satz.equals(satz2);
        System.out.println("Satz 2: "+ satz2);
        System.out.println("Satz 1 und 2 sind gleich: "+vergleich);
        System.out.println("Satz 1 enthaelt das Wort Code: "+satz.contains("Code"));
        System.out.println("Satz 1 enthaelt das Wort Hello: "+satz.contains("Hello"));
        System.out.println("Satz ohne Leerzeichen: "+satz.trim());

        String satzNeu=satz.replace("World", "Codersbay");
        System.out.println("Neuer Satz: "+satzNeu);
        System.out.println("Neuer Satz enthaelt das Wort Code: "+satzNeu.contains("Code"));

        for(int i=0;i<15;i++){
            System.out.println(satz);
        }


    }
}
