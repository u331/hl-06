package Lesson06Task02;

/*2. Fix the method with try-catch to get the correct result of division:
public class Main {

    public static void main(String[] args) {
        System.out.println(divideByZero());
    }

    public static int divideByZero() {
        int a = 5;
        int b = 0;
        return a / b;
    }
}*/

public class Main {

    public static void main(String[] args) {
        System.out.println(divideByZero());
    }

    public static int divideByZero() {
        int a = 5;
        int b = 0;

        try{
            return a / b;
        } catch (ArithmeticException e){
            b = 1;
            System.out.println("The value of variable 'b' is changed. Now the variable 'b' = " + b);
        } finally {
            return a / b;
        }
    }
}