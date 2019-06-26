

fun main(args: Array<String>) {

    //Методы объявления массивов
    val arrayMethod1 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val arrayMethod2 = Array(8) { 0 }

    //Переменной temp будет присвоенно каждое значение из массива
    for (temp in arrayMethod1) {
        print("$temp ")
    }
    println()

    //Переменной index будет присвоенно каждое значение из набора индексов массива
    for (index in arrayMethod2.indices) {
        arrayMethod2[index] = index + 1
        print("${arrayMethod2[index]} ")
    }
    println("--------------------")

    //Строка так же рассматривается как массив
    val string = "я строка"
    for (symbol in string) {
        print("${symbol + 1}")
    }
}