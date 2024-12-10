package opdrachten;

import java.util.ArrayList;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<String> Students = new ArrayList<String>();
        Students.add("Amy");
        Students.add("Bob");
        Students.add("Cindy");
        Students.add("David");
        System.out.println(Students.get(0));
        System.out.println(Students.get(1));
        System.out.println(Students.get(2));
        System.out.println(Students.get(3));
        System.out.println(Students.size());
    }
    
}
