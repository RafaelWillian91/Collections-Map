package iterandoEmMaps;

import com.sun.source.doctree.SeeTree;
import org.w3c.dom.Node;

import java.util.*;

public class Mapp02 {

    public static void main(String[] args) {

        Map <String, Integer> map = new HashMap<>();
        map.put("Rafael", 300);
        map.put("Josiane", 200);
        map.put("Daniel", 150);



        Set<String> set = map.keySet();

        System.out.println(set);

        for(String i : set){
            System.out.println("keySet => " + i);
        }


        Collection<Integer> values = map.values();

        for(Integer v : values){
            System.out.println("Values => " + v);
        }

        //É uma interface dentro de outra Interface. Map.Entry
        //Set ve Map.Entry como um único argument, mas internamente é formado por dois
       Set<Map.Entry<String, Integer>> entry =  map.entrySet(); // retorno é uma entry que volta chave valor
        //Map.Entry é uma interface dentro da outra. que HashMap implmentou esses métodos no retorno da chamada do método
        //Então esses métodos só são usados no retorno da chama, por isso a Interface set nçao enchegar esses métodos
        //quando não referenciados por outra classe que os retorna.
        entry.size();
        //ou var entry = map.entrySet();

//        for(var entryVar : entry){
//            System.out.printf("%s  <======> %d\n" , entryVar.getKey(), entryVar.getValue());
//        }

        //Iteracao sobre entry
        for(Map.Entry<String, Integer> entryVar : entry){
            System.out.printf("%s  <======> %d\n" , entryVar.getKey(), entryVar.getValue());

        }

    }
}
