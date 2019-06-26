


//Переменные и типы данных, вещественные числа
fun main(args: Array<String>) {

    var double: Double = 12.0
    var float: Float = 3.0f

    println("Прмеры значений:")
    println("double: $double")
    println("float: $float")
    println("--------------------")

    //--------------------------------------------

    //Операции над вещественными числами
    //Арифметические операции

    println("Точность измерений: ${ 1.0f / 3.0f }")
    println("Точность измерений: ${ 1.0 / 3.0 }")
    println("Тип результата деления: ${ (float / 2.0f)::class.simpleName }")


}