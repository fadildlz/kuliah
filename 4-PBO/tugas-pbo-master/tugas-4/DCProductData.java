import java.util.Scanner;
class Categories implements Cloneable{
   private long categoriesId;
   private String categoriesName;
   private String categoriesInfo;
   public void setCategoriesId(long categoriesId) {
      this.categoriesId = categoriesId;
   }
   public void setCategoriesName(String categoriesName) {
      this.categoriesName = categoriesName;
   }
   public void setCategoriesInfo(String categoriesInfo) {
      this.categoriesInfo = categoriesInfo;
   }
   Categories(long categoriesId, String categoriesName, String categoriesInfo ){
      this.categoriesId = categoriesId;
      this.categoriesName = categoriesName;
      this.categoriesInfo = categoriesInfo;
   }
   public void displayCategories() {
      System.out.println("Phone no: "+this.categoriesId);
      System.out.println("Email: "+this.categoriesName);
      System.out.println("Address: "+this.categoriesInfo);
   }
   protected Object clone() throws CloneNotSupportedException{
      return super.clone();
   }
}
public class DCProductData implements Cloneable {
   private String productName;
   private int weight;
   private Categories categories;
   public DCProductData(String productName, int weight, Categories categories){
      this.productName = productName;
      this.weight = weight;
      this.categories = categories;
   }
   public void displayData(){
      System.out.println("Name : "+this.productName);
      System.out.println("Age : "+this.weight);
      categories.displayCategories();
   }
   protected Object clone() throws CloneNotSupportedException{
    DCProductData student = (DCProductData) super.clone();
      student.categories = (Categories) categories.clone();
      return student;
   }
   public static void main(String[] args) throws CloneNotSupportedException {
      Scanner sc =new Scanner(System.in);
      System.out.println("Masukan Nama Produk ");
      String name = sc.next();
      System.out.println("Masukan Berat Produk ");
      int weight = sc.nextInt();
      System.out.println("#############Detail Produk#############");
      System.out.println("Masukan Id Kategori: ");
      long categoriesId = sc.nextLong();
      System.out.println("Masukan Nama Kategori: ");
      String categoriesName = sc.next();
      System.out.println("Masukan Info Kategori: ");
      String categoriesInfo = sc.next();
      System.out.println(" ");
      //membuat object class
      DCProductData std = new DCProductData(categoriesName, weight, new Categories(categoriesId, categoriesName, categoriesInfo));
      //membuat clone dari object
      DCProductData copiedStd = (DCProductData) std.clone();
      //memodifikasi data object
      copiedStd.categories.setCategoriesId(000000000);
      copiedStd.categories.setCategoriesName("XXXXXXXXXX");
      copiedStd.categories.setCategoriesInfo("XXXXXXXXXX");
      System.out.println("Hasil cloning dengan deepcopy::");
      copiedStd.displayData();
      System.out.println(" ");
      System.out.println("object original::");
      std.displayData();
   }
}