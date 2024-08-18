package org.example;

public class MyAlgo1 {
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
        while (j<word2.length()){
            builder.append(word2.charAt(j++));
        }
        return builder.toString();
    }
    public static void main (String[]args){
        mergeLetters("abcd","12345");

    }
}
