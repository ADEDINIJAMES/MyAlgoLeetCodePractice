package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static String mergeLetters(String word1, String word2){
        StringBuilder builder= new StringBuilder();
        //initializing index
        int i=0;
        int j=0;
        // main merging while loop
        while (i<word1.length()&& j<word2.length()){
            builder.append(word1.charAt(i++));
            builder.append(word2.charAt(j++));
        }
        // Appending the remaining
        while (i<word1.length()){
            builder.append(word1.charAt(i++));
        }
        Set<Character> myCha= new HashSet<>();
        while (j<word2.length()){
            builder.append(word2.charAt(j++));
        }
        return builder.toString();
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        Set<Character> myCharacters = new HashSet<>();
        StringBuilder builder = new StringBuilder();
        char[]myC1 =str1.toCharArray();
        char[]myC2 =str2.toCharArray();

        for (int i=0; i<myC1.length; i++){
            for(int j = 0; i<myC2.length; i++){
                if(myC2[j]==myC2[i]){
                    myCharacters.add (myC2[i]);
                }
                j++;
            }
        }

        for (char i : myCharacters){
            builder.append (i);
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "defg";
        System.out.println(mergeLetters(word1, word2));  // Output: "adbecfg"
//        System.out.println("abcd"+"ab");
//        System.out.println("ab"+"abcd");

        System.out.println(gcdOfStrings("ABABAB","ABAB"));
        System.out.println("empty"+gcdOfStrings("LEET","CODE"));

    }

}