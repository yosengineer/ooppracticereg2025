package chapter13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BetterTyping {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John Doe");
        names.add("Chris CS");

        names = new LinkedList<>();
    }
}
