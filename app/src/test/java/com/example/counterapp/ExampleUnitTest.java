package com.example.counterapp;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.counterapp.utils.TextUtils;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {



    @Test
    public void getCharCount_Given_EmptyString_Result_MinusOne() {

        String givenSting = "";
        int expectedValue = -1;
        int actualValue = TextUtils.getCharCount(givenSting);

        assertEquals(expectedValue,actualValue);

    }

    @Test
    public void getCharCount_Given_TwelveCharsString_Result_Twelve() {

        String givenSting = "blindspot111";
        int expectedValue = 12;
        int actualValue = TextUtils.getCharCount(givenSting);

        assertEquals(expectedValue,actualValue);

    }

    @Test (expected = NullPointerException.class)
    public void getCharCount_Given_NullString_Result_Exception() {

        String givenSting = null;
        int actualValue = TextUtils.getCharCount(givenSting);

    }

    @Test
    public void getWordCount_Given_EmptyString_Result_MinusOne() {

        String givenSting = "";
        int expectedValue = -1;
        int actualValue = TextUtils.getWordCount(givenSting);

        assertEquals(expectedValue,actualValue);

    }

    @Test
    public void getWordCount_Given_StringWithFiveWords_Result_Five() {

        String givenSting = "get test this that now";
        int expectedValue = 5;
        int actualValue = TextUtils.getWordCount(givenSting);

        assertEquals(expectedValue,actualValue);

    }

    @Test (expected = NullPointerException.class)
    public void getWordCount_Given_NullString_Result_Exception() {

        String givenSting = null;
        int actualValue = TextUtils.getCharCount(givenSting);

    }


}