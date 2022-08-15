import java.util.Scanner;

    public class Main {
    public static void main(String[] args){

        double kilo, boy, vki;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz");
        boy = input.nextDouble();

        System.out.println("Kilonuzu kg cinsinden giriniz ");
        kilo = input.nextDouble();

        vki = kilo / (boy*boy);

        System.out.println("Vücut kitle endeksiniz = " + vki);
    }
}