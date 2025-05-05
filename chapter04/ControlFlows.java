package chapter04;

public class ControlFlows {
    public static void main(String[] args) {
//        int choice = 1;
//        switch (choice) {
//            case 1 ->
//                System.out.println("Hello World");
//            case 2 ->
//                System.out.println("Goodbye World");
//            default ->
//                System.out.println("Hello World");
//        }


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 5) break;
                System.out.println(i + j);
            }
        }
    }
}
