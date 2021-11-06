package tugaspbo;
import java.util.Scanner;

public class Ganjil_genap {

    public static void main(String[] args) {
        int angka;

        System.out.println("------------------------------");
        System.out.print("Masukan bilangan : ");
        Scanner scanner = new Scanner(System.in);
        angka = scanner.nextInt();
        System.out.println("-----------------------------");

        if (angka % 2 == 0)
            System.out.println(angka + " adalah bilangan Genap");
        else
            System.out.println(angka + " adalah Bilangan Ganjil ");
    }
}