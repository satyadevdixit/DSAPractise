package Recursion

class Recursion {
}


fun main() {
//Recursion.printFibonacciSeriesUsingRecursion(0,0,1)

    println(printFibonacciSeriesUsingRecursion1(10))
}


// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
fun printFibonacciSeriesUsingRecursion(position:Int,firstValue:Int,secondValue: Int)
{
    println(firstValue)
    if (position==10)
        return

    printFibonacciSeriesUsingRecursion(position+1,secondValue,firstValue+secondValue)
}

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
fun printFibonacciSeriesUsingRecursion1(position:Int):Int
{
    if (position<2)
        return position

  return  printFibonacciSeriesUsingRecursion1(position-1) + printFibonacciSeriesUsingRecursion1(position-2)
}