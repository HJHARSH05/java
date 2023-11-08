// import java.util.Scanner;

// class Input {
//     public static void main(String[] args) {

// //Taking input and printing sum in matrix form

         
//        int a[][]=new int[2][2];
//        int b[][]=new int[2][2];
//        int c[][]=new int[2][2];
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the first matrix: ");
//        for(int i=0;i<2;i++){
//         for (int j=0;j<2;j++){
//             a[i][j]=sc.nextInt();
//         }}
//         System.out.println("Enter the second matrix: ");
//        for(int i=0;i<2;i++){
//         for (int j=0;j<2;j++){
//             b[i][j]=sc.nextInt();
//         }
//        }
//        System.out.println("First matrix is: ");
//        for(int i=0;i<2;i++){
//         for (int j=0;j<2;j++){
//          System.out.print(a[i][j]+" ");
//         }
//         System.out.println();}


//        System.out.println("Second matrix is: ");
//        for(int i=0;i<2;i++){
//         for (int j=0;j<2;j++){
//          System.out.print(b[i][j]+" ");
//         }
//         System.out.println();}
        
//         System.out.println("Sum of the matrix is: ");
//        for(int i=0;i<2;i++){
//         for (int j=0;j<2;j++){
//             c[i][j]=a[i][j]+b[i][j];
//             System.out.print(c[i][j]+" ");
//         }
//         System.out.println();
//        }

//        //multiplication of matrix
//         System.out.println("Multiplication of the matrix is: ");
//        for(int i=0;i<2;i++){
//         for (int j=0;j<2;j++){
//             c[i][j]=0;
//             for(int k=0;k<2;k++){
//                 c[i][j]+=a[i][k]*b[k][j];
//             }
//             System.out.print(c[i][j]+" ");
//         }
//         System.out.println();
//        }

       
//     }}
    

//Transpose of the matrix

//  int a[][]=new int[2][2];
//      Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the first matrix: ");
//        for(int i=0;i<2;i++){
//         for (int j=0;j<2;j++){
//             a[i][j]=sc.nextInt();
//         }}
//         System.out.println("Original matrix is: ");
//        for(int i=0;i<2;i++){
//         for (int j=0;j<2;j++){
//          System.out.print(a[i][j]+" ");
//         }
//         System.out.println();}


//  System.out.println("Transpose of the matrix is: ");
//        for(int i=0;i<2;i++){
//         for (int j=0;j<2;j++){
//             System.out.print(a[j][i]+" ");
//         }
//         System.out.println();
//        }

// }}



//taking input and printing factorial


// class Input {
//     public static void main(String[] args) {
//         int fact=1,a;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the values: ");
//         a=sc.nextInt();
//         for(int i=1;i<=a;i++){
//            fact=fact*i;
        
            
//         }
        
//         System.out.println("fact is: "+fact);
//     }
// }



//Reversing the array

// class Input {
//     public static void main(String[] args) {
//     int arr[]={1,21,12,43,56};
//     for(int i=arr.length-1;i>=0;i--){
//         System.out.print(arr[i]+" ");
//     }

//     }}


// By binary sorting

// class Input {
//         public static void main(String[] args) {
//         int arr[]={1,21,12,43,56};
//         int l=arr.length;
//         int n=Math.floorDiv(l,2);
//         int temp;
//         for(int i=0;i<n;i++){
//             temp=arr[i];
//             arr[i]=arr[l-1-i];
//             arr[l-1-i]=temp;
//         }
//     for (int element:arr){
//         System.out.print(element+" ");
//     }
  //      }}





//   class InputArraySort{
//     public static void main(String[] args) {

//       int arr[]={1,21,12,43,56};
//       int max=0;
//       for(int element:arr){
//       if (max<element){
//         max=element;
//       }

//       }
//       System.out.print(max+" ");
//     }
//   }

// class InputArraySort{
//   public static void main(String[] args) {
    
//     int []arr = { 1, 21, 12, 43, 56 ,32 ,43, 82 ,23,0};
//     int i,pos=4;
//     for(i=arr.length-1;i>pos-1;i--){
//           arr[i]=arr[i-1];
//     }
//     arr[pos-1]=100;

//     for(i=0;i<arr.length;i++){
//       System.out.print(arr[i]+" ");
//     }
//     }}



// import java.util.Scanner;

// class InputArraySort{
//        public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int i,n;
//         System.out.print("Enter the number of elements in array: ");
//         n=sc.nextInt();
//         int a[]=new int[n];
//         for(i=0;i<n;i++){
//             System.out.print("Enter element "+(i+1)+":");
//             a[i]=sc.nextInt();
//         }
//         System.out.print("The elements are: ");
//         for(i=0;i<n;i++){
//             System.out.print(a[i]+" ");
//         }
//        }}



// import java.util.Scanner;

// class InputArraySort{
//        public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int i,n;
//         System.out.print("Enter the number of elements in array: ");
//         n=sc.nextInt();
//         int a[]=new int[n+1];
//         for(i=0;i<n;i++){
//             System.out.print("Enter element "+(i+1)+":");
//             a[i]=sc.nextInt();
//         }
//         System.out.print("Enter the position: ");
//         int pos=sc.nextInt();
//         System.out.print("Enter the element: ");
//         int e=sc.nextInt();
//         System.out.print("The original elements are: ");
//         for(i=0;i<n;i++){
//             System.out.print(a[i]+" ");
//         }
//         for(i=n;i>pos-1;i--){
//             a[i]=a[i-1];
//         }
//         System.out.println();
//         System.out.print("After inserting: ");
//         a[pos-1]=e;
//         for(i=0;i<=n;i++){
//             System.out.print(a[i]+" ");
//         }
        
//        }}


// import java.util.Scanner;

// class InputArraySort{
//        public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int i,n;
//         System.out.println("enter no of elements in arry");
//         n=sc.nextInt();
//         int a[]=new int[n+1];
//         for(i=0;i<n;i++){
//             System.out.print("enter element"+(i+1));
//             a[i]=sc.nextInt();
//         }
//         System.out.println("enter the position: ");
//         int pos=sc.nextInt();
//         for(i=pos-1;i<n;i++){
//             a[i]=a[i+1];
//         }
//         for(i=0;i<n-1;i++){
//         System.out.println(a[i]);
//         }
//         }}


import java.util.Scanner;

class InputArraySort{
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("enter no of elements in arry");
        n=sc.nextInt();
        int a[]=new int[n+1];
        for(i=0;i<n;i++){
            System.out.print("enter element"+(i+1));
            a[i]=sc.nextInt();
        
        }
    }
}




      











































































































































































































































