import java.util.Date;
import java.util.Objects;

public class User {

    private String name;
    private Date entryMoment;

    public User(String name, Date entryMoment) {
        this.name = name;
        this.entryMoment = entryMoment;
    }

    @Override
    public String toString(){
        return name + ", " + entryMoment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(entryMoment, user.entryMoment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, entryMoment);
    }
}
