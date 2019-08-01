package chap02.section3

fun main() {
    val num: Any
    num = "Hello"
    if (num is String)
        print(num.length)
    else if (num !is Int)
        print("Not a Int")
}