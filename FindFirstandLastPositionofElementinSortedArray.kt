// This program to Find First and Last Position of Element in Sorted Array

/**
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given
 * target value. If target is not found in the array, return [-1, -1].
 * */

fun main(args: Array<String>) {
    var lastIndex = findFirstLastPosition(insertDataInArray(),20).size-1
    printarray(findFirstLastPosition(insertDataInArray(),20),0,lastIndex)
}

fun findFirstLastPosition(givenArray: Array<Int?>,givenNumber: Int): Array<Int?>
{
    if (binarySearch(givenArray,givenNumber)!=-1)
    {
   return arrayOf(findCeilingNumber(givenArray,givenNumber)!!+1, findFloorNumber(givenArray,givenNumber)!!-1)
    }
    return arrayOf(-1,-1)
}


fun binarySearch(givenArray: Array<Int?>,givenNumber: Int):Int
{
    var startIndex = 0
    var endIndex = givenArray.size -1
    var midIndex = 0

    while (startIndex<=endIndex)
    {
        midIndex = (startIndex + endIndex)/2
  if (givenArray[midIndex]==givenNumber)
      return midIndex
  else if (givenArray[midIndex]!!<givenNumber)
      startIndex = midIndex +1
else if (givenArray[midIndex]!!>givenNumber)
    endIndex = midIndex -1
    }
    return -1
}