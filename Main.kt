import kotlin.math.*

fun main() {
    val (m,B) = slopeIntercept(0F,3F,2F,7F)
    val (a,b) = semilogToExp(m,B)
    println(a)
    println(b)
    println(eval(a,b,2F))
}

fun slopeIntercept(x1:Float, y1:Float, x2:Float, y2:Float):Pair<Float, Float> {
    val m = (y2-y1)/(x2-x1)
    val b = y1-m*x1
    return (Pair(m, b))
}

fun semilogToExp(m:Float, b:Float):Pair<Float, Float> {
    return (Pair(10F.pow(b),10F.pow(m)))
}

fun eval(a:Float, b:Float, x:Float) = a*b.pow(x)
