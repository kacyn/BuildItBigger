package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.test.mock.MockContext;

import java.util.concurrent.TimeUnit;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testVerifyJokeReceived() {
        String joke = "";

        try {
            EndpointsAsyncTask jokeTask = new EndpointsAsyncTask(new MockContext());
            jokeTask.execute();
            joke = jokeTask.get(30, TimeUnit.SECONDS);
        } catch (Exception e){
            fail("Timed out");

        }

        assertFalse(joke.equals(""));

    }
}