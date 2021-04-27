import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    var x = input.nextInt()
    for (i in 1..x step 2 ) {
        println(i)
    }
}
