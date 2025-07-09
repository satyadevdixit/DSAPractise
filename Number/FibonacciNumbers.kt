fun main()
{
printFibonacciNumbers(10)
}



/* Print Fibonacci Number till any Particular Number */

fun printFibonacciNumbers(limit: Int)
{
var firstNumber = 0
var secondNumber = 1
var thirdNumber: Int

    var counter = 0

    while (counter<limit)
    {
        print("$firstNumber,")
        thirdNumber = firstNumber + secondNumber
        firstNumber = secondNumber
        secondNumber = thirdNumber

        counter++
    }

}



