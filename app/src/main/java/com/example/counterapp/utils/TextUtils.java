package com.example.counterapp.utils;

public class TextUtils {

    public static int getCharCount(String input){

        return input.length()>0 ? input.length() : -1;

    }

    public static int getWordCount(String input){

        int word_count = -1;
        if(input.length()>0) {
            String[] words = input.split("\\s+");
            word_count = words.length;
        }
        return word_count;

   }



}
