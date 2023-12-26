// This Program is for find Mountain peak element in Array.

fun main(){
println(findMountainPeakElementInArray(insertDataInArray()))
}


fun findMountainPeakElementInArray(givenArray: IntArray):Int
{
    var startIndex = 0
    var endIndex = givenArray.size -1
    var midIndex = 0

    while (startIndex<=endIndex)
    {
        midIndex = (startIndex+endIndex)/2
        if ((midIndex == 0 || givenArray[midIndex-1]<givenArray[midIndex]) && (midIndex == givenArray.size-1 || givenArray[midIndex]>givenArray[midIndex+1]))
        {
           return midIndex
        }
        else if (givenArray[midIndex]<givenArray[midIndex+1]){
           startIndex = midIndex +1
        }
        else if (givenArray[midIndex]>givenArray[midIndex+1]){
                   endIndex = midIndex - 1
        }
    }

    return -1
}