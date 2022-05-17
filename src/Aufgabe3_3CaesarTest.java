import java.util.Scanner;
import java.util.Random;

public class Aufgabe3_3CaesarTest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random r=new Random();

        System.out.println("Bitte gib den Satz ein den du verschluesseln willst: ");
        String message= s.nextLine();
        int offset=r.nextInt(20);
        System.out.println("Der Schluessel lautet: "+ offset);
        System.out.println("Der Satz lautet: "+message);
        int laenge=message.length();
        System.out.println(laenge);

        char[] charmessage=message.toCharArray();
        for(int i=0;i<message.length();i++){
            System.out.print(charmessage[i]);
        }

















        } //main args
} //ende
