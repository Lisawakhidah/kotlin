
/*Enumeration
fun main() {
    val color: Color = Color.valueOf("GREEN")
    println("Color is $color")
    println("Color value is ${color.value.toString(16)}")

    /*
        output :
        Color is RED
        Color value is ff0000

        values() untuk mendapatkan daftar objek enum sedangkan
        fungsi valueOf() untuk mendapatkan nama dari objek enum
    */

}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}


fun main() {
    val color: Color = Color.GREEN

    when(color){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }

    /*
        output : Color is Green
    */
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
*/

/*expression dan statement
fun main() {
    val value1 = 10
    val value2 = 10

    sum(value1, value2)
}

fun sum(value1: Int, value2: Int) = value1 + value2

fun main() {
    val openOffice = 7
    val now = 8
    val office = if (now > openOffice) "Office already open" else "Office close"
    print(office)
}*/

/*when branch
fun main(){
    val isi = 54

    when (isi){
        6 -> println("ini isi 6" )
        7 -> println(" ini isi 7")
        8 -> println("ini isi 8")
        else -> println("isinya kosong tidak ada apa-apa")
    }
}
*/

/*when curly
fun main() {
    val value = 7
    val stringOfValue = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue)

    /*
        output :
            Seven
            value is 7
    */
}
*/

/*when expression memeriksa tipe dari sebuah objek
fun main(){
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a long type")
        is String -> println("the value has a String type")
        is Int -> println("the value has a Int type")
        is Double -> println("the value has a Double type")
        else -> println("undefined")
    }
}
*/

/*when expression untuk mengecek sebuah nilai dalam sebuah range atau tidak
fun main() {
    val value = 26
    val ranges = 10..50

    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
    }

    /*
    output : value is in the range
    */
}
*/

/*while
fun main(){
    var counter = 4
    while (counter <=7){
        println("Hello World!")
        counter ++
    }
}
*/

/*do while
fun main() {
    var counter = 'A'
    do {
        println(counter)
        counter ++

    } while (counter <= 'Z')
}
 */

/*range menggunakan properti step
fun main(){
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)
}
*/

/*range menggunakan in !in
fun main(){
    val tenOne = 10.downTo(1)
    if (17 !in tenOne){
        println("Value 17 available")
    }
}
*/

/*for mengggunakan range
fun main(){
    val ranges = 1..17 step 3
    for (range in ranges){
        println("value is $range!")
    }
}
*/

/*ranges memanfaatkan withindex
fun main(){
    val ranges = 1..19 step 3
    for ((index, value) in ranges.withIndex()){
        println("value $value with index $index")
    }
}
*/

/*forloop menggunakan forEach
fun main() {
    val ranges = 1.rangeTo(10) step 3
    ranges.forEach { value ->
        println("value is $value!")
    }
}

*/

/*forloop menggunakan foreachindexed
fun main() {

    val ranges = 1.rangeTo(10) step 3
    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
}
*/

/*forlop menggunakan foreach tapi intuk mengetahui indeknya saja
fun main() {
    val ranges = 1.rangeTo(10) step 3
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
}
*/

/*break&continue
fun main(){
    val listOfInt = listOf(1,2,3,null,5, null, 7)
    for (i in listOfInt){
        if (i == null)continue
        print(i)
    }
}
*/

/*break
fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }
}
*/

/*breaklabels
fun main() {
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
}

 */
