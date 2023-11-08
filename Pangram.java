public class Pangram {
    public static void main(String[] args) {
        String a="HE IS A GOOD BOY";
        a=a.replace(" ", "");
        char x[]=a.toCharArray();
        int s=x.length;
        boolean t=true;
        int b[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int i=0;
        while(i!=s){
            int index=x[i]-65;
            b[index]=1;
            i++;
        }
i=0;
while(i!=26){
    if(b[i]==1){
        i++;        
    }
    else{
      t=false;
    }
}
if(t=true){
    System.out.println("panagram");
}
else{
    System.out.println("not a pangram");
}
    }
    
}
