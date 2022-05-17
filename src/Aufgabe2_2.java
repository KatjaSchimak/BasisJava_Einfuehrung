
public class Aufgabe2_2 {
    public static void main(String[] args) {
        int akthour=16;
        int aktminute=10;

        System.out.println("Es ist "+akthour+" : "+aktminute+" Uhr");

        if(akthour==12){
            System.out.println("Du hast Mittagspause! Viel Vergnuegen!");
        }
        else if(akthour>=8&&akthour<16){
            System.out.println("Die aktuelle Stunde liegt in der Arbeitszeit");
        }
        else{
                System.out.println("Feierabend!");
            }







    }
} //Ende
