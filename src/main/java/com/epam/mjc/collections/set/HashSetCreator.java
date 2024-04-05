package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet <Integer> set = new HashSet<>();
        for (int element : sourceList){
            if (element % 2 !=0)
            {set.add(element);
                set.add(element * 2);
            }
            else {

                while (element % 2 == 0){
                    set.add(element);
                    element=element/2;
                }
                set.add(element);
            }
        }
        return set;
    }
}