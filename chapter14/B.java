package chapter14;

import java.io.IOException;
import java.sql.SQLException;

public class B extends A {
    @Override
    public void printMethod() throws IOException {
        System.out.println("New Print!");
    }
}
