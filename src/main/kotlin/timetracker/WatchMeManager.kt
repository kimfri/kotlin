package timetracker

import com.xenomachina.argparser.ArgParser

class WatchMeManager() {

    fun goForIt(arguments: Array<String>) {
        println("Let's Kotlin!!")
        parse(arguments)
    }

    private fun parse(arguments: Array<String>) {
        arguments.toList().stream().forEach{ println(">> $it")}
        val parsedArgs = ArgParser(arguments).parseInto(::Args)

        parsedArgs.run {
            println("""
            Name: $name
            
        """.trimIndent())
        }
    }
}