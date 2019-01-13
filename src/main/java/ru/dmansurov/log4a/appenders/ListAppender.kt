package ru.dmansurov.log4a.appenders

import ru.dmansurov.log4a.LogLevel
import java.util.*

data class LogItem(
        val timestamp: Date = Date(),
        val logLevel: LogLevel,
        val name: String,
        val msg: String
)

class ListAppender(val list: MutableList<LogItem> = mutableListOf()) : Appender {
    override fun log(logLevel: LogLevel, name: String, msg: String) {
        list.add(LogItem(
                timestamp = Date(),
                logLevel = logLevel,
                name = name,
                msg = msg
        ))
    }
}