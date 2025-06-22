
import java.util.Scanner;

public class Question_26 {
    public static boolean isColinear(int x1,int x2,int x3,int y1,int y2,int y3){
        return (y3-y1)/(x3-x1) == (y2-y1)/(x2-x1)  ;
    }
    public static  boolean isColinearTriangle(int x1, int x2, int x3, int y1, int y2, int y3) {
        return 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) == 0;
        
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p1, p2, and p3: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int x3 = input.nextInt();
        int y3 = input.nextInt();

        if (isColinear(x1, x2, x3, y1, y2, y3)==isColinearTriangle(x1, x2, x3, y1, y2, y3) ) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
}
}