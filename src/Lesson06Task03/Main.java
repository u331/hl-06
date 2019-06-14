package Lesson06Task03;

/*3. Finish the program to handle all the possible exceptions:
public class Main {

    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);

        int b = 10 / a;
        int[] c = {1};
        System.out.println(c[1]);

    }

}

    Print the cause of the exception to the console.*/

public class Main {

    public static void main(String[] args) {

        int a = args.length;
        System.out.println(a);
        try {
            int b = 10 / a;
        } catch (ArithmeticException e1){
            System.out.println("Division by zero");
            e1.printStackTrace();
        }
        int[] c = {1};
        try {
            System.out.println(c[1]);
        } catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("Index of a non-existent element of the array");
            e2.printStackTrace();
        }
    }

}

    //Print the cause of the exception to the console.*/