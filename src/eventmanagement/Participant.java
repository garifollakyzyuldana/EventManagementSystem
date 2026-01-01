package eventmanagement;
import java.util.Objects;

public class Participant extends Person{
    private int age;

    public Participant(String name, int age) {
        super(name);
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String getRole() {
        return "Participant";
    }
    @Override
    public String toString() {
        return name + ", age = " + age;
    }
}
