package collection;

import java.util.*;
import java.util.Map.Entry;

public class Collection1 {
    public static void main(String[] args) {
        run();
    }

    static void run() {
        //////////////////// 제네릭스 ////////////////////
        List<String> list = new ArrayList<>(); // 다형성~
        list.add(0, "가");
        list.add(1, "나");
        list.add(2, "다");
        System.out.println("list = " + list);

        Generics1<List<String>> lists = new Generics1<>(); //제네릭스~
        lists.updateValue(list);
        System.out.println("lists 조회 : " + lists.readValue());

        Generics1<Integer> ints = new Generics1<>(); //제네릭스~
        ints.updateValue(3);
        System.out.println("ints 조회 : " + ints.readValue());
        // 같은 Generics1 인스턴스 사용하는데 다양한 타입으로 즐길 수 있다.


        //////////////////// 컬렉션 ////////////////////
        // Set(집합): 값을 순서없고 중복없이 저장 -> 주로 대상 원소가 집합에 소속되었는지 여부를 검사함
        // Set은 index로 관리하지 않기 때문에 iterator(반복자)를 사용해서 접근해야함

        // HashMap
        Map<Integer, Integer> map = new HashMap<>(); // 다형성~
        map.put(1, 3);
        map.put(1200, 900);
        map.put(20, 50000);

        // Map.Entry 인터페이스 -> Map 인터페이스의 내부 인터페이스
        // 똑같이 key랑 value가 쌍을 이룬다.
        Entry<Integer, Integer> maxEntry = null;

        // HashMap 안의 내용을 꺼낼 땐
        // entrySet, keySet, Iterator를 이용한다. entrySet이 keySet보다 더 좋은 성능을 보인다고 함
        Set<Entry<Integer, Integer>> entrySet = map.entrySet(); // entrySet() : map 전체 꺼냄
        for (Entry<Integer, Integer> entry : entrySet) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        // 전체 entry의 값들 중 최댓값을 가지는 entry 키와 값 출력
        System.out.println("최댓값의 키 : " + maxEntry.getKey()
                + "\n최댓값의 값 : " + maxEntry.getValue());

        // Collections 클래스 메소드 이용하기
        System.out.println("키 최댓값 : " + Collections.max(map.keySet()));
        System.out.println("키 최솟값 : " + Collections.min(map.keySet()));
        System.out.println("값 최댓값 : " + Collections.max(map.values()));
        System.out.println("값 최솟값 : " + Collections.min(map.values()));
    }
}
