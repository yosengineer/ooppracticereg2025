package chapter14;

public class TestLine {
    public static void main(String[] args) {
        Line line1 = new Line(1, 2);
        Line line2 = new Line(1, 3);

        try {
            System.out.println(Line.xIntersect(line1, line2));
        } catch (ParallelException e) {
            System.out.println(e.getMessage());
        }

    }
}
