import java.util.Scanner;
public class Question_01 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      Question_01 obj = new Question_01();
        System.out.println("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.println("Enter the day (1-31): ");
        int day = sc.nextInt();
       obj. SpringSeason(month, day);


    }

   
    public void SpringSeason(int month,int day) {
        if ((month == 3 && day >= 20 && day<=31) || (month == 4 && day<=1 && day<=30) || (month == 5 && day>=1 && day<=31) || (month == 6 && day>=1 &&day < 21)) {
            System.out.println("Spring");
        } else {
            System.out.println("Not Spring");
        }
        
    }
}