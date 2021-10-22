class Animal{
    void eat(){System.out.println("animal is eating...");}  
   }  

   class Dogg extends Animal{  
    void eat(){System.out.println("dog is eating...");}  
     
    public static void main(String args[]){  
     Animal a=new Dogg();  
     a.eat();  
    }  
   }  