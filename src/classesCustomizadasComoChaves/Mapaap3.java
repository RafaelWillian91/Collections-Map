package classesCustomizadasComoChaves;

import java.util.HashMap;
import java.util.Map;

public class Mapaap3 {

    public static void main(String[] args) {

        Map<Name, Integer> attributePeople = new HashMap<>();
        attributePeople.put(new Name("Rafael ", "Willian"), 32);
        attributePeople.put(new Name("Maria ", "Jose"), 62);
        attributePeople.put(new Name("Josiane ", "Visicatto"), 31);
        //Estruturas que tem Hash no nome precisam de Equals e hashCode para o java saber o que são elementos iguais (olha os dados internos)
        attributePeople.put(new Name("Josiane ", "Visicatto"), 31);
        attributePeople.put(new Name("Josiane ", "Masal"), 31);
        attributePeople.put(new Name("Amanda ", "Torres"), 41);
        //Temos que colocar equals e hashcode, pq chaves são únicas dentro do Map. Então temos que implementar o equals e hashcode.

        System.out.println(attributePeople);





    }
}
