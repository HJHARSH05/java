//Insertion sort- less iterations so better
/*
class Sorting{
    public static void main(String[] args) {
        int arr[]={5,18,2,36,4};
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
*/


//Selection sort

class Selection{
    public static void main(String[] args) {
        int arr[]={5,15,2,3,4};
        for(int i=0;i<arr.length;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
    
}
}



