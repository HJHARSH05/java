//Addition

// import java.util.Scanner;

// class Matrix {
   
//     int a[][]=new int[3][3];
//     int b[][]=new int[3][3];
//     int c[][]=new int[3][3];
//     Scanner sc=new Scanner(System.in);
//     void getData(){
//          int i,j;
//         for(i=0;i<3;i++){
//             for(j=0;j<3;j++){
//                 System.out.println("Enter the no: ");
//                 a[i][j]=sc.nextInt();
//             }
//         }
//         for(i=0;i<3;i++){
//             for(j=0;j<3;j++){
//                 System.out.println("Enter the no: ");
//                 b[i][j]=sc.nextInt();
//             }
//         } }
//         void add(){
//             int i,j;
//             for(i=0;i<3;i++){
//             for(j=0;j<3;j++){
//             c[i][j]=a[i][j]+b[i][j];
//             }}
//         }
//         void showDAta(){
//             int i,j;
//             for(i=0;i<3;i++){
//             for(j=0;j<3;j++){
//                 System.out.print(c[i][j]);
//             } System.out.println();
//         }
           
//         }
// public static void main(String[] args) {
//     Matrix aa=new Matrix();
//     aa.getData();
//     aa.add();
//     aa.showDAta();
//    }
// }





//Multiplication
// import java.util.Scanner;
// class multiplee {
//     int a[][]=new int[3][3];
//     int b[][]=new int[3][3];
//     int c[][]=new int[3][3]; 
//     Scanner sc=new Scanner(System.in);
//     void getData(){
//         int i,j;
//         for(i=0;i<3;i++){
//             for(j=0;j<3;j++){
//                 System.out.println("enter the no: ");
//             a[i][j]=sc.nextInt();
//             }

//         }
//                 for(i=0;i<3;i++){
//             for(j=0;j<3;j++){
//                 System.out.println("enter the no: ");
//             b[i][j]=sc.nextInt();
//             }

//         }}
//         void multiply(){
//             int i,j;
//             System.out.println("multiply of two matrix is : ");
//                 for(i=0;i<3;i++){
//             for(j=0;j<3;j++){
//                 c[i][j]=0;
//                 for(int k=0;k<3;k++){
//                 c[i][j]+=a[i][k]*b[k][j];
//             }
//         }}
//     }   
//   void showData(){
//     int i,j;
//     for(i=0;i<3;i++){
//             for(j=0;j<3;j++){
// System.out.print(c[i][j] +" ");
//             }  System.out.println();}       
//   }
    
//         public static void main(String[] args) {
//         multiplee m=new multiplee();
//         m.getData();
//         m.multiply();
//         m.showData();
//         }};