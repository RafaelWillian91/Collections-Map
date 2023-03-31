import java.util.HashMap;
import java.util.Map;

public class Mapapp1 {


    public static void main(String[] args) {

        Map<Long, String> map = new HashMap<>();
        //Em outras Collections tinhamos o método add aqui temos o pu que já pedi a chave(Set) e o valor(values)
        map.put(39099686862l, "Rafael Willian");
        map.put(39418668858l, "Josine Visicatto");
        map.put(783076860L, "Wanderley da Cruz");
        System.out.println( map.put(783076860L, "Wanderley da Cruz"));//Ele Sobrescreve o put anterior e esse put retorna
        //o valor da chave anterior ou null se não tiver put antes.

        System.out.println(map);

        //Um dos grandes apelos do Map é podermos encontrar coisas com base em uma chave

        System.out.println(map.get(39418668858L));
        //Se a chave não existe o retorno é null
        System.out.println(map.get(5545482181245111L));

        //O método getOrDefault se não achar a chave devolve um valos a minha escolha
        System.out.println(map.getOrDefault(565418185184L, "Não encontrei"));


        //System.out.println(map.size());
        //System.out.println(map.putAll());//Adiciona outro Map dentro desse Map. Igual addAll()
        //map.clear();




    }

}
