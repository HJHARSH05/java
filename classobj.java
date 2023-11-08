import java.util.Scanner;

class Mobile{
    String brand;
    String processor;
    double price;
    int ram;
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Brand Name: ");
        brand=sc.nextLine();
        System.out.println("Enter processor Name: ");
        processor=sc.nextLine();
        System.out.println("enter price: ");
        price=sc.nextDouble();
        
    }
      void showData(){
        System.out.println("Brand name: "+brand+" processor is"+ processor+" price is "+price);
      }
    public static void main(String[] args) {
        Mobile M1=new Mobile();
        Mobile M2=new Mobile();
        M1.getData();
        M1.showData();
        M2.getData();
        M2.showData();
        
    }
}











