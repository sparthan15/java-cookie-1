package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class ListOfNumbersTest {

    @Test
    void canCreateListOfNumbers (){
        ListOfNumbers listOfNumbers = ListOfNumbers.of(1,2,3);
        Assertions.assertNotNull(listOfNumbers);
    }

    @Test
    void givenAnAttemptToStoreNumberGreaterThan100ThenThrowAnException(){
        Assertions.assertThrows(RuntimeException.class, ()->ListOfNumbers.of(1,1001,3));
    }

    @Test
    void weCanFetchTheEvenNumbers(){
        ListOfNumbers listOfNumbers  = ListOfNumbers.of(1,2,3, 4);
        Assertions.assertEquals(2, listOfNumbers.fetchEvenNumbers().size());
    }
}
