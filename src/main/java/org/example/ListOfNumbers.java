package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListOfNumbers {
    private Set<Integer> numbers;

    private ListOfNumbers(){}

    public static ListOfNumbers of(Integer ... numbers){
         if(Arrays.stream(numbers)
                .anyMatch(i->i>1000)){
             throw new RuntimeException("List should not contain number > 1000");
         }

        ListOfNumbers listOfNumbers = new ListOfNumbers();
        listOfNumbers.numbers = Arrays.stream(numbers).collect(Collectors.toSet());
        return listOfNumbers;
    }

    public List<Integer> fetchEvenNumbers(){
        return this.numbers.stream().filter(i->i%2 == 0).collect(Collectors.toList());
    }
}
