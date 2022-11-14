import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kmUcret = 2.20,  km;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz:");
        km = input.nextInt();

        tutar = (km*kmUcret)+10;
        tutar = (tutar<20) ? 20 : tutar;
        System.out.println(tutar);




    }
}