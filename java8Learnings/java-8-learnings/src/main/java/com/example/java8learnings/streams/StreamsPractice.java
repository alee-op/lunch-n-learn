package com.example.java8learnings.streams;

import com.example.java8learnings.models.Person;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsPractice implements StreamsExample {

    @Override
    public Stream<String> getStream() {
        return null;
    }

    @Override
    public List<String> getSortedList() {
        return null;
    }

    @Override
    public List<String> getFilteredList(String filterOn) {
        return null;
    }

    @Override
    public List<Person> getMappedList() {
        return null;
    }

    @Override
    public Boolean matchAnyValues(String value) {
        return null;
    }

    @Override
    public Boolean matchAllValues(String value) {
        return null;
    }

    @Override
    public Boolean matchNoneValues(String value) {
        return null;
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
