// This program for Binary Search.

fun main(args: Array<String>) {
    println(executeBinarySearch(insertDataInArray(),30))
}


fun executeBinarySearch(givenArray: Array<Int?>,givenNumber: Int):Boolean
{
    var startingIndex:Int = 0
    var endingIndex:Int = givenArray.size -1

    while (startingIndex<=endingIndex)
    {
        var midIndex = (startingIndex + endingIndex)/2
        if (givenArray[midIndex]==givenNumber)
        {
            return true
        }
        else if (givenArray[midIndex]!!>givenNumber)
        {
                endingIndex = midIndex -1
        }
        else {
                  startingIndex = midIndex + 1
        }
    }
    return false
}
