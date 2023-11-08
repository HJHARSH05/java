
// class Student{
//     int rollno;
//     String name;
//     double marks;
//     public void setdata(int x,String y,double z){
//         rollno=x;
//         name=y;
//         marks=z;
//     }
//     public void showdata() {
//         System.out.println("name is: "+ name);
//         System.out.println("roll no is:"+rollno);
//         System.out.println("marks are:"+marks);
        
//     }
//     public static void main(String[] args) {
//         Student s1=new Student();//new returns address of memory allocated
//         s1.setdata(27,"Palak",98);
//         s1.showdata();
//         Student s2=new Student();
//         s2.setdata(12,"Bobby",99);
//         s2.showdata();
//     }

// }

// import java.util.Scanner;

// class Account{
//     int Accno;//member variable or instance variabe
//     String name;
//     int principal;
//     static double roi=10.5;
//     int years;
//     double total;
//     public void setdata(){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter name: ");
//         String n=sc.nextLine();
//     System.out.println("Enter account no: ");
//         int x=sc.nextInt();
//     System.out.println("Enter principal amount: ");
//         int y=sc.nextInt();
//     System.out.println("Enter years: ");
//         int z=sc.nextInt();
    

//         Accno=x;
//         principal=y;
//         years=z;
//         name=n;
//         total=principal+(principal*roi*years)/100;
//     }
//     public void showdata(){
//         System.out.println("Account no  is "+Accno);
//         System.out.println("principal is "+principal);
//         System.out.println("time duration  is "+years);
//         System.out.println("Account holder name  is "+name);
//         System.out.println("Interest is "+total);
//     }

// }
// class bankacc{
//     public static void main(String[] args) {
//     Account a1=new Account();
//     a1.setdata();
//     a1.showdata();
//     }   
// }



//This method
// class oops{
//     int i;
//     void setvalue(int i){
//     this.i=i;// takes input in instance variable
//     }
//     void show(){
//         System.out.println(i);
//     }


//     public static void main(String[] args) {
//         Thismethod t=new Thismethod();
//         t.setvalue(5);
//         t.show();
//     }
// }











