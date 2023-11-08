// import java.util.Scanner;

// class A{
//     int a;
//     int b;
// void input(){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the value of a: ");
//     a=sc.nextInt();
//     System.out.println("Enter the value of b: ");
//     b=sc.nextInt();
//     }
// void add(){
//     System.out.println("The sum of a and b is: "+a+b);
// }
// }
// class B extends A{//now b can use the functions in a
//     int c;
//     void getdata(){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the value: ");
//     c=sc.nextInt();
//     }
//     void display(){
//         System.out.println("Addition is: "+(a+b+c));
//     }
// }
// class C{
//     public static void main(String[] args) {
//         B s1=new B();//object s1
//         s1.input();
//         s1.getdata();
//         s1.display();
//     }
// }





//multilevel inheritance
// import java.util.Scanner;

// class A{
//     int a;
// void input(){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the value of a: ");
//     a=sc.nextInt();
// }
// }
// class B extends A{
//     int b;
// void getdata(){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the value of b: ");
//     b=sc.nextInt();
// }
// }
// class C extends B{
//     int c;
// void getd(){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the value of c: ");
//     c=sc.nextInt();
// }
// void display(){
//     System.out.println("sum is"+(a+b+c));
// }
// }
// class D{
//     public static void main(String[] args) {
//         C s1=new C();//object s1
//         s1.input();
//         s1.getdata();
//         s1.getd();
//         s1.display();
//     }
// }



//heirarchial inheritance
// import java.util.Scanner;
// class A{
//     int a,b;
// void input(){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the value of a: ");
//     a=sc.nextInt();
//     System.out.println("Enter the value of b: ");
//     b=sc.nextInt();
// }
// }
// class B extends A{
//     void display(){
//         System.out.println("sum is "+(a+b));
//         }
// }
// class C extends A{
//     void display2(){
//         System.out.println("product is "+(a*b));
//         }
// }
// class D{
//     public static void main(String[] args) {
//         B s1=new B();
//         C s2=new C();
//         s1.input();
//         s1.display();
//         s2.input();
//         s2.display2();
        
//     }
// }


//If you use the Final keyword before a class it cannot be inherited




//Hybrid inheritance
// import java.util.Scanner;
// class A{
//     int a,b;
// void input(){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the value of a: ");
//     a=sc.nextInt();
//     System.out.println("Enter the value of b: ");
//     b=sc.nextInt();
// }
// }
// class B extends A{
//     int c;
//     void display(){
//         c=a+b;
//         System.out.println("sum is "+(c));
//         }
// }
// class C extends A{
//     void display2(){
//         System.out.println("Difference is "+(a-b));
//         }

// }
// class D extends  B{
//     int d;
//     void display3(){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the value of d: ");
//     d=sc.nextInt();
//     System.out.println("Total sum: "+(c+d));
//     }
// }
// class E{
//     public static void main(String[] args) {
//         B s=new B();
//         D s2=new D();
//         C s3=new C();
//         s2.input();
//         s2.display();
//         s3.input();
//         s3.display2();
//         s2.display3();
        
//     }
// }













































































