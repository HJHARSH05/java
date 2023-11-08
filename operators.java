//import java.util.Scanner;

// class class2{
// public static void main(String args[]){
//     int a=5;
//     int b=a++ + ++a + ++a + a++ - a++ + a--;
//     System.out.println(a);
//     System.out.println(b);
// }
// }


// class operators{
// public static void main(String args[]){
//     int a=10;
//     int b=4;
//     System.out.println("the sum of a and b is"+ (a+b));
//     System.out.println("the diff of a and b is"+ (a-b));
//     System.out.println("the product of a and b is"+ (a*b));
//     System.out.println("the quotient of a and b is"+ (a/b));
//     System.out.println("the remainder of a and b is"+ (a%b));

// }
// }


//comparison operator(<,>,<=,>=,!=,==)
// class class2{
//     public static void main(String args[]){
//         int a=5;
//         int b=10;
//         //boolean c=a<b;
//         System.out.println(a<b);
//     }
//     }
    
//assignment operator
// class class2{
//     public static void main(String args[]){
//         int a=15;
//         a*=3%5-3;
//         System.out.println(a);
//     }
//     }

// Conditional operators(and && or || not !)
// class operators{
//     public static void main(String args[]){
//         int a=15;
//         int b=10;
//         int c=9;
//         System.out.println(a>b && b>c);
//         System.out.println(a>b || b<c);
//         System.out.println(!(a>b && b>c));
//     }
// }

//ifelse
// class operators{
//     public static void main(String args[]){
//         int age=21;
//         if (age>18){
//             System.out.println("yes you can vote");
//         }
//         else{
//             System.out.println("no you cant vote");
//         }
//     }}


// class operators{
//     public static void main(String args[]){
//         int score=20;
//         if (score>=50 && score<100){
//             System.out.println("half century");
//         }
//         else if(score<50){
//             System.out.println("not hc");
//         }
//         else if(score>=100 && score<200){
//             System.out.println("century");
//         }
//         else{
//             System.out.println("game khatam");
//         }
//     }}

// Conditional Operator(?:)
// class operators{
//     public static void main(String args[]){
//         int age=21;
//         System.out.println(age>18?"you can vote":"you cant vote");

//     }
// }


// class ClassJava{
//     public static void main(String args[]){
//     Scanner scan=new Scanner(System.in);//scanner class //scan is object(can chng)//new for creating object//system.in is argument
//     System.out.println("Enter the value: ");
//     int value=scan.nextInt();//calling method nextInt
//     System.out.println("value is"+value);

//     }
// }

// class operators{
//     public static void main(String args[]){
//      int i=1;
//      while (i<=10){
//         System.out.println("2*"+i+"="+2*i);
//         i++;
//      }
//     }
// }

// class operators{
//     public static void main(String args[]){
//      int i=1;
//      do{
//         System.out.println("2*"+i+"="+2*i);
//         i++;
//      }
//      while(i<=5);
//     }
// }

//prime
// class operators{
//     public static void main(String args[]){
//     int i;
//     int a=45;
//     int count=0;
//     for(i=1;i<=a;i++)
//     if(a%i==0){
//         count+=1;
//     }
//         if(count==2){
//             System.out.println("prime");
//         }
//         else{
//             System.out.println("not prime");
//         }
//     }
//}


//Prime number
// class operators{
//     public static void main(String args[]){
//         int i,j;
//         for(i=1;i<=4;i++){
//             for(j=6;j>1;j--){
//                 System.out.print(i+j);
//             }
//             System.out.println();

//         }

//     }}

// class operators{
//     public static void main(String args[]){
//     int i,j;
   
//     for(i=1;i<=100;i++){
//         int count=0;
//         for(j=1;j<=i;j++){
        
    
//     if(i%j==0){
//         count+=1;
//     }
// }
//         if(count==2){
//             System.out.println(i+" Is Prime");
//         }
//         else{
//             System.out.println(i+" Is Not Prime");
//         }
    
//     }
//     }
// }


// class operators{
//     public static void main(String args[]){
//         int i,temp,r,sum;
//         for(i=1;i<=500;i++){
//             sum=0;
//             temp=i;
//         while(temp!=0){
//             r=temp%10;
//             sum=sum+r*r*r;
//             temp=temp/10;
//         }
//         if(i==sum){
//             System.out.println(i);
//         }
//         }
//     }
// }






