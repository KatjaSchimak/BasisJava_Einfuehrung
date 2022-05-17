import java.util.Scanner;
//Noten übersetzen

public class Aufgabe2_3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Gib deine Note ein: ");
        int note= s.nextInt();

        switch(note){
            case 1:
                System.out.println("Note: Sehr Gut");break;
            case 2:
                System.out.println("Note: Gut");break;
            case 3:
                System.out.println("Befriedigend");break;
            case 4:
                System.out.println("Note: Genuegend");
            case 5:
                System.out.println("Note: Nicht Genuegend");break;

            default:
                System.out.println("Das ist keine gueltige Note! Bitte besuche noch einmal die Volkschule");
        }


    }
}
