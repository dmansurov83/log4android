package ru.dmansurov.log4a.appenders

import android.util.Log
import ru.dmansurov.log4a.LogLevel

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