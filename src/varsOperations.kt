


//Переменные и типы данных, типы результатов операций
fun main(args: Array<String>) {

    var int: Int = 35_000_000
    var long: Long = 35_000_000_000_000_000
    var short: Short = -3_500
    var byte: Byte = -35

    var double: Double = 12.0
    var float: Float = 3.0f

    //--------------------------------------------

    //Сложение значений целых типов
    println("Тип Long + Int: ${ (long + int)::class.simpleName }")
    println("Тип Long + Short: ${ (long + short)::class.simpleName }")
    println("Тип Long + Byte: ${ (long + byte)::class.simpleName }")
    println("Тип Int + Short: ${ (int + short)::class.simpleName }")
    println("Тип Int + Byte: ${ (int + byte)::class.simpleName }")
    println("Тип Short + Byte: ${ (short + byte)::class.simpleName }")
    println("Тип Byte + Byte: ${ (byte + byte)::class.simpleName }")
    println("--------------------")

    //--------------------------------------------

    //Сложение значений вещественных типов
    println("Тип Double + Float: ${ (double + float)::class.simpleName }")
    println("Тип Float + Float: ${ (float + float)::class.simpleName }")
    println("--------------------")

    //--------------------------------------------

    //Операции между целыми и вещественными числами
    println("Тип Long + Float: ${ (long + float)::class.simpleName }")
    println("Тип Long + Double: ${ (long + double)::class.simpleName }")
    println("Тип Int / Double: ${ (int / double)::class.simpleName }")
    println("Тип Double / Long: ${ (double / float)::class.simpleName }")
    println("--------------------")

    //Операции между числами и строками
    println("Число = " + 12)

    //Операции между числами, символами и строками
    println("Символ, слкдующий за 'a'" + 'a' + 1)
}