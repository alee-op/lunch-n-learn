package com.example.java8learnings.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsPractice implements StreamsExample {


    private List<String> getStringList() {

        List<String> stringList = new ArrayList<>();
        stringList.add("a1");
        stringList.add("b1");
        stringList.add("c1");

        stringList.add("a2");
        stringList.add("b2");
        stringList.add("c3");

        stringList.add("a3");
        stringList.add("b3");
        stringList.add("c2");

        return stringList;
    }

    @Override
    public Stream<String> getStream() {
        return null;
    }

    @Override
    public List<String> getSortedList() {
        return null;
    }
}
