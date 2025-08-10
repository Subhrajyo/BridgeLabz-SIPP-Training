public class ExceptionPropagationDemo {

    // method1 throws an ArithmeticException
    static void method1() {
        int result = 10 / 0; // This will throw ArithmeticException
    }

    // method2 calls method1()
    static void method2() {
        method1(); // Exception goes from here to main
    }

    // main handles the exception
    public static void main(String[] args) {
        try {
            method2(); // Exception will propagate to here
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
