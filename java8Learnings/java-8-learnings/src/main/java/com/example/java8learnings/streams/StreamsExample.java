package com.example.java8learnings.streams;


import com.example.java8learnings.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public interface StreamsExample {

    Stream<String> getStream();
    List<String> getSortedList();
    List<String> getFilteredList(String filterOn);
    List<Person> getMappedList();
    Boolean matchAnyValues(String value);
    Boolean matchAllValues(String value);
    Boolean matchNoneValues(String value);
    Integer countValues(String value);
    Optional<String> reduceValue();

}
