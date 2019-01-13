package ru.dmansurov.log4a

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