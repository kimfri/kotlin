package timetracker

import com.xenomachina.argparser.ArgParser
import com.xenomachina.argparser.default

class Args(parser: ArgParser) {
//    https://github.com/xenomachina/kotlin-argparser-example/blob/master/src/main/kotlin/com/xenomachina/argparser/example/Main.kt

//    https://github.com/Kotlin/kotlinx-cli
    /**
    val name by parser.storing("-N", "--name",
        help = "name of the widget").default("John Doe")

    val size by parser.storing("-s", "--size",
        help = "size of the plumbus").default("1") { toInt() }
    */

    val name by parser.storing("-N", "--name",
        help = "name of the widget").default("John Doe")

    val size by parser.storing("-s", "--size") {toInt()}

}