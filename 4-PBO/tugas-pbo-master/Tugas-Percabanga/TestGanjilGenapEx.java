import java.util.InputMismatchException;
import java.util.Scanner;
 
public class TestGanjilGenapEx
{
  public static void main(String args[])
  {
    int angka;
    //boolean validInput = false;
    System.out.println("Masukkan sebuah integer:");
    
    Scanner input = new Scanner(System.in);
    
    while(true){

        try{
        angka = input.nextInt();
        break;

        }
        catch(InputMismatchException ex){
            System.out.println("Anda tidak memasukkan integer, coba lagi: ");
            input.nextLine();
        }
    
    }
    cekGanjilGenap(angka); 
  }  
  
  public static void cekGanjilGenap(int angka){
      if ( angka % 2 == 0 ) System.out.println(angka + " adalah bilangan genap"); 
      else System.out.println(angka + " adalah bilangan ganjil");
  }
}