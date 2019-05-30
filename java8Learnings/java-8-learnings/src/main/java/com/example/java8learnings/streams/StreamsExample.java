package com.example.java8learnings.streams;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public interface StreamsExample {

    Stream<String> getStream();
    List<String> getSortedList();


}
