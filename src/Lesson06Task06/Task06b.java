package Lesson06Task06;

/*6. Write a program that will enter numbers from the keyboard.
    The code for reading numbers from the keyboard must be in the readData method.
    The code inside the readData is wrapped in a try..catch.
    If the user entered some text, instead of entering a number,
    the method should catch the exception and display all previously entered numbers as a result.
    Numbers output from a new line preserving the order of input.*/

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//There are two variants of code depends on the meaning of condition "...code inside the readData is wrapped...": Task06a and Task06b
//Not sure about type of reading numbers: int, double, long... Let it be the long.

public class Task06b {

    public static long readData() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLong();
    }

    public static void main(String[] args) {

        ArrayList<Long> arr = new ArrayList<>();

        while (true) {
            try {
                arr.add(readData());
            } catch (InputMismatchException e) {
                System.out.println("Ilegal unput. All previously entered numbers are:");
                for (int i = 0; i < arr.size(); i++){
                    System.out.println(arr.get(i));
                }
                break;
            }
        }

    }

}
