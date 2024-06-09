import kotlin.reflect.KFunction1

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val transformedNumbers = transformCollection(numbers, ::square)
    println(transformedNumbers) // вернется: [1, 4, 9, 16, 25]
}

fun square(x: Int): Int {
    return x * x
}

fun <T> transformCollection(input: List<T>, block: KFunction1<T, T>) : List<T> {
    return input.map {
        block(it)
    }
}