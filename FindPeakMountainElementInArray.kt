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


fun findPeakElementInRotatedArray(givenArray: IntArray):Int
{
    var startIndex = 0
    var endIndex = givenArray.size -1
    var midIndex = 0
    var peakIndex = 0

    while (startIndex<=endIndex)
    {
        midIndex = (startIndex + endIndex)/2
        if (startIndex == endIndex && givenArray[peakIndex]<givenArray[startIndex])
        {
            peakIndex = startIndex
        }
        else if (givenArray[startIndex]<givenArray[midIndex] || startIndex == midIndex)
        {
            if (givenArray[midIndex]>givenArray[peakIndex])
                peakIndex = midIndex
            else
                startIndex = midIndex + 1
        }
        else{
            if (givenArray[endIndex]>givenArray[peakIndex])
                peakIndex = endIndex
            else
                endIndex = midIndex - 1

        }
    }

    return peakIndex
}