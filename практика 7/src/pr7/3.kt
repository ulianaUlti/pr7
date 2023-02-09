package pr7

class `3` {
//6,16
fun main() {
    try {
        println("Введите время")
        var t = readLine()!!.toDouble()
        println("Введите ускорение")
        var a = readLine()!!.toDouble()
        println("Введите начальное ускорение")
        var a1 = readLine()!!.toDouble()
        var s=a1+a*t
        var s1=s*t
        println("Ваше расстояние")
        println(s1)
    }
    catch (e: NumberFormatException) {
        println("Неверный формат")

    }
    //16 задание
    try{ println("Введите скорость первого автомобилиста")
        var q = readLine()!!.toDouble()
        println("Введите скорость второго автомобилиста")
        var q2 = readLine()!!.toDouble()
        println("Введите время")
        var t = readLine()!!.toDouble()
        var q3=q+q2
        var rass=q3*t
        println("Расстояние")
        println(rass)

    }
    catch (e: NumberFormatException) {
        println("Неверный формат")}











}
   }