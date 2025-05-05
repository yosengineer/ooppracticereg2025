package chapter14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Trouble {
    public static int average(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array length is zero!");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static void arrayProblem() {
        String[] greek = {"alpha", "beta"};
        System.out.println(greek[2]);
    }

    public static void callMethod() {
        arrayProblem();
    }

    public static void readFromFile(String fileName)
        throws FileNotFoundException, IOException
    {
        FileReader fileReader = new FileReader(fileName);
        int ch = fileReader.read();
    }

    public static void main(String[] args) {
        try {
            int[] array = {};
            int average = average(array);
            System.out.println(average);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


//        callMethod();
    }
}
