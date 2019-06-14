package Lesson06Task01;

//1. Create method to check: if number < 0 print “Number < 0”, if number > 0 print “Number > 0” if number = 0 throw your own exception

class MyException extends Exception {

}

public class Task01 {

    public void method(int number) throws MyException{

        if ( number < 0) {
            System.out.println("Number < 0");
        } else if (number > 0) {
            System.out.println("Number > 0");
        } else {
            throw new MyException();
        }

    }

    public static void main(String[] args) {

        Task01 obj = new Task01();
        try {
            obj.method(0);
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

}