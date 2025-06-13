import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double principle=sc.nextDouble();
        Double rate=sc.nextDouble();    
        Double time=sc.nextDouble();
        Double simpleInterest = (principle * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
        
    }
}