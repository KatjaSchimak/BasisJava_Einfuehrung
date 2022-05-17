public class Aufgabe1_2 {
    public static void main(String[] args) {
        int a=21;
        int b=5;
        double c=547.1;
        double d=2.74;

        System.out.println("Addition: "+a+"+ " +b +" = "+(a+b));
        System.out.println("Subtraktion: "+a+"- " +b +" = "+(a-b));
        System.out.println("Multiplikation: "+a+"x " +b +" = "+(a*b));
        System.out.println("Division: "+a+"/ " +b +" = "+(a/b));
        System.out.println("Rest nach Division: "+a+" modulo " +b +" = "+(a%b));
        System.out.println();

        System.out.printf("%7.2f + %9.2f = %11.2f \n",c,d,(c+d));
        System.out.printf("%7.2f - %9.2f = %11.2f \n",c,d,(c-d));
        System.out.printf("%7.2f x %9.2f = %11.2f \n",c,d,(c*d));
        System.out.printf("%7.2f / %9.2f = %11.2f \n",c,d,(c/d));
        System.out.printf("%7.2f mod %6.2f = %11.2f \n",c,d,(c%d));



    }
} //ende
