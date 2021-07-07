import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private String email;
    private int telephoneNumber;

    public Person (String name, String surname, String email, int telephoneNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.telephoneNumber = telephoneNumber;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return telephoneNumber == person.telephoneNumber && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, telephoneNumber);
    }
}
