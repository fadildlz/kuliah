import java.util.Scanner;
class Categories{
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
      System.out.println("Id Categories: "+this.categoriesId);
      System.out.println("Name: "+this.categoriesName);
      System.out.println("Info: "+this.categoriesInfo);
   }
}
public class SCProductData implements Cloneable {
   private String productName;
   private int Weight;
   private Categories categories;
   public SCProductData(String productName, int Weight, Categories categories){
      this.productName = productName;
      this.Weight = Weight;
      this.categories = categories;
   }
   public void displayData(){
      System.out.println("Name : "+this.productName);
      System.out.println("Age : "+this.Weight);
      categories.displayCategories();
   }
   public static void main(String[] args) throws CloneNotSupportedException {
      Scanner sc =new Scanner(System.in);
      System.out.println("Masukan Nama Produk ");
      String productName = sc.next();
      System.out.println("Masukan Berat Produk ");
      int Weight = sc.nextInt();
      System.out.println("#############Detail Produk#############");
      System.out.println("Masukan Id Kategori: ");
      long categoriesId = sc.nextLong();
      System.out.println("Masukan Nama Kategori: ");
      String categoriesName = sc.next();
      System.out.println("Masukan Info Kategori: ");
      String categoriesInfo = sc.next();
      System.out.println(" ");

      SCProductData std = new SCProductData(productName, Weight, new Categories(categoriesId, categoriesName, categoriesInfo));

      SCProductData copiedStd = (SCProductData) std.clone();

      copiedStd.categories.setCategoriesId(000000000);
      copiedStd.categories.setCategoriesName("XXXXXXXXXX");
      copiedStd.categories.setCategoriesInfo("XXXXXXXXXX");
      System.out.println("Hasil cloning dengan shallowcopy::");
      copiedStd.displayData();
      System.out.println(" ");
      System.out.println("object original::");
      std.displayData();
   }
}