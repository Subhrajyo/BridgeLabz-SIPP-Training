
import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(n<1){
           System.err.println("please enter a positiove number:");
           return;
        }
        int even[]=new int[n/2+1];
        int odd[]=new int[n/2+1];
        int evenIndex=0, oddIndex=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even[evenIndex++]=i;
            }else{
                odd[oddIndex++]=i;
            }
        }
        System.out.println("Even numbers:");
        for(int i=0;i<evenIndex;i++){
            System.out.print(even[i]+" ");
        }
        System.out.println();
        System.out.println("Odd numbers:");
        for(int i=0;i<oddIndex;i++){
            System.out.print(odd[i]+" ");
        }
    }

}