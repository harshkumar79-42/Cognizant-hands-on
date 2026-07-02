package com.cognizant.JUnitExercises;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class MockitoStubbingTest {

    @Test
    void checkStudentListSize() {
        List<String> mockList = Mockito.mock(List.class);

        Mockito.when(mockList.size()).thenReturn(3);
        Mockito.when(mockList.get(0)).thenReturn("Harsh");

        assertEquals(3, mockList.size());
        assertEquals("Harsh", mockList.get(0));

        System.out.println("Total students: " + mockList.size());
        System.out.println("First student: " + mockList.get(0));
    }

    @Test
    void checkListNotEmpty() {
        List<String> mockList = Mockito.mock(List.class);

        Mockito.when(mockList.isEmpty()).thenReturn(false);

        assertFalse(mockList.isEmpty());
        System.out.println("Student list is empty: " + mockList.isEmpty());
    }
}