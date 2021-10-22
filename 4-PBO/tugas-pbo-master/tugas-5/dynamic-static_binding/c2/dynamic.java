class Computer {
  void identify() {
  System.out.println("This is Computer");
  }
  }
  class Desktop extends Computer {
  void identify (){
  System.out.println("This is Desktop");
  }
  }
  class Laptop extends Desktop {
  void identify (){
  System.out.println("This is Laptop");
  }
  }
  class DynamicBinding {
  public static void main(String args[]){
  Computer superObject=new Computer ();
  Computer subObject=new Desktop (); // // upcasting : first level of heritance
  Computer babyObject=new Laptop (); // // upcasting : second level of heritance
  superObject.identify ();
  subObject.identify (); //run time polymorphism happening in first level of heritance
  babyObject.identify (); //run time polymorphism happening in second level of heritance
  }
  }