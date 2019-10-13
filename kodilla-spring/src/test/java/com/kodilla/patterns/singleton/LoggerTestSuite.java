package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGettingLogs(){
        //Given
        //When
        Logger.getInstance().log("Testing log1");
        Logger.getInstance().log("Testing log2");
        Logger.getInstance().log("Testing log3");
        String lastLog = Logger.getInstance().getLastLog();
        Logger.getInstance().log("Testing log4");
        //Then
        Assert.assertEquals("Testing log3", lastLog);
    }
}
