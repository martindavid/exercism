package Raindrops
fun convert(inputNumber: Int): String {
    var returnString = ""
    returnString = when {
        (inputNumber % 3 == 0) -> "${returnString}Pling"
        (inputNumber % 5 == 0) -> "${returnString}Plang"
        (inputNumber % 7 == 0) -> "${returnString}Plong"
        else -> inputNumber.toString()
    }
    return returnString
}


fun main() {
     convert(1)
}
