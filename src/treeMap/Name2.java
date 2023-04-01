package treeMap;

import java.util.Objects;

public class Name2 implements Comparable<Name2>{

    private final String name;

    private final String lastName;

    public Name2(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name2 name2 = (Name2) o;
        return Objects.equals(name, name2.name) && Objects.equals(lastName, name2.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    @Override
    public int compareTo(Name2 o) {
        int old = name.compareTo(o.name);

        if(old == 0){
            return o.lastName.compareTo(o.lastName);
        }
        return old;
    }
}
