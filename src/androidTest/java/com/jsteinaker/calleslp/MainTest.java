package com.jsteinaker.calleslp;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.jsteinaker.calleslp.MainTest \
 * com.jsteinaker.calleslp.tests/android.test.InstrumentationTestRunner
 */
public class MainTest extends ActivityInstrumentationTestCase2<Main> {

    public MainTest() {
        super("com.jsteinaker.calleslp", Main.class);
    }

}
