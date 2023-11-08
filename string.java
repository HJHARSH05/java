import java.util.Scanner;

// public class string{
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the name: ");
//     String name=sc.nextLine();
    // System.out.println(name.length());
//     System.out.println(name.toUpperCase());
//     System.out.println(name.toLowerCase());
//     System.out.println(name.trim());
//     System.out.println(name); 
//      System.out.println(name.substring(4,10));
    // System.out.println(name.replace("P","B"));
    // System.out.println(name.endsWith("shi"));
    // System.out.println(name.startsWith("Pal"));
    // System.out.println(name.indexOf("a"));
    // System.out.println("Trimmed: "+name.trim()); 

         
//     for(int i=0;i<name.length();i++){
//         System.out.println("At index "+i +" "+name.charAt(i));
//     }
    
//     }
// }

// class string{
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the name: ");
//     String name=sc.nextLine();
//     String a=name.toUpperCase();
//     int vc=0,c=0;
//     for(int i=0;i<name.length();i++){
//     if ( a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I' || a.charAt(i)=='O' || a.charAt(i)=='U'){
//             vc+=1;

//     }

// }System.out.println(vc);
// }
// }



// public class string{
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the name: ");
//     String name=sc.nextLine();
//     String rev="";
//     for(int i=name.length()-1;i>=0;i--){
//         rev=rev+name.charAt(i);
//     }
//     System.out.println(rev);
//     if(name.equals(rev)){
//         System.out.println("String is palindrome");
//     }
//     else{
//         System.out.println("its not a palindrome");
//     }
//     }
// }



// public class string{
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the name: ");
//     String name=sc.nextLine();
//     System.out.println(name.replace(" ","_"));
//     }
// }

// public class string{
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the name: ");
//     String name=sc.nextLine();
//     for(int i=0;i<name.length();i++){
//         char ch=name.charAt(i);
//         if(Character.isUpperCase(ch)){
//             System.out.print(Character.toLowerCase(ch));
//         }
//         else{
//             System.out.print(Character.toUpperCase(ch));
//         }
        
//     }
    
// }}



// public class string{
//     public static void main(String[] args) {
//     int ac=0;
//     int dc=0;
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the string: ");
//     String name=sc.nextLine();
//     for(int i=0;i<name.length();i++){
//         char ch=name.charAt(i);
//         if(Character.isAlphabetic(ch)){
//          ac+=1;
//         }
//         else if(Character.isDigit(ch)){
//          dc+=1;
//         }
        
//     }
   
//     System.out.println("Digit count: "+dc);
//     System.out.println("Alphabet count: "+ac);
//     int a=ac+dc;
    
//     System.out.println("The digit percentage: "+(((float)dc/a)*100));
//         System.out.println("The alphabet percentage: "+(((float)ac/a)*100));

//     }
// }




// class string{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the character:");
//         char a=sc.next().charAt(0);
//         System.out.println((int)a);
//     }
// }


// class string{
//     public static void main(String[] args) {
//         int ac=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the string: ");
//         String name=sc.nextLine();
//         for(int i=0;i<name.length();i++){
//         char ch=name.charAt(i);
//         if(Character.isAlphabetic(ch)){
//          ac+=1;
//         }
//     }
//     System.out.println("alphabet count is: "+ac);
// }
// }



// class string{
//     public static void main(String[] args) {
//         int i,word=1;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the string: ");
//         String name=sc.nextLine();
//         for(i=0;i<name.length();i++){
//             if(name.charAt(i)==' '&& name.charAt(i+1)!=' '){
//                 word++;
//             }
//         }
//         System.out.println("Total words: "+word);
//     }}



// import java.util.Scanner;

// class NameShort {
//     public static void main(String args[]) {
//         String A;
//         int num = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Name: ");
//         A = sc.nextLine();
//         char arr[] = new char[A.length()];
//         for (int i = 0; i < A.length(); i++) {
//             arr[i] = Character.toUpperCase(A.charAt(i));
//         }
//         System.out.print(arr[0] + ".");
//         for (int i = 0; i < A.length(); i++) {
//             if (arr[i] == 32 && arr[i] == arr[i + 1]) {
//                 num = i + 1;
//             } else {
//                 continue;
//             }
//             System.out.print(arr[num] + ".");
//         }
//     }
// }

// import java.util.Scanner;

// class string {
//     public static void main(String args[]) {
//         String str;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Name: ");
//         str = sc.nextLine();
//         int i, j;
//         char c, d;
//         i = str.length() - 1;
//         while (str.charAt(i) != ' ') {
//             i--;
//         }
//         j = 0;
//         while (j < i) {
//             if (j == 0) {
//                 System.out.print(str.charAt(j) + ".");
//             } else {
//                 c = str.charAt(j);
//                 d = str.charAt(j + 1);
//                 if (c == ' ' && d != ' ') {
//                     System.out.print(d + ".");
//                 }
//             }
//             j++;
//         }
//         System.out.print(str.substring(i));
//     }
// }




//revstring

// import java.util.Scanner;

// public class Revstr {
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     String str=new String();
//     System.out.println("Enter the string: ");
//     str=sc.nextLine();
//     int i,j,k;
//     i=str.length()-1;

//     while(i>=0){
//         j=i;
//      while(str.charAt(j)!=' ' && j>0){
//         j--;
//      }
//         if(j==0){
//             k=0;
//         }else{
//             k=j+1;
//         }
//         System.out.println(str.substring(k,i+1));
//         i=j-1;
//     }
//     }
// }
