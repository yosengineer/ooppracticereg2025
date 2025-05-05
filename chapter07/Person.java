package chapter07;

public class Person {
    // states
    String name = "Jamal";
    int age = 26;

    Person() {

    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // behaviours
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    boolean smellsBad() {
        return false;
    }
}
