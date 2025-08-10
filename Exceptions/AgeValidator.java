public class AgeValidator {
    static void validage(int age){
        if(age<18){
            throw new ArithmeticException("Not valid age");
        }else{
            System.out.println("you are eligible");
        }
    }

    public static void main(String[] args) {
        validage(15);
    }
}
