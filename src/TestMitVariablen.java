public class TestMitVariablen {
    public static void main(String[] args) {

        int a=5;
        int b=a;

        int[]arr1={0,1,2,3};
        int [] arr2=arr1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(arr2[0]);
        System.out.println(arr1[0]);
        arr2[0]=5;
        System.out.println(arr2[0]); //wird zu 5
        System.out.println(arr1[0]); //wird auch 5 weil Wert am Speicherplatz geändert wurde
        b=9;
        System.out.println(a); //bleibt 5
        System.out.println(b); //wird 9






    } //args
} //ende
