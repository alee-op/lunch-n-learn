package com.example.java8learnings.streams;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class StreamsExampleImpl implements StreamsExample{

    @Override
    public Stream<String> getStream() {
        return null;
    }

    @Override
    public List<String> getSortedList() {
        List<String> sortedList =  new ArrayList();
        sortedList.add("a");
        sortedList.add("b");
        sortedList.add("c");
        sortedList.add("d");
        return sortedList;
    }





}
