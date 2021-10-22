package tugaspbo;

import java.util.Scanner;

public class Bilangan_Prima {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka = ");
        int angka = scanner.nextInt();
        System.out.println("==========================");

        int bil;
        boolean prima = true;
        for (int pembagi =2; pembagi <= angka/2; pembagi++){
            bil = angka % pembagi;
            if (bil == 0){
                prima = false;
                break;
            }
        }
        //jika bil prima adalah true dan angka yg diberikan bukan 0 dan 1/
        if (prima && ((angka > 0) && (angka != 1)))
            System.out.println(angka +" adalah bilangan prima");
        else
            System.out.println(angka+ " Bukan bilangan prima");
    }
}