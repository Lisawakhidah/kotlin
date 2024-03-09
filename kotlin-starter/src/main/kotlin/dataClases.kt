/*penggunaan data clas biasa
class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)

    println(user)
    println(dataUser)
}

 */

//penggunaan data class untuk menampilkan informasi yang jelas dari objek user
/*class User(val name : String, val age : Int){

    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)

    println(user)
    println(dataUser)
}

 */

/*dataclass untuk komparasi konten menggunakan equals()
data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("nrohmen", 17)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))
}

 */

/*class untuk komparasi konten menggunakan equals() secara manual, kenapa begitu? agar dapat hasil yang akurat
class User(val name : String, val age : Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}


fun main(){
    val user = User("nrohmen", 17)
    val user2 = User("nrohmen", 17)
    val user3 = User("dimas", 24)

    println(user.equals(user2))
    println(user.equals(user3))
}

 */

/*copy data class
fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser.copy(name = "lisailmi")

    println(dataUser4)
}

data class DataUser(val name : String, val age : Int)

 */

/*fungsi didalam class
data class DataUser(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main(){
    val dataUser = DataUser("nrohmen", 23)
    dataUser.intro()
}
*/

/*LIST
fun main(){
    val anyList = mutableListOf('a', true, "kotlin",3)

    anyList.add('d')
    anyList.add(1, "love") // menambah item pada indeks ke-1
    anyList[3] = false // mengubah nilai item pada indeks ke-3
    anyList.removeAt(0) // menghapus item pada indeks ke-0
    print(anyList)
}
*/
/* fungsi union dan intersect untuk mengetahui gabungan dan irisan 2 buah set
fun main(args: Array<String>) {
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)

    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

    // union: [1, 2, 4, 5, 7]
    // intersect: [1, 5]
}

 */

/* set untuk menyamakan value
fun main(args: Array<String>){
    val integerSetA = setOf(1,2,3,1,2,4,5)
    val integerSetB = setOf(1,2,3,5,4)
    println(integerSetA == integerSetB)
}

 */

