package exercisesMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExerciseMap01 {

    public static void main(String[] args) {

        String a = "Garrafa";

        Map<Character, Integer> result =  contCaracter(a);

       char[] r =  a.toCharArray();

        Map<Character, Integer> result1  = contCaracter(r.toString());


        System.out.println(result);
    }

    private static Map<Character, Integer> contCaracter(String s){
        char [] r = s.toCharArray();
        Map<Character, Integer> mapCharacter = new TreeMap<>();
        for (char c : r) {
            //.get retorna o Tipo do Value encontrado de acordo com a chave. Como é Integer Map<Character, Integer> o tipo pode ser para int.
            int a = mapCharacter.getOrDefault(c, 0);//O retorno é o integer do Map
            mapCharacter.put(c, a + 1);
        }

        return mapCharacter;
    }

}


