package com.example.user.hw1;

import org.junit.After;
import org.junit.Before;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class SuggestionTest {
    private Suggestion ms;

    @Before
    public void setUp(){
        ms = new Suggestion();
    }

    @After
    public void tearDown(){
        ms = null;
    }
    public void getSuggestion(){
        Suggestion gradeSuggestion = new Suggestion();
        String s = gradeSuggestion.getSuggestion(10);
        aassertEquals(s, ms.getSuggestion(10));

    }
}
