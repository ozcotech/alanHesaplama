import java.util.Scanner;

public class alanHesaplama{

  public static void main(String[] args)  {

    int a, b, c;

    double u, alan;

    Scanner kenar = new Scanner(System.in);

    System.out.println("Birinci Kenarı Giriniz: ");

    a = kenar.nextInt();

    System.out.println("İkinci Kenarı Giriniz: ");

    b = kenar.nextInt();

    System.out.println("Üçüncü Kenarı Giriniz: ");

    c = kenar.nextInt();

    u = (a + b + c) / 2;

    alan = Math.sqrt(u * (u -a) * (u - b) * (u - c));

    System.out.println(" Üçgenin Alanı: " + alan);

    kenar.close();
  }

}