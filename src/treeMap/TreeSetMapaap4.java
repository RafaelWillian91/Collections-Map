package treeMap;

import classesCustomizadasComoChaves.Name;

import java.util.Map;
import java.util.TreeMap;

public class TreeSetMapaap4 {

    public static void main(String[] args) {

        //O TreeMap internamente tem um TreeSet que precisa que a classe a que se referencia implemente Comparable. Senao nao compila.
        Map<Name2, Integer> attributePeople = new TreeMap<>();
        attributePeople.put(new Name2("Rafael", "Willian"), 32);
        attributePeople.put(new Name2("Maria", "Jose"), 62);
        attributePeople.put(new Name2("Josiane", "Visicatto"), 31);
        //Estruturas que tem Hash no nome precisam de Equals e hashCode para o java saber o que são elementos iguais (olha os dados internos)
        attributePeople.put(new Name2("Silva", "Visicatto"), 31);
        attributePeople.put(new Name2("Amanda", "Torres"), 41);
        attributePeople.put(new Name2("Rafael", "Torres"), 41);

        attributePeople.put(new Name2("Celso", "Cerqueira"), 37);
        attributePeople.put(new Name2("Celso", "Nogueira"), 34);
        //Temos que colocar equals e hashcode, pq chaves são únicas dentro do Map. Então temos que implementar o equals e hashcode.

        System.out.println(attributePeople);

        //Detalhe importante: As classes Wrappers, Strings, Enums do Java já implementam equals e HashCode, implementam Comparable....
        //O maior problema é quando voce usa ou Cria as classes. Na dúvida implementa tudo. equals e hashcode, Comparable...

    }

}
