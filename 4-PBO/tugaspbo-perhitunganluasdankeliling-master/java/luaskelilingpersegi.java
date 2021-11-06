import java.util.Scanner;
public class luaskelilingpersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Sisi :");

        int sisi = input.nextInt();

        int luaspersegi = sisi * sisi;

        int kelilingpersegi = 4 * sisi;

        System.out.println("Luas :" + luaspersegi);
        System.out.println("keliling :" + kelilingpersegi);

    }
}