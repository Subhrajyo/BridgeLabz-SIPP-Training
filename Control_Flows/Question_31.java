import java.util.Scanner;
public class Question_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Physics: ");
        int phy = scanner.nextInt();
        System.out.print("Enter the number of Phemistry: ");
        int chem = scanner.nextInt();
        System.out.print("Enter the number of Math: ");
        int math = scanner.nextInt();
        double totalMarks = phy + chem + math;
        double percentage = (totalMarks / 300) * 100;
        if(percentage>=80)
        {
            System.out.println("Grade A");
            System.err.println("level 4 above normal standards");
        }
        else if(percentage>=70)
        {
            System.out.println("Grade B");
            System.err.println("level 3 at normal standards");
        }
        else if(percentage>=60)
        {
            System.out.println("Grade C");
            System.err.println("level 2 below normal standards");
        }
        else if(percentage>=50)
        {
            System.out.println("Grade D");
            System.err.println("level 1 well normal standards");
        }
        else if(percentage>=40)
        {
            System.out.println("Grade E");
            System.err.println("level 0 too below normal standards");
        }
        else
        {
            System.out.println("Grade R");
            System.err.println("Remedial standards");
        }

       
    }
}