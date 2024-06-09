

fun main() {
    people.groupBy { it.age }.forEach { (t, u) -> println(u.size) }

    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
        .split(' ', '.', ',')
        .filter { it.startsWith('a') }
        .groupBy { it.length }
        .also { println(it.entries) }
}

data class Person(val name: String, val age: Int)
val people = listOf(
    Person("Петя", 25),
    Person("Вася", 30),
    Person("Даша", 25),
    Person("Женя", 30),
    Person("Алексей", 20)
)


