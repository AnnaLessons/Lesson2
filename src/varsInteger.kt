
//Переменные и типы данных, целые числа
fun main(args: Array<String>) {

    //Объявление переменных

    var integerNumber: Int = 35_000_000
    var longNumber: Long = 35_000_000_000_000_000
    var shortNumber: Short = -3_500
    var byte: Byte = -35

    //--------------------------------------------

    println("Прмеры значений:")
    println(integerNumber)
    println(longNumber)
    println(shortNumber)
    println(byte)
    println("--------------------")

    //--------------------------------------------

    //Будут ли ошибки в этом коде?
    //byte = shortNumber
    //shortNumber = byte.toShort()
    //println("byte = $byte")
    //println("shortNumber = $shortNumber")
    //println("--------------------")

    //--------------------------------------------

    println("Минимальное значение типа можно узнать так: ${Int.MIN_VALUE}")
    println("Максимальное значение типа можно узнать так: ${Int.MAX_VALUE}")
    println("--------------------")

    //--------------------------------------------

    println("Достижение границы типа:")
    //блок кода будет работать пока выполняется условие снизу
    while (byte != Byte.MIN_VALUE) {

        byte++ //прибавляет к byte единицу
        println(byte)
    }
    println("--------------------")

    //--------------------------------------------

    //Операции над целыми числами
    //Арифметические операции

    println("Сложение: ${byte + 2}")
    println("Умножение: ${byte * 2}")
    println("Вычитание: ${byte - 2}")
    println("Остаток от деления: ${byte % 2}")
    println("Целочисленное деление: ${byte / 2}")
    println("Тип результата целочисленного деления: ${ (byte / 2)::class.simpleName }")

    //--------------------------------------------

    //Операции сравнения
    println("Больше нуля? : ${ byte > 0 }")
    println("Равно нулю? : ${ byte == 0.toByte() }")
    println("Не равно нулю? : ${ byte != 0.toByte() }")

}