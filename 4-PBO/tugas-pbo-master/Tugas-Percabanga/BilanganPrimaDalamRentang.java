import java.util.Scanner;
public class BilanganPrimaDalamRentang
{
    public static void main(String args[])
    {
         
         Scanner input = new Scanner(System.in);
         System.out.println ("Masukkan angka batas bawah :"); 
         
         int angkaBawah = input.nextInt();
         System.out.println ("Masukkan angka batas atas :"); 
         int angkaAtas = input.nextInt();
         System.out.println ("Bilangan prima antara "+angkaBawah+ " dan " + 
         angkaAtas + " adalah: ");
         
         int flag = 0;
         for(int i = angkaBawah; i <= angkaAtas; i++)
         {
             for( int j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 System.out.println(i);
             }
         }
    }
}