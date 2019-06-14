package Lesson06Task06;

/*6. Write a program that will enter numbers from the keyboard.
    The code for reading numbers from the keyboard must be in the readData method.
    The code inside the readData is wrapped in a try..catch.
    If the user entered some text, instead of entering a number,
    the method should catch the exception and display all previously entered numbers as a result.
    Numbers output from a new line preserving the order of input.*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

//There are two variants of code depends on the meaning of condition "...code inside the readData is wrapped...": Task06a and Task06b
//Not sure about type of reading numbers: int, double, long... Let it be the long.

public class Task06a {

    public static void readData(){
        //int input = 0;
        //double input = 0;
        long input;
        Scanner scanner = new Scanner(System.in);
        //ArrayList<Integer> arr = new ArrayList<>();
        //ArrayList<Double> arr = new ArrayList<>();
        ArrayList<Long> arr = new ArrayList<>();

        while (true) {
            try {
                //input = scanner.nextInt();
                //input = scanner.nextDouble();
                input = scanner.nextLong();
                arr.add(input);
            } catch (InputMismatchException e) {
                System.out.println("Ilegal unput. All previously entered numbers are:");
                for (int i = 0; i < arr.size(); i++){
                    System.out.println(arr.get(i));
                }
                break;
            }
        }
    }

    public static void main(String[] args) {

        readData();

    }

}
