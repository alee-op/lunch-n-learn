package com.example.java8learnings;


import org.assertj.core.util.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class TestUtils {


    public static List<String> getStringList() {

        return Lists.newArrayList("a", "b", "c", "d");
    }


    public static Boolean isSorted(List<String> actual) {

        List<String> expected = new ArrayList<>(actual);
        Collections.sort(expected);

        for(int i = 0; i < actual.size() - 1; i++) {
            if(actual.get(i) != expected.get(i)) {
                return false;
            }
        }

        return true;
    }

}
