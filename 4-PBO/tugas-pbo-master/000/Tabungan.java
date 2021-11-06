package tugaspbo;
import java.util.Scanner;

public class Tabungan {
    public static void main(String[] args) {
        int saldoAwal;
        int lamaMenabung = 1;
        float bunga;
        int saldoAkhir;

        Scanner scanner = new Scanner(System.in);
        System.out.print("saldo Awal = ");
        saldoAwal = scanner.nextInt();
        System.out.print("bunga (dalam 1 tahun) = ");
        bunga = scanner.nextFloat();
        bunga = (int) ((bunga/100)*saldoAwal);
        saldoAkhir = (int) (saldoAwal + bunga );


        System.out.println("======================");
        System.out.println("Lama Menabung = "+lamaMenabung);
        System.out.println("bunga = "+bunga);
        System.out.println("Saldo Akhir = "+saldoAkhir);
    }
}