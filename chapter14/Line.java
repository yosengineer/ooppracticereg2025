package chapter14;

public class Line {
    private int slope;
    private int yIntercept;

    public Line(int slope, int yIntercept) {
        this.slope = slope;
        this.yIntercept = yIntercept;
    }

    public int getSlope() {
        return slope;
    }

    public int getYIntercept() {
        return yIntercept;
    }

    public static int xIntersect(Line line1, Line line2) throws ParallelException {
        if (line1.getSlope() == line2.getSlope()) {
            throw new ParallelException("Lines are parallel!");
        }
        return (line2.getYIntercept() - line1.getYIntercept()) /
                (line1.getSlope() - line2.getSlope());
    }
}
