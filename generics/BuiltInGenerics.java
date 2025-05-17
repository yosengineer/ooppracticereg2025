package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BuiltInGenerics {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("John");
        people.add("Chris");
        people.add("Jane");

        for (String person : people) {
            System.out.println(person);
        }
    }
}
