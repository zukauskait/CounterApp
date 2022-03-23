package com.example.counterapp;

import android.view.TextureView;

public class Calculation {

    String text;
    String choice;

    public Calculation(String text, String choice) {
        this.text =text;
        this.choice=choice;
    }

    public String count_values(){

        int results;

        if(choice.equals("Words")){
            String[] words = text.split("\\s+");
            results = words.length;
        }
        else{
            results = text.length();
        }

        return Integer.toString(results);
    }




}
