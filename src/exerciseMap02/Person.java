package exerciseMap02;

public class Person {

    private final String name;

    private final int id;

    public Person(String name, int idade) {
        this.name = name;
        this.id = idade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Nome: " + name + " - Idade: " + id;
    }
}
