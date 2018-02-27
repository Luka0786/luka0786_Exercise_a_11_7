package Kap11Exercise7;

import java.util.*;

public class Opgave7
{
    /*
    Write a method countCommon that accepts two lists of integers
    as parameters and returns the number of unique integers that occur
    in both lists. Use one or more sets as storage to help you solve
    this problem. For example, if one list contains the values
    [3, 7, 3, –1, 2, 3, 7, 2, 15, 15] and the other list contains the values
    [–5, 15, 2, –1, 7, 15, 36], your method should return 4 because the
    elements –1, 2, 7, and 15 occur in both lists.
    */

    public static void main(String[] args)
    {
        List<Integer> integerListOne = new LinkedList<>();
        List<Integer> integerListTwo = new LinkedList<>();

        integerListOne.add(0,3);
        integerListOne.add(1,7);
        integerListOne.add(2,3);
        integerListOne.add(3,-1);
        integerListOne.add(4,2);
        integerListOne.add(5,3);
        integerListOne.add(6,7);
        integerListOne.add(7,2);
        integerListOne.add(8,15);
        integerListOne.add(9,15);

        integerListTwo.add(0,-5);
        integerListTwo.add(1,-15);
        integerListTwo.add(2,2);
        integerListTwo.add(3,-1);
        integerListTwo.add(4,7);
        integerListTwo.add(5,15);
        integerListTwo.add(6,36);

        System.out.println(countCommon(integerListOne, integerListTwo));
    }

    public static Set<Integer> countCommon(List<Integer> listOne, List<Integer> listTwo)
    {
        Set<Integer> integerSetOne = new HashSet<>(listOne);
        integerSetOne.retainAll(listTwo);

        return integerSetOne;
    }
}
