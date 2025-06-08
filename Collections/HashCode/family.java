package Collections.HashCode;
import java.util.Objects;

public class family {
    private String name;
    private int age;

    public family(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "family [name=" + name + ", age=" + age + "]";
    }

    // if we want to compare the two object based on the value. so we have to override the equals method.
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        family ref = (family)obj;
        return this.name.equals(ref.name) && this.age == ref.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
