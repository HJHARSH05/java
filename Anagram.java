import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String x="Harsh joshi";
        String y="sharhojihs";
        String t=x.toUpperCase();
        String s=y.toUpperCase();
        t=t.replace(" ", "");
        s=s.replace(" ", "");
        char w[]=t.toCharArray();
        char u[]=s.toCharArray();
        Arrays.sort(w);
        Arrays.sort(u);
        Boolean ans=Arrays.equals(w,u);
        if(ans==true){
            System.out.println("Strings are Anagram");
        }
        else{
            System.out.println("Not a String");
        }
    }
}
