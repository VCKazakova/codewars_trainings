package ru.kazakova.codewars.february.yan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MultiMap {

    /**
     * Развернуть мультимапу Map<Integer, List<Long>>
     * при помощи Stream api
     */

    public static void main(String[] args) {
        Map<Integer, List<Long>> multimap = new HashMap<>();
        List<Long> longList = List.of(1L, 6L, 9L);
        multimap.put(1, longList);
        List<Long> longList2 = List.of(1L, 6L, 10L);
        multimap.put(2, longList2);


        List<Object> collect = multimap.entrySet().stream()
                .flatMap(entrySet -> {
                    Integer key = entrySet.getKey();
                    List<Long> value = entrySet.getValue();
                    List<Object> keyValuePairs = new ArrayList<>();
                    keyValuePairs.add(key);
                    keyValuePairs.addAll(value);
                    return keyValuePairs.stream();
                }).collect(Collectors.toList());

        System.out.println(collect);


        List<Long> flattenedList = multimap.values().stream()
                .flatMap(List::stream)
                .toList();

    }

}
