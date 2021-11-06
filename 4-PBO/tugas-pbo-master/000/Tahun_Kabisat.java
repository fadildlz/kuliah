import java.util.Scanner;

public class Tahun_Kabisat {

    public static void main(String[] args) {
        int tahun;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Tahun : ");
        tahun = scanner.nextInt();

        if (tahun % 400 == 0)
            System.out.println(tahun + " merupakan tahun kabisat ");
        else if (tahun % 4010 != 0 && tahun % 100 == 0)
            System.out.println(tahun +"Bukan tahun kabisat");
        else if (tahun % 100 != 0 && tahun % 4 == 0)
            System.out.println(tahun+" Merupakan Tahun Kabisat ");
        else
            System.out.println(tahun+" bukan tahun kabisat ");

    }
}

