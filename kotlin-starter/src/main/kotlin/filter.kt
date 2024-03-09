/*filter
fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }

    // evenList: [2, 4, 6, 8, 10]

    println(evenList)
}

 */

/*filternot
fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val notEvenList = numberList.filterNot { it % 2 == 0 }

    // notEvenList: [1, 3, 5, 7, 9]

    println(notEvenList)
}

 */

/*collection operator map()
fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val multipliedBy5 = numberList.map { it * 5 }

    // multipliedBy5: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]

    println(multipliedBy5)
}

 */

fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print(numberList.count())

    // Output: 10
}