```kotlin
fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) //Output: [1,2]

    val map = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    val newMap = map.filter { it.value.length <=3 }.toMap() //Solution for filtering map based on values
    println(newMap) // Output: {1=one, 2=two}
}
```