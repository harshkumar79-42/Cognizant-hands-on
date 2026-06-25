package com.cognizant.JUnitExercises;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;

public class MockitoVerifyTest {

    @Test
    void checkStudentsAdded() {
        List<String> mockList = Mockito.mock(List.class);

        mockList.add("Harsh");
        mockList.add("Kumar");

        Mockito.verify(mockList).add("Harsh");
        Mockito.verify(mockList).add("Kumar");

        System.out.println("Both students were added successfully!");
    }

    @Test
    void checkSizeCalledMultipleTimes() {
        List<String> mockList = Mockito.mock(List.class);

        mockList.size();
        mockList.size();
        mockList.size();

        Mockito.verify(mockList, Mockito.times(3)).size();
        System.out.println("Size was checked 3 times - verified!");
    }
}