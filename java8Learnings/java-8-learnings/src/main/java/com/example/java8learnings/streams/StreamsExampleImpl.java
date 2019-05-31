package com.example.java8learnings.streams;

import com.example.java8learnings.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StreamsExampleImpl implements StreamsExample {

    @Override
    public List<String> getSortedList(List<String> listToStream) {

        List<String> sortedList = listToStream.stream()
                .sorted()
                .collect(Collectors.toList());

        return sortedList;
    }

    @Override
    public List<String> getFilteredList(String filterOn, List<String> listToStream) {

        List<String> filteredList = listToStream.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());

        return filteredList;
    }

    @Override
    public List<Person> getMappedList(List<String> listToStream) {

        List<Person> personList =
                listToStream.stream()
                        .map(person -> new Person(person.toString()))
                        .collect(Collectors.toList());

        return personList;
    }

    @Override
    public Boolean matchAnyValues(String value, List<String> listToStream) {

        Boolean matched =
                listToStream.stream()
                        .anyMatch(s -> s.contains(value));

        return matched;
    }

    //value = "1"
    @Override
    public Boolean matchAllValues(String value, List<String> listToStream) {

        Boolean matched =
                listToStream.stream()
                        .allMatch(s -> s.contains(value));

        return matched;
    }

    //value = "1"
    @Override
    public Boolean matchNoneValues(String value, List<String> listToStream) {

        Boolean matched =
                listToStream.stream()
                        .noneMatch(s -> s.contains(value));

        return matched;
    }

    //value = "ori"
    @Override
    public Integer countValues(String value, List<String> listToStream) {

        long count =
                listToStream.stream()
                        .filter((s) -> s.contains(value))
                        .count();

        return (int)count;
    }

    @Override
    public Optional<String> reduceValue(List<String> listToStream) {

        Optional<String> reduced =
                listToStream.stream()
                .reduce((s1, s2) -> s1 + " & " + s2);

        return reduced;
    }

}
