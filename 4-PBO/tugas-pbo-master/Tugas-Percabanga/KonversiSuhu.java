// Mengimpor kelas JOptionPane
import javax.swing.JOptionPane;
 
public class KonversiSuhu {
   public static void main(String[] args) {
 
      //deklarasi variabel
      String strFahrenheit;
      double fahrenheit, celcius;
 
      // Menginput data fahrenheit
      strFahrenheit = JOptionPane.showInputDialog(null,
         "Masukkan nilai derajat Fahrenheit",
         "Fahrenheit Ke Celcius", JOptionPane.QUESTION_MESSAGE);
 
      // Konversi string numerik ke numerik
      fahrenheit = Double.parseDouble(strFahrenheit);
 
      // Menghitung Celcius
      celcius = (int)((5.0 / 9) * (fahrenheit - 32) * 100) / 100.0;
 
      // Menampilkan hasil
      JOptionPane.showMessageDialog(null, "Suhu dalam Fahrenheit : " + 
         fahrenheit + "\nHasil konversi ke Celcius : " + celcius,
         "Fahrenheit Ke Celcius", JOptionPane.INFORMATION_MESSAGE);
 
      // Mengakiri program GUI
      System.exit(0);
   }
}