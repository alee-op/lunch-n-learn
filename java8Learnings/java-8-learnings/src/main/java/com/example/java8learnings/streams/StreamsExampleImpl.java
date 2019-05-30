package com.example.java8learnings.streams;

import com.example.java8learnings.models.Person;
import com.example.java8learnings.utility.DataUtility;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class StreamsExampleImpl implements StreamsExample {

    @Override
    public Stream<String> getStream() {
        return null;
    }

    @Override
    public List<String> getSortedList() {
//        List<String> sortedList = new ArrayList();
//        sortedList.add("a");
//        sortedList.add("b");
//        sortedList.add("c");
//        sortedList.add("d");

        List<String> unsortedList = DataUtility.getStringList();

        List<String> sortedList = unsortedList.stream()
                .sorted()
                .collect(Collectors.toList());

        return sortedList;
    }


    @Override
    public List<String> getFilteredList(String filterOn) {
        List<String> toFilter = DataUtility.getStringList();

        List<String> filteredList = toFilter.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());

        return filteredList;
    }

    @Override
    public List<Person> getMappedList() {

        List<String> toMap = DataUtility.getNameList();

        List<Person> personList =
                toMap.stream()
                        .map(person -> new Person(person.toString()))
                        .collect(Collectors.toList());

        return personList;
    }

    @Override
    public Boolean matchAnyValues(String value) {

        List<String> toMatch = DataUtility.getNameList();

        Boolean matched =
                toMatch.stream()
                        .anyMatch(s -> s.contains("1"));

        return matched;
    }

    @Override
    public Boolean matchAllValues(String value) {
        List<String> toMatch = DataUtility.getNameList();

        Boolean matched =
                toMatch.stream()
                        .allMatch(s -> s.contains("1"));

        return matched;
    }

    @Override
    public Boolean matchNoneValues(String value) {
        List<String> toMatch = DataUtility.getNameList();

        Boolean matched =
                toMatch.stream()
                        .noneMatch(s -> s.contains("1"));

        return matched;
    }

    @Override
    public Integer countValues(String value) {
        return null;
    }

    @Override
    public Optional<String> reduceValue() {
        return Optional.empty();
    }
}
