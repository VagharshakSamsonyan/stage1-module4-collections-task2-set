package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new HashSet<>();
        Set<String> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);
        intersection.removeAll(thirdSet);

        Set<String> onlyThirdSet = new HashSet<>(thirdSet);
        onlyThirdSet.removeAll(firstSet);
        onlyThirdSet.removeAll(secondSet);


        set.addAll(intersection);
        set.addAll(onlyThirdSet);
        return set;
    }

}