package Array// This program to Find position of element in Infinite Sorted Array
// Do not use length or size of Array


fun main()
{
    println(findElementPositionInSortedInfiniteArray(insertDataInArray(),21))
}

fun findElementPositionInSortedInfiniteArray(givenArray: IntArray, target:Int):Int
{
 var startIndex = 0
 var endIndex = 1

    while (target>=givenArray[endIndex])
    {
                   startIndex = endIndex + 1
                   endIndex   = endIndex * 2
    }
   return binarySearch(givenArray,target,startIndex,endIndex)
}