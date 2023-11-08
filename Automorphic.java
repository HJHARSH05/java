import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        int x=a*a;
        System.out.println(x);
        if(x%100==a || x%10==a){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("Not automorphic");
        }
    }
}
