
//there is a need to break out from both the loop when sum of i and j is greater than 8
// public class class3 {
//     public static void main(String args[]){
//         int i,j;
//         first:for(i=1;i<10;i++){
//             for(j=1;j<=5;j++){
//                 if(i+j>8){
//                     break first;
//                 }
//                 System.out.println(i+j);
//             }
//         }
// }
// }


// public class class3 {
//     public static void main(String args[]){
//         int i,j;
//         for(i=1;i<=5;i++){
//             for(j=1;j<=5;j++){
//                 if(j>i){
//                     System.out.print("* ");
//                     continue;
//                 }
                
//             }
//             System.out.println();
//         }
// }
// }

//for each loop
// class class3 {
//     public static void main(String args[]){
//         int arr[]={5,6,7,8,9};
//         for (int i : arr) {
//             System.out.println("value is"+i);
            
//         } 
//     }
// }

//switch case
// class datatypes{
//     public static void main(String [] args) {
    //     //int w=9;
    //     //String w="rahul";
    //     switch(w){
    //         case "rahul":System.out.println("Monday");break;
    //         case 2:System.out.println("Tuesday");break;
    //         case 3:System.out.println("Wednesday");break;
    //         case 4:System.out.println("Thursday");break;
    //         case 5:System.out.println("Friday");break;
    //         case 6:System.out.println("Saturday");break;
    //         case 7:System.out.println("Sunday");break;
    //         default:System.out.println("please enter a valid day");
    //     }
       
    // }}


// class datatypes{
//     public static void main(String [] args) {
//         char ch='v';
//         int b=ch;
//         System.out.println(b);
//     }}


// class datatypes{
//     public static void main(String [] args) {
//         char ch= 'v';
//         char a,e,i,o,u;
//         if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
//             System.out.println("its a vowel");
//         }
//         else{
//             System.out.println("its consonent");
//         }
//     }
// }

// class datatypes{
//     public static void main(String [] args) {
//         int year=2000;
//         if(year%4==0 && year%100!=0 || year%400==0){
//             System.out.println("its a leap year");
//         }
//         else{
//             System.out.println("not a leap year");
//         }
//     }}

// class class3{
//     public static void main(String [] args) {
//         double CI,P=1000,r=1,t=2;
//         CI=P*(Math.pow((1+r),t));
//         System.out.println(CI);
//     }}

class class3{
    public static void main(String [] args) {
        double a=5,b=8,c=1;
        //roots 
        double r1,r2;
        //determinant
        double d=b*b-4*a*c;
        double s=Math.sqrt(d);
        //1
        if(d<0){
            r1= (Double)(-b + s)/(2*a);
            r2= (Double)(-b - s)/(2*a);
            System.out.println(r1+" "+r2);
        }
        else if(d==0){
            r1=r2= -b/(2*a);
            System.out.println(r1+" "+r2);
        }
        else if(d>0){
            r1= (-b + Math.sqrt(d))/(2*a);
            r2= (-b - Math.sqrt(d))/(2*a);
            System.out.println(r1+" "+r2);
        }
    }}



















