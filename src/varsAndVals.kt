
const val cons = 3.14

//Переменные и типы данных, val and var
fun main(args: Array<String>) {

    //var(variable) - Изменяемая переменная
    var numberVar: Int = 12

    numberVar += 1
    numberVar++

    println(numberVar)

    //val(value) - Неизменяемая переменная
    val numberVal = numberVar + 1

    //Ошибка! Нельзя присвоить новое значение
    //numberVal++

    println(numberVal)

}