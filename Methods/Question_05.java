import java.util.Scanner;
public class Question_05{
    public double calculateWindChill(double temperature, double windSpeed)
{
    double windChill = 35.74 + 0.6215 * temperature  + (0.4275 * temperature -37.5)* Math.pow(windSpeed, 0.16);
    return windChill;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();
        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = sc.nextDouble();
        Question_05 q5 = new Question_05();
        double windChill = q5.calculateWindChill(temperature, windSpeed);
        System.out.printf("The wind chill index is: %.2f\n", windChill);
    }
}