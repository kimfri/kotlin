package streams

import java.util.stream.Collectors.toList

fun main() {
    t1()
    t2()
}

fun t2() {
    val list = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val lessThanFive = list.stream()
        .map { it * 2 }
        .filter { it % 2 == 0 }
        .allMatch { it < 21 }
    println("lessThanFive $lessThanFive")
}

fun t1() {
    val list = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val doubledEven = list.stream()
        .filter { it % 2 == 0 }
        .map { it * 2 }
        .collect(toList())
    println(list)
    println(doubledEven)
}

