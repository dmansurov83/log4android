package ru.dmansurov.log4a.appenders

import ru.dmansurov.log4a.LogLevel

interface Appender {
    fun log(logLevel: LogLevel, name: String, msg: String)
}

