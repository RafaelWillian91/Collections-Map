package classesCustomizadasComoChaves;

import java.util.Objects;

public class Name {

    private final String name;

    private final String lastName;

    public Name(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name + "" + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name) && Objects.equals(lastName, name1.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}
