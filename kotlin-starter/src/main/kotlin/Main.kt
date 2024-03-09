/* pemanggilan function
fun main() {

    val user = setUser("Alfian", 19)
    println(user)

    printUser("Alfian")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("your name is $name")
}

/*
    output :
    Your name is Alfian, and you 19 years old
    Your name is Alfian
*/
*/

/*if expression
fun main(args: Array<String>) {
    val openHours = 7
    val now = 20
    val office: String
    office = if (now > openHours) {
        "Office already open"
    } else {
        "Office is closed"
    }

    print(office)
}

*/

/*else if expression
fun main(args: Array<String>) {
    val openHours = 7
    val now = 45
    val office: String
    office = if (now > 7) {
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)
}
*/

/*conjuction atau and
fun main(){
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now >= officeOpen && now >=officeClosed

    print ("office is open : $isOpen")

}
*/

/*Disjunction OR
fun main(){
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now >= officeOpen || now <= officeClosed

    print("office is open $isOpen")
}
*/

/*Negation atau not
fun main() {
    val officeOpen = 7
    val now = 10
    val isOpen = now > officeOpen

    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}
*/

/*number
fun main() {
    /*val stringNumber = "23"
    val intNumber = 3

    print(intNumber + stringNumber.toInt())
     */
    val readableNumber = 1_000_000
    print(readableNumber)

    /*
     output : 1000000
     */
}
*/

/*array
fun main() {
    val intArray = intArrayOf(1, 3, 5, 7)  // [1, 3, 5, 7]
    intArray[2] = 11                       // [1, 3, 11, 7]

    print(intArray[2])

    /*
        Output: 11
    */
}
*/

/*nullable types
fun main(args: Array<String>) {
    val text: String? = null

    //val textLength = text.length // compile time error

    val textLength = if (text != null) text.length else 7
}
*/

/*string template
fun main() {
    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")

    /*
        output : Office is open
    */
}
*/