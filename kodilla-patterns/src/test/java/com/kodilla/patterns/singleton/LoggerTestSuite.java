package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void addLogs() {
        Logger.getInstance().log("One");
        Logger.getInstance().log("Two");
        Logger.getInstance().log("Three");
        Logger.getInstance().log("Four");
    }

    @Test
    public void testGetLastLog() {

        String result = Logger.getInstance().getLastLog();

        Assert.assertEquals("Four", result);
    }
}
