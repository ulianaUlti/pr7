
fun main() {
        try {
            //14
            println("Введите а")
            val a = readLine()!!.toInt()
            println("Введите b")
            var b = readLine()!!.toInt()
            println("Введите c")
            var c = readLine()!!.toInt()
            var p = a + b + c / 2
            println(p)
            var s = p * (p - a) * (p - b) * (p - c)
            println(Math.sqrt(s.toDouble()))
            //   println(String.format("%.3f",s/2))
        } catch (e: NumberFormatException) {
            println("Неверный формат")
        }
        //1 pfl

            try {
                println("Введите первый член арифметичкеской прогрессии")
                val a1 = readLine()!!.toInt()
                println("Введите пятый член арифметичкеской прогрессии")
                var b2 = readLine()!!.toInt()
             var s=((a1+b2)*4)/2
                println("сумма")
                println(s)

            } catch (e: NumberFormatException) {
                println("Неверный формат")

            }
//7
    try {


        println("Введите x")
        val x = readLine()!!.toInt()
        println("Введите y")
        var y = readLine()!!.toDouble()
        println("Введите z")
        var z = readLine()!!.toInt()
        println("Вычисляем а")

        var aarm = Math.sqrt(y)
        var am = Math.abs(x - 1)
        var n = Math.sqrt(am.toDouble())
        var arm = Math.abs(y)
        //1дробь части
        var ch1 = n - arm
        //2часть
        var ch2 = 1 + (Math.pow(x.toDouble(), 2.0) / 2) + (Math.pow(y.toDouble(), 2.0) / 4)
        println(ch1 / ch2)
        println("Вычисляем b")
        var e = -(x + 3)
        var b = x * Math.atan(z.toDouble() - Math.pow(y, e.toDouble()))
        println(b)
    }
    catch (e: NumberFormatException){
        println("Неверный формат")}
    //2 задание
    //14
    try {
        println("Введите x")
        val x1 = readLine()!!.toInt()
        println("Введите y")
        var y1 = readLine()!!.toInt()
        println("Введите m")
        var m = readLine()!!.toInt()
        println("Введите n")
        var n3 = readLine()!!.toInt()
        if (x1-y1<m%n3){
            var n9 = x1*x1
        }
    }
    catch (e: NumberFormatException){
        println("Неверный формат")
    }
    //24
    try {
        println("Введите x")
        val xx = readLine()!!.toInt()
        println("Введите y")
        var yy = readLine()!!.toInt()
        if (xx>0||yy>0)
        {
            println("Точки находятся в первой части")
        }
        if (xx<=0||yy>0)
        {
            println("Точки находятся в второй части")
        }
        if (xx<0||yy<0)
        {
            println("Точки находятся в третей части")
        }
        if (xx>0||yy<0)
        {
            println("Точки находятся в четвертой части")
        }
    }
    catch (e: NumberFormatException){
        println("Неверный формат")
    }
    //44
    try {
        println("Введите количество пропусков у первой группы")
        val n1 = readLine()!!.toInt()
        println("Введите количество пропусков у второй группы")
        var n2 = readLine()!!.toInt()
        println("Введите количество пропусков у первой группы")
        var n3 = readLine()!!.toInt()
        val sum=n1+n2+n3
        if (sum<10) {
            println("Есть хорошая группа")
        }
if (  sum>10){
    println("Есть плохая группа")
}

    }
    catch (e: NumberFormatException){
        println("Неверный формат")}

    //4
    try {
        println("Введите a")
        var a4 = readLine()!!.toDouble()
        println("Введите b")
        var b4 = readLine()!!.toDouble()
        println("Введите c")
        var c4 = readLine()!!.toDouble()
        println((a4 * b4 * c4) + (a4/ b4/ c4) / 2)

    }
    catch (e: NumberFormatException){
        println("Неверный формат")}
}