package ru.dmansurov.log4a

enum class LogLevel {
    INFO,
    DEBUG,
    WARN,
    ERROR,
}

class Logger(private val name: String,
             private val minLogLevel: LogLevel,
             private val appenders: List<Appender>
) {

    private fun log(logLevel: LogLevel, msg: String) {
        if (minLogLevel <= logLevel) {
            appenders.forEach {
                it.log(logLevel, name, msg)
            }
        }
    }

    fun info(msg: String) = log(LogLevel.INFO, msg)
    fun debug(msg: String) = log(LogLevel.DEBUG, msg)
    fun warn(msg: String) = log(LogLevel.WARN, msg)
    fun error(msg: String) = log(LogLevel.ERROR, msg)
    fun error(thr: Throwable) = log(LogLevel.ERROR, thr.stackTrace.joinToString("\n"))
}

