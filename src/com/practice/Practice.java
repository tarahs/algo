package com.practice;
import com.interview.datastructure.lList.*;
import com.interview.datastructure.lList.LinkedList;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;

public class Practice {
    public static void main(String[] args) throws InterruptedException {

        Map<LinkedList.Node, Integer> node = new HashMap<>();

        Integer[] array = {1,2,3,4,5,6};
        List<Integer> list1 = Arrays.asList(array);

        Integer[] array2 = {1,3,2,4,5,6};
        List<Integer> list2 = Arrays.asList(array2);

        List list = new ArrayList();

        System.out.println(list1.containsAll(list2));


    }

    public static String charCount(String str){

        Map<Character, Integer> map = new TreeMap<>();

        for(Character character: str.toCharArray()){
            map.put(character, map.getOrDefault(character,1)+1);
        }

        Set<Map.Entry<Character, Integer>> list = new TreeSet<>(map.entrySet());

//        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
//                return o2.getValue().compareTo(o1.getValue());
//            }
//        });

        StringBuilder sb = new StringBuilder();
        for(Map.Entry entry: list){
            sb.append(entry.getKey()).append(entry.getValue());
        }

        return sb.toString();

    }

    class Employee{
        String name;

        public Employee(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}


//T2a6r3 4I2m2t2