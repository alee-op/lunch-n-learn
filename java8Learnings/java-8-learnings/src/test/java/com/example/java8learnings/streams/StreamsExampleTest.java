package com.example.java8learnings.streams;

import com.example.java8learnings.TestUtils;
import com.example.java8learnings.models.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {StreamsExampleImpl.class})
public class StreamsExampleTest {

    @Autowired
    private StreamsExampleImpl streamsPractice;

//    @Test
//    public void getMessage() {
//        assert(true);
//    }


//   @Test
//   public void assertMethodReturnsString(String toUse, Function<String, String> fn) {
//        String result = fn.apply(toUse);
//        assert(!result.isEmpty());
//   }

    @Test
    public void getStream() {
    }


    //Get
    @Test
    public void getSortedList() {
    }

    //The List coming back should be sorted alphabetically
    @Test
    public void getSortedListShouldBeSorted() {

        List<String> result = streamsPractice.getSortedList();
        Boolean isSorted = TestUtils.isSorted(result);
        assert(isSorted);
    }


    @Test
    public void getFilteredListStartsWithA() {

        List<String> result = streamsPractice.getFilteredList("a");
        for (String filteredItem: result) {
            assert(filteredItem.startsWith("a"));
        }

    }

    @Test
    public void getMappedList() {

        List<Person> result = streamsPractice.getMappedList();
        assert(result.get(0).getClass().equals(Person.class));
    }

    @Test
    public void matchAnyValues() {
    }

    @Test
    public void matchAllValues() {
    }

    @Test
    public void matchNoneValues() {
    }

    @Test
    public void countValues() {
    }

    @Test
    public void reduceValue() {
    }





}