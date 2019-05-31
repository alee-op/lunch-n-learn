package com.example.java8learnings.streams;

import com.example.java8learnings.TestUtils;
import com.example.java8learnings.models.Person;
import com.example.java8learnings.utility.DataUtility;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {StreamsExampleImpl.class, StreamsPractice.class})
public class StreamsExampleTest {

    @Autowired
    private StreamsPractice streamsPractice;

    //The List coming back should be sorted alphabetically
    @Test
    public void getSortedListShouldBeSorted() {

        List<String> result = streamsPractice.getSortedList(DataUtility.getStringList());
        Boolean isSorted = TestUtils.isSorted(result);
        assert(isSorted);
    }


    @Test
    public void getFilteredListStartsWithA() {

        List<String> result = streamsPractice.getFilteredList("a", DataUtility.getStringList());
        for (String filteredItem: result) {
            assert(filteredItem.startsWith("a"));
        }

    }

    @Test
    public void getMappedList() {

        List<Person> result = streamsPractice.getMappedList(DataUtility.getNameList());
        assert(result.get(0).getClass().equals(Person.class));
    }

    @Test
    public void matchAnyValues() {
        Boolean result = streamsPractice.matchAnyValues("1", DataUtility.getStringList());
                assert result;
    }

    @Test
    public void matchAllValues() {
        Boolean result = streamsPractice.matchAllValues("1", DataUtility.getStringList());
                assert !result;
    }

    @Test
    public void matchNoneValues() {

        Boolean result = streamsPractice.matchNoneValues("1", DataUtility.getStringList());
                assert !result;
    }

    @Test
    public void countValues() {

        Integer resultCount = streamsPractice.countValues("ori", DataUtility.getNameList());

        assert(resultCount > 0);
    }

    @Test
    public void reduceValue() {

        Optional<String> result = streamsPractice.reduceValue(DataUtility.getStringList());
        assert (result.isPresent());
        assert (result.get().length() > 0);

    }



}