import kotlin.math.*

fun main() {
    // Діаграми в файлі Diagram.drawio або Diagram.png

    println("Enter m:")
    val m = readln().toInt()
    println("Enter c:")
    val c = readln().toInt()
    println("Enter t:")
    val t = readln().toDouble()
    println("Enter b:")
    val b = readln().toDouble()

    val f = var2calcF(m, c, t)
    val z = var2calcZ(m, c, t, b)

    println("Result of f: $f")
    println("Result of z: $z")
}

fun var2calcF(m: Int, c: Int, t: Double) : Double {
    val result = (m * tan(t) + abs(c * sin(t))).pow(1.0 / 3.0)
    return result
}

fun var2calcZ(m: Int, c: Int, t: Double, b: Double) : Double {
    val result = m * cos(b * t * sin(t)) + c
    return result
}