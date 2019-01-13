package ru.dmansurov.log4a;

import org.junit.Test;

import java.util.ArrayList;

import ru.dmansurov.log4a.appenders.ListAppender;
import ru.dmansurov.log4a.appenders.LogItem;

public class JavaTest {
    @Test
    public void useFromJava(){
        LoggerFactory.INSTANCE.getAppenders().clear();
        ArrayList<LogItem> list = new ArrayList<>();
        LoggerFactory.INSTANCE.getAppenders().add(new ListAppender(list));
        Logger logger = LoggerFactory.INSTANCE.getLogger("TestLogger");
        logger.info("Log from java");
        assert !list.isEmpty();
    }
}
