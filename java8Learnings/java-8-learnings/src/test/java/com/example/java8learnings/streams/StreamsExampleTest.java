package com.example.java8learnings.streams;

import com.example.java8learnings.TestUtils;
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
    private StreamsExampleImpl streamsExampleImpl;

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
    public void getSortedListShouldBeSorted() {

        List<String> result = streamsExampleImpl.getSortedList();
        Boolean isSorted = TestUtils.isSorted(result);
        assert(isSorted);
   }


}