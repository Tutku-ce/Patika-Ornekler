import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;

        Scanner girdi = new Scanner(System.in);
        System.out.print("a değerini giriniz:");
        a = girdi.nextInt();
        System.out.print("b değerini giriniz:");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs değeri:" + c );
    }
}