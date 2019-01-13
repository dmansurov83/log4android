package ru.dmansurov.log4a

interface Formatter {
    fun format(name: String, msg: String): String
}

class DefaultFormatter : Formatter {
    override fun format(name: String, msg: String): String {
        return "$name\t$msg"
    }
}