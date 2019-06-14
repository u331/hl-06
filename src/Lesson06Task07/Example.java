package Lesson06Task07;

/*
7. In the Solution class, correct a couple of equals / hashCode methods in accordance with the rules for implementing these methods (check details with your favorite search engine).
        Both the first and last strings should participate in the comparison using the equals method and the hashcode calculation.
public class Example {
    private final String first, last;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));
    }
}
*/
//1) The result should be true;
//2) Do not change the main method;

import java.util.HashSet;
import java.util.Set;

public class Example {
    private final String first, last;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Example e = (Example) o;
        if(this.first == e.first && this.last == e.last){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
//In my opinion, hashCode is a useful feature that allows you to distinguish twin objects,
// does not need to override in this task.
// Overriding deprives the program of some useful functionality.
// But if it is nevertheless necessary, then a override can be done like this:
        return (this.first + this.last).hashCode();
    }

    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));
    }
}