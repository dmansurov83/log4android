package ru.dmansurov.log4a

import ru.dmansurov.log4a.appenders.Appender
import ru.dmansurov.log4a.appenders.LogCatAppender

object LoggerFactory {
    var logLevel: LogLevel = LogLevel.INFO
    var appenders: MutableList<Appender> = mutableListOf()

    fun getLogger(clazz: Class<*>): Logger {
        return getLogger(clazz.simpleName)
    }

    fun getLogger(name: String): Logger {
        if (appenders.isEmpty()) {
            appenders.add(LogCatAppender())
        }
        return Logger(
                name = name,
                minLogLevel = logLevel,
                appenders = appenders
        )
    }
}