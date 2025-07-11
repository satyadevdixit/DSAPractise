package Array

fun main()
{
    val firstArray  = IntArray(6)
    val secondArray = IntArray(5)

    firstArray[0] = 7
    firstArray[1] = 2
    firstArray[2] = 3
    firstArray[3] = 4
    firstArray[4] = 5
    firstArray[5] = 6

    secondArray[0] = 4
    secondArray[1] = 5
    secondArray[2] = 6
    secondArray[3] = 7
    secondArray[4] = 8
    //secondArray[5] = 9

    differenceBetweenTwoArray(firstArray,secondArray)
}


fun differenceBetweenTwoArray(givenArrayFirst: IntArray, givenArraySecond: IntArray)
{

var differenceArray = IntArray(6)
var firstArrayIndex = givenArrayFirst.size-1
var secondArrayIndex = givenArraySecond.size-1
var carry = 0

for (i in differenceArray.size -1 downTo 0)
{
var firstArrayValue  = givenArrayFirst.get(firstArrayIndex)

    if (carry==1)
        firstArrayValue = firstArrayValue-1

if (secondArrayIndex>=0) {
    var secondArrayValue = givenArraySecond.get(secondArrayIndex)
    if (firstArrayValue >= secondArrayValue) {
        carry = 0
    } else {
        carry = 1
        firstArrayValue = firstArrayValue + 10
    }
    differenceArray.set(i, firstArrayValue - secondArrayValue)
}
    else{
        differenceArray.set(i,firstArrayValue)
    }

    firstArrayIndex--
    secondArrayIndex--
}

for (i in 0 until differenceArray.size)
    print(differenceArray.get(i))
}