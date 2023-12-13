// This program to find ceiling number for given number from sorted array.

/* Floor Number of given number means greater or equal number to given number and smallest from array.
*
* Need to check two conditions:-
*
* 1:- first find greater numbers than given number if equal number not find in array.
* 2:- then from these greater numbers find smallest number.
* */

fun main(args: Array<String>) {
println(findCeilingNumberOrGivenNumber(insertDataInArray(),24))
}


fun findCeilingNumberOrGivenNumber(givenArray: Array<Int?>,givenNumber: Int):Int?
{
    var startingIndex:Int = 0
    var endingIndex:Int = givenArray.size -1
if (givenArray[givenArray.size-1]!! <givenNumber)
{
    return -1
}
    while (startingIndex<=endingIndex)
    {
        var midIndex = (startingIndex + endingIndex)/2
        if (givenArray[midIndex]==givenNumber)
        {
            return givenArray[midIndex]
        }
         if (givenArray[midIndex]!!>givenNumber)
        {
            endingIndex = midIndex - 1
        }
        else {
            startingIndex = midIndex + 1
        }
    }
    return givenArray[endingIndex]
}


fun findCeilingNumber(givenArray: Array<Int?>,givenNumber: Int):Int?
{
    var startingIndex:Int = 0
    var endingIndex:Int = givenArray.size -1
    if (givenArray[givenArray.size-1]!! <givenNumber)
    {
        return -1
    }
    while (startingIndex<=endingIndex)
    {
        var midIndex = (startingIndex + endingIndex)/2
        if (givenArray[midIndex]==givenNumber)
        {
            endingIndex =  midIndex -1
        }
        if (givenArray[midIndex]!!>givenNumber)
        {
            endingIndex = midIndex - 1
        }
        else {
            startingIndex = midIndex + 1
        }
    }
    return endingIndex
}





