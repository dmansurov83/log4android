package ru.dmansurov.log4a

import org.junit.Test
import ru.dmansurov.log4a.appenders.ListAppender
import ru.dmansurov.log4a.appenders.LogItem

class LoggerTests {


    @Test
    fun logToList() {
        val logList = mutableListOf<LogItem>()
        LoggerFactory.appenders.add(ListAppender(logList))
        val testLoggerName = "TestLogger"
        val logger = LoggerFactory.getLogger(testLoggerName)
        logger.debug("Test message")
        assert(logList.isNotEmpty())
        val logItem = logList.last()
        assert(logItem.logLevel == LogLevel.DEBUG)
        assert(logItem.name == testLoggerName)
        assert(logItem.msg == "Test message")
    }
}