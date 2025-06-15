

public class Profitpercentage{
    public static void main(String[] args) {
        int cost_price=129;
        int selling_price=191;
        int profit = selling_price - cost_price;
        double profit_percentage=((double)profit/cost_price)*100;
        System.out.printf("cost price is INR %d\n ",cost_price);
        System.out.println("selling price is INR "+selling_price);
        System.out.println("profit is INR "+profit);
        System.out.printf("profit percentage is %.2f%%\n", profit_percentage);
    }
}