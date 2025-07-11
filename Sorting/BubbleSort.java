import java.util.*;
public class BubbleSort {
    public static void bubbblesort(int []arr){
        int n=arr.length;
        boolean swaaped;
       for(int i=0;i<n-1;i++){
            swaaped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaaped=true;
                }
            }
            if(!swaaped)break;


       }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter student roll no:-");
         int n=sc.nextInt();
         int []arr=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         bubbblesort(arr);
         for(int x:arr){
             System.out.print(x+" ");
         }

    }
}
