import java.util.Scanner;
public class Vote{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age:");
        int [] age = new int[10];
        for (int i = 0; i < 10; i++) {
           age[i] = sc.nextInt(); 
              if (age[i] <= 0) {
                System.out.println("Please enter a valid age.");
                i--; 
              } 
                else if (age[i] < 18 || age[i] > 120) {
                    System.out.println("You are not eligible to vote.");
                } else {
                    System.out.println("You are eligible to vote.");
                }
        }}
    }
