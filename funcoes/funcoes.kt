//funcao que recebe por parametro uma string e não retorna nada com o argumento (Unit)
fun printMensage(message: String): Unit {
    println(message)
}

fun printMensageWithPrefix(message: String, prefix: String = "Info"){
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main(){
    printMensage("Ola Mundo!!!")
    printMensageWithPrefix("Mundo", "Ola")
    printMensageWithPrefix("Mundo")
    printMensageWithPrefix(prefix = "Ola",message = "Mundo")
    println(sum(1, 2))
    println(multiply(7, 5))
}