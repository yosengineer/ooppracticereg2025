package chapter11;

import java.util.*;

class Person {
    String name;

    // add a field to store a birthday
    Date birthday;
    ArrayList<String> friends;

    // write a method to set the birthday
    void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    // write a method to get the birthday
    Date getBirthday() {
        return birthday;
    }
}
