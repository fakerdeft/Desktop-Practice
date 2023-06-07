package collection;

import java.util.*;
import java.util.Map.Entry;

public class Collection1 {
    public static void main(String[] args) {
        run();
    }

    static void run() {
        List<String> list = new ArrayList<>(); //동적 바인딩 ~
        list.add(0, "가");
        list.add(1, "나");
        list.add(2, "다");
        System.out.println(list);

        Generics1<List<String>> lists = new Generics1<>(); //제네릭스~
        lists.updateValue(list);
        System.out.println("lists 조회 : " + lists.readValue());

        Generics1<Integer> ints = new Generics1<>(); //제네릭스~
        ints.updateValue(3);
        System.out.println("ints 조회 : " + ints.readValue());
        // 같은 Generics1 인스턴스 사용하는데 다양한 타입으로 즐길 수 있다.

        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); //동바~
        map.put(1, 5);
        map.put(2, 70);
        map.put(3, 50);

        Entry<Integer, Integer> maxEntry = null;
        
        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Entry<Integer, Integer> entry : entrySet) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }

        // Max Key, Value 출력
        System.out.println(maxEntry.getKey() + " : " + maxEntry.getValue());  // 2 : 70
    }
}
