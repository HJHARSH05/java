public class Box{
    int length,breadth,height;
    static int k;
    public void setDimensions(int x,int y,int z){
        length=x;
        breadth=y;
        height=z;
    }
    public void showDimensions(){
        System.out.println("Length= "+length);
        System.out.println("Breath= "+breadth);
        System.out.println("Height= "+height);
        System.out.println("value of k is:"+k);
    }
    static void setk(int p){
        k=p;
    }
}
    class cube{
    public static void main(String[] args) {
        Box a=new Box();
        a.setDimensions(10, 20, 30);
        a.setk(5);
        a.showDimensions();
        Box b=new Box();
        b.setDimensions(20, 30, 40);
        b.showDimensions();
        Box c=new Box();
        c.setDimensions(10, 23, 22);
        c.showDimensions();
        System.out.println(a.length);
    }
}



//Garbage Collector(JVM ka Part)
//1.Mark
//2.Delete
//3.Utilise Space













































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































