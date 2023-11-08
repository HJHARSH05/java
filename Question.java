import java.util.Scanner;

//longest word
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a word sentence");
//         String str=sc.nextLine();
//         str+=" ";
//         String word="",lword="";
//         int len=str.length();
//         for(int i=0;i<len;i++){
//             char ch=str.charAt(i);
//             if(ch!=' '){
//                 word+=ch;
//             }else{
//                 if(word.length()>lword.length()){
//                     lword=word;  
//                 }word="";
//             }
//         }System.out.println("longest word is: "+lword);
//     }
// }

//LCM

// public class Question {
//     public static void main(String[] args) {
//         int n1,n2,lcm=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no: ");
//         n1=sc.nextInt();
//         System.out.println("Enter the no: ");
//         n2=sc.nextInt();
//         lcm=n1>n2?n1:n2;
//         while(true){
//             if(lcm%n1==0 && lcm%n2==0){
//                 System.out.println("LCM of "+n1+"&"+n2+"is"+lcm);
//                 break;
//             }lcm++;
//         }
//     }
// }



//Greatest common divisor
// public class Question {
//     public static void main(String[] args) {
//         int n1,n2,gcd=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no: ");
//         n1=sc.nextInt();
//         System.out.println("Enter the no: ");
//         n2=sc.nextInt();
//         for(int i=1;i<=n1;i++){
//             if(n1%i==0 && n2%i==0){
//                 gcd=i;
//             }

//         }System.out.println("GCD is: "+gcd);
//     }}


//NEON number
// public class Question{
//     public static void main(String[] args) {
//         int n1,n2,sum=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no: ");
//         n1=sc.nextInt();
//         n2=n1*n1;
//         while(n2>0){
//             int r=n2%10;
//             sum+=r; 
//             n2/=10;
//         }
//         if (sum==n1){
//             System.out.println(n1+" is neon");
//         }
//         else{
//             System.out.println("not a neon number");
//         }
//     }
// }


//decimal to binary
// public class Question{
//     public static void main(String[] args) {
//         int val=1,binary=0;
//         int n1;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no: ");
//         n1=sc.nextInt();
//         while (n1>0) {
//             int rem=n1%2;
//             binary+=rem*val;
//             val*=10;
//             n1/=2;
//         }System.out.println("Binary is "+binary);
//     }
// }

//decimal to hexa

public class Question {
    public static void main(String[] args) {
        int val=1;
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hex="";
        int n1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n1=sc.nextInt();
        while(n1>0){
            int rem=n1%16;
            hex=hexchars[rem]+hex;
            n1/=16;

        }
        System.out.println(hex);
    }
}


