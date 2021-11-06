import java.util.Scanner;
 
public class TestGanjilGenap
{
  public static void main(String args[])
  {
    int angka;
    System.out.println("Masukkan sebuah integer:");
 
    //Input dari user disimpan dalam variabel angka
    Scanner input = new Scanner(System.in);
    angka = input.nextInt();
 
    /* Kalau angka bisa dibagi dua maka itu adalah bilangan genap
     * selain dari itu adalah bilangan ganjil*/
    if ( angka % 2 == 0 )
        System.out.println(angka + " adalah bilangan genap");
     else
        System.out.println(angka + " adalah bilangan ganjil");
  }  
}