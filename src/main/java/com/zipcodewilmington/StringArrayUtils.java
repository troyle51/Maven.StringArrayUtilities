package com.zipcodewilmington;

import java.util.Collections;
import java.util.*;


/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String element: array){
            if(element.equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.reverse(list);
        String[] reversedArray = list.toArray(array);

        return reversedArray;

    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String reverse = "";
        boolean outcome = false;
        for(int i = array.length - 1; i >=0; i--){
            reverse = reverse + array[i];
        }

        System.out.println(reverse);
        System.out.println(Arrays.toString(array));
        if(Arrays.toString(array).contains(reverse)){
            outcome = true;
        }
        System.out.println(outcome);
         return outcome;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        StringBuilder build = new StringBuilder();
        for(String s : array) {
            build.append(s);
        } String str = build.toString();
        str = str.toLowerCase();

        boolean allLetters = true;

        for(char ch = 'a'; ch <= 'z'; ch++){
            if(!str.contains(String.valueOf(ch))){
                allLetters = false;
                break;
            }
        }
        return allLetters;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(value)){
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(valueToRemove)) {
                idx = idx + i;
            }
        }

        String[] copyArr = new String[array.length - 1];
        for(int i = 0, j = 0; i < array.length; i++){
            if (i != idx) {
                copyArr[j++] = array[i];
            }
        }
        return copyArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> newList = new ArrayList<>(List.of(array));

        for(int i = newList.size()-1; i >=1; i--){
            if(newList.get(i).equals(newList.get(i-1))){
                newList.remove(i);
            }
        }
        System.out.println(newList);
        return newList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
