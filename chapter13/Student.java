package chapter13;

class Student extends Person {
    private final String course;

    public Student(String name, String course) {
        super(name);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public String description() {
        return String.format("A student majoring in %s", getCourse());
    }
}
