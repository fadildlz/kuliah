
import java.util.Scanner;

public class HitungUang {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  String lagi;
  do {
  Scanner input = new Scanner(System.in);
  System.out.print("Masukan Jumlah Uang : ");
  double JumlahUang = input.nextDouble();

  int hitung = (int)(JumlahUang/10000);
  int sisa = (int)(JumlahUang%10000);

  int hitung2 = sisa/5000;
  int sisa2 = (int)(JumlahUang%5000);

  int hitung3 = sisa2/1000;
  int sisa3 = (int)(JumlahUang%1000);
  if(sisa3 != 0) {
   System.out.println("Jumlah uang harus kelipatan 1000");

   System.out.println();

   
  } else {  
   System.out.println();
   System.out.println("Jumlah uang 10.000 sebanyak "+hitung);
   System.out.println("Jumlah uang 5.000 sebanyak "+hitung2);
   System.out.println("Jumlah uang 1.000 sebanyak "+hitung3);
  }
  
  do {
  
   System.out.print("Apakah menghitumg lagi(Y/T)?");
   lagi = scanner.nextLine();
   
    }while (!lagi.equalsIgnoreCase("Y") && !lagi.equalsIgnoreCase("T"));
  }while (lagi.equalsIgnoreCase("Y"));
 }
}

