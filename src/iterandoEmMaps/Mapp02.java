package iterandoEmMaps;

import com.sun.source.doctree.SeeTree;

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
            System.out.println(i);
        }


        Collection<Integer> values = map.values();

        for(Integer v : values){
            System.out.println(v);
        }

       Set<Map.Entry<String, Integer>> entry =  map.entrySet();

        for(var entryVar : entry){
            System.out.printf("%s  <======> %d\n" , entryVar.getKey(), entryVar.getValue());
        }

    }
}
