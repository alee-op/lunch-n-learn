package com.example.java8learnings.streams;


import com.example.java8learnings.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public interface StreamsExample {

    List<String> getSortedList(List<String> listToStream);
    List<String> getFilteredList(String filterOn, List<String> listToStream);
    List<Person> getMappedList(List<String> listToStream);
    Boolean matchAnyValues(String value, List<String> listToStream);
    Boolean matchAllValues(String value, List<String> listToStream);
    Boolean matchNoneValues(String value, List<String> listToStream);
    Integer countValues(String value, List<String> listToStream);
    Optional<String> reduceValue(List<String> listToStream);

}
