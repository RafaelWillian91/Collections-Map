package exerciseMap02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapapp6 {

    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();
        person.add(new Person("Rafael", 3033));
        person.add(new Person("Rodrigo", 4042));
        person.add(new Person("Roberto", 5052));



        Map<Integer, String> mapList = mapear(person);

        System.out.println(mapList.keySet());

    }

    private static Map mapear(List<Person> list){
        Map<Integer, String> map = new HashMap<>();
        for(Person p : list){
            map.put(p.getId(), p.getName());
        }

        return map;

    }

}
