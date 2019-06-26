import kotlin.math.absoluteValue


//Переменные и типы данных, nullable типы
fun main(args: Array<String>) {


    var notNullableVar = 12

    //Ошибка! переменная не допускает тип null
    //notNullVar = null

    var nullableVar: Int? = 12
    nullableVar = null

    //--------------------------------------------

    //Дополнительные операторы, связанные с null
    println(nullableVar ?: 13)

    println(nullableVar!!)

}