package com.interview.algorithms;

import java.util.*;

/**
 * B <- A  B imports A
 E <- B
 D <- A, C
 C <- E
 Output: A, B, E, C, D


 B A
 A
 E B
 D A,C
 C E

 A B, D
 B E
 C D
 E C

 A, B, E, C, D





 */
public class Dependancy {


    public Set<String> loadDependancy(Map<String, List<String>> dependancy){

        Map<String, List<String>> depMap = new HashMap<>();
        Set<String> res = new LinkedHashSet<>();

        Set<String> dependansOn = new HashSet<>();
        Set<String> dependant = new HashSet<>();
        for(Map.Entry<String, List<String>> entry: dependancy.entrySet()){
            dependansOn.add(entry.getKey());
            for(String dep: (List<String>)entry.getValue()){
                dependant.add(dep);
                List<String> list = depMap.getOrDefault(dep, new ArrayList<>());
                list.add(entry.getKey());
                depMap.put(dep, list);
            }
        }

        Iterator it = dependant.iterator();
        while(it.hasNext()){
            String independant = (String)it.next();
            loadDep(independant, depMap, res);



        }
        return res;

    }

    public static void loadDep(String curClass, Map<String, List<String>> depMap, Set<String> res){

        if(curClass == null)
            return;
        res.add(curClass);

        for(String dep: depMap.get(curClass)){
            if(!res.contains(dep))
                loadDep(dep, depMap, res);
        }

    }
}
