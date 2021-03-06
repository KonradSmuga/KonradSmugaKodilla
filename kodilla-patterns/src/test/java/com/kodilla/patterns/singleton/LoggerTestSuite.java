package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLoadSettings() {
        //Given
        Logger.getInstance().log("log");
        //When
        String logger = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("log", logger);
    }
}
