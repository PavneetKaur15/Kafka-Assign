package Assign;

public class UserMessage {
    int id, age;
    String name, course;

    public UserMessage(int id, String name, int age, String course) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;

    }

    public String toString() {

        return ("\"Id\":" + "\"" + Integer.toString(id) + "\"," + "\"Name\":" + "\"" + name + "\"," + "\"Age\":" + "\"" + Integer.toString(age) + "\"," + "\"Course\":" + "\"" + course + "\"");
    }

}
