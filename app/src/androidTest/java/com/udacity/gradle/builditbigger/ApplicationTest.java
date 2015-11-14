package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.TimeUnit;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends AndroidTestCase {

    public void testVerifyJokeReceived() {
        String joke = "";

        try {
            EndpointsAsyncTask jokeTask = new EndpointsAsyncTask(getContext());
            jokeTask.execute();
            joke = jokeTask.get(30, TimeUnit.SECONDS);
        } catch (Exception e){
            fail("Timed out");
        }

        assertFalse(joke.equals(""));
    }
}
