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
// I've changed my opinion regarding hashCode overriding.
// “HashCode” is not “Id” directly and serves for the purpose of content comparison, but not for finding unique values.
        return first.hashCode() + last.hashCode();
    }

    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));
    }
}