import java.util.Scanner;
public class Library{
    private String title;
    private String author;
    public void getData(){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the book title: ");
       title=sc.nextLine();   
       System.out.println("enter the book author: ");
       author=sc.nextLine();
    }
    public void putData(){
        System.out.println("Book name: "+title+"Author name: "+author);
    }
}


class Book{
    public static void main(String[] args) {
        Library obj[]=new Library[5];
        int i;
        for(i=0;i<5;i++){
        obj[i]=new Library();
        obj[i]=getData();
        }
        for(i=0;i<5;i++){
            obj[i].putData();
        }
    }
}






