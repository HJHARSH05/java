//Constructor 
//Automatically invoke Automatically calls itself
//No return type like void int etc
//Name of function is class name

//Of two types:-
//Default constructor      and        Parametized constructor



//Default constructor

// class Student {
//     int Rollno;
//     String name;
//     Student(){
//         System.out.println("Hey i am a constructor");
//     }
// public static void main(String[] args) {
//     Student S1=new Student();
// }
// }




//Parametized constructor:-

// class Student {
//     int a;
//     int b;
//     int Rollno;
//     String name;
//     Student(int x,int y){
//     a=x;
//     b=y;
//     }
// void display(){
//     System.out.println("Value of a is: "+a+" | Value of b is: "+b);
// }
// public static void main(String[] args) {
//     Student S1=new Student(1,2);
//     Student S2=new Student(5,7);
//     S1.display();
//     S2.display();
// }
// }






//Both constructor in one program????
//:----Yes it is possible to have both constructor in one class 
//but when values are passed to a program it will run the parametied constructor otherwise default constructor will run

// class Student {
//     int a;
//     int b;
//     int Rollno;
//     String name;
//     Student(int x,int y){//parametized
//     a=x;
//     b=y;
//     }
//     Student(){
//     a=0;
//     b=0;
//     }
// void display(){
//     System.out.println("Value of a is: "+a+" | Value of b is: "+b);
// }
// public static void main(String[] args) {
//     Student S1=new Student();//No value is passed so default constructor will run
//     Student S2=new Student(5,7);//Since values are passed parametized constructor will run
//     S1.display();
//     S2.display();
// }
// }


// import java.util.Scanner;

// class Student{
//     int a,b,c;
//     Student(int x,int y){
//     a=x;
//     b=y;
//     }
//     Student(){
//     a=0;
//     b=0;
//     }

// void Total(){
//     System.out.println("Total is: "+a+b);
// }

// public static void main(String[] args) {
//     Student s1=new Student();
//     s1.Total();
// }
// }







//Taking value from user and printing the percentage

// import java.util.Scanner;

// class Student {
//     int Maths;
//     int Chem;
//     int Physics;
//     int English;
//     int Sanskrit;
//     int Total;
//     double Percentage;
    
//     Student(int m,int n,int o,int p,int q){//parametized
//     Maths=m;
//     Chem=n;
//     Physics=o;
//     English=p;
//     Sanskrit=q;
//     } 

// void Calculate(){
//     Total=Maths+Chem+Physics+English+Sanskrit;
//     Percentage=Total/5;
// }
// void display(){
//     System.out.println("Total percentage of the student is:"+ Percentage);
// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter marks in Maths: ");
//     int m=sc.nextInt();
//     System.out.print("Enter marks in Chemistry: ");
//     int n=sc.nextInt();
//     System.out.print("Enter marks in Physics: ");
//     int o=sc.nextInt();
//     System.out.print("Enter marks in English: ");
//     int p=sc.nextInt();
//     System.out.print("Enter marks in Sanskrit: ");
//     int q=sc.nextInt();

    
//     Student S1=new Student(m,n,o,p,q);
//     S1.Calculate();
//     S1.display();
   
// }
// }


