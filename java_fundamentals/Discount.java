public class Discount{
    public static void main(String[] args) {
      int fee=125000;
      int discountPercentage=10;
      int DiscountAmount=(fee*discountPercentage)/100;
      int finalFee=fee-DiscountAmount;
      System.out.println("The Discount amount  is: " +DiscountAmount);
      System.out.println("The final fee after discount is: " + finalFee);  
    }
}