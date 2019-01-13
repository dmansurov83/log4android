package ru.dmansurov.log4a

import android.util.Log

interface Appender {
    fun log(logLevel: LogLevel, name: String, msg: String)
}

class LogCatAppender : Appender {
    override fun log(logLevel: LogLevel, name: String, msg: String) {
        when (logLevel) {
            LogLevel.INFO -> Log.i(name, msg)
            LogLevel.DEBUG -> Log.d(name, msg)
            LogLevel.WARN -> Log.w(name, msg)
            LogLevel.ERROR -> Log.e(name, msg)
        }
    }
}