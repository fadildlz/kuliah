import java.util.Scanner;

public class BilanganPrimaBaris {
 
 public static void main (String args []){
  
  Scanner input = new Scanner(System.in);
  System.out.println("Silakan masukkan jumlah deret bilangan yang akan diinginkan: ");
  int jumlahBilanganPrima = input.nextInt();
  
  System.out.println("Silakan masukkan jumlah baris yang akan diinginkan: ");
  int baris = input.nextInt();
  
  System.out.println(jumlahBilanganPrima + " bilangan prima pertama adalah: ");
  
  
  int hitung = 0; //menghitung jumlah bilangan prima
  int angka = 2; //angka untuk menguji blangan prima
  
  //Perulangan dilakukan untuk mencari bilangan prima
  while(hitung < jumlahBilanganPrima){
   
   //set boolean prima ke true
   boolean prima = true;
   
   for(int pembagi = 2; pembagi <= angka / 2; pembagi++){
    
    if (angka % pembagi == 0){
     prima = false;//set prima ke false
     break;//keluar dari loop
    }
    
   }
   
   if(prima){
    
    hitung++;
    
    if(hitung % baris == 0){
     System.out.println(angka);

    }
    
    else{
     System.out.print(angka + " ");

    }
   }
   //Cek bila angka adalah bilangan prima
   angka++;
  }

  
 }

}