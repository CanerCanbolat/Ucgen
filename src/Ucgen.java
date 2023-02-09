import java.util.Scanner;
public class Ucgen {
    public static void main (String[] args) {
        double a, b, c,u,cevre,alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Kenarın Uzunluğunu Giriniz : ");
        a = input.nextDouble();
        System.out.print("İkinci Kenarın Uzunluğunu Giriniz : ");
        b = input.nextDouble();
        System.out.print("Üçüncü Kenarın Uzunluğunu Giriniz : ");
        c = input.nextDouble();
        u = (a + b + c)/2 ;
        cevre = 2*u;
        alan = Math.sqrt(u*(u- a)*(u- b)*(u- c));
                System.out.println("Birinci Kenar Uzunluğu = " + a);
        System.out.println("İkinci Kenar Uzunluğu = " + b);
        System.out.println("Üçüncü Kenar Uzunluğu = " + c);
        System.out.println("Dik Üçgenin Alanı = " + alan);
        System.out.println("Dik Üçgenin Çevresi = " + cevre);
        String hip = a>b || a>c ? "Dik Üçgenin Hipotenüsü = " + a : b>c ?  "Dik Üçgenin Hipotenüsü = " + b : "Dik Üçgenin Hipotenüsü = " + c ;
        System.out.print(hip);

    }
}
