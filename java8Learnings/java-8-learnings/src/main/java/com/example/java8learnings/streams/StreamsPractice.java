package com.example.java8learnings.streams;

import com.example.java8learnings.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StreamsPractice implements StreamsExample {

    //use stream().sorted() method
    @Override
    public List<String> getSortedList(List<String> listToStream) {
        return null;
    }

    //use stream().filter()
    @Override
    public List<String> getFilteredList(String filterOn, List<String> listToStream) {
        return null;
    }

    //use stream().map()
    @Override
    public List<Person> getMappedList(List<String> listToStream) {
        return null;
    }

    //use stream().anyMatch()
    @Override
    public Boolean matchAnyValues(String value, List<String> listToStream) {
        return null;
    }

    //use stream().allMatch()
    @Override
    public Boolean matchAllValues(String value, List<String> listToStream) {
        return null;
    }

    //use stream().noneMatch()
    @Override
    public Boolean matchNoneValues(String value, List<String> listToStream) {
        return null;
    }


    //use stream().filter combined with .count()
    @Override
    public Integer countValues(String value, List<String> listToStream) {
        return null;
    }

    //use stream().reduce()
    @Override
    public Optional<String> reduceValue(List<String> listToStream) {
        return Optional.empty();
    }

}
