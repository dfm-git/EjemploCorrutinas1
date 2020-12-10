import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    println("Empezamos aquí")

    for (i in 0..10) {
        GlobalScope.launch {
            println("Soy la corrutina $i y estoy ejecutándome en 2º plano")
            delay(2000)
            println("Soy la corrutina $i y he acabado mi trabajo")
        }
    }

    println("Esperamos un rato")
    Thread.sleep(10000)
    println("Terminamos aquí")
}