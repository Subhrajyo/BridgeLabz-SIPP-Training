import java.util.Scanner;
public class IIDtoID{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter no of columns:");
        int columns = sc.nextInt();
        if (rows <= 0 || columns <= 0) {
            System.out.println("Please enter positive integers for rows and columns.");
            return;
        }
        int arr1[][]= new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        int arr2[]= new int[rows * columns];
        int index = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr2[index++] = arr1[i][j];
            }
        }
        System.out.println("1D Array:");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }

    }
}