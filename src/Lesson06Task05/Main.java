package Lesson06Task05;

/*5. Throw a NullPointerException from the method iCanThrowException();
        Handle it in the main method.
public class Main {

    public static void main(String[] args) {
        iCanThrowException();
    }

    public static void iCanThrowException() {

    }

}*/

public class Main {

    public static void main(String[] args) {
        try {
            iCanThrowException();
        } catch (NullPointerException e){
            System.out.println("I can catch the exceptions");
        }
    }

    public static void iCanThrowException() throws NullPointerException{
        System.out.println("before");
        throw new NullPointerException();
        //System.out.println("after");
    }

}
