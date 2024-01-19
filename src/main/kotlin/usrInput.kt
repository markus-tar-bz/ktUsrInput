fun main() {
    usr()

}

fun usr() {


    var sum = 0.0
    var count = 0

    while (true) {
        print("Enter a number (or 'exit' to terminate): ")
        var input = readLine()?.toInt()
        var exit = readLine().toString()

        if (input != null) {
            sum += input
            count++
        } else if (input != null && exit == "exit") {
            val average = sum / count
            println("The average is: $average")
            break
        }
    }
}
