// This program to Find First and Last Position of Element in Sorted Array

/**
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given
 * target value. If target is not found in the array, return [-1, -1].
 * */

fun main() {
    val lastIndex = findFirstLastPosition(insertDataInArray(),8).size-1
    printarray(findFirstLastPosition(insertDataInArray(),8),0,lastIndex)
}

fun findFirstLastPosition(nums: IntArray,target: Int): IntArray
{
    var finalIntArray = IntArray(2)
    if (binarySearch(nums,target,0,nums.size-1)!=-1)
    {
        finalIntArray[0] = findCeilingNumber(nums,target)+1
        finalIntArray[1] = findFloorNumber(nums,target)-1

   return finalIntArray
    }

    finalIntArray[0] = -1
    finalIntArray[1] = -1

    return finalIntArray
}


fun binarySearch(nums: IntArray,target: Int,startIndex:Int,endIndex:Int):Int
{
    var startIndex = startIndex
    var endIndex = endIndex
    var midIndex = 0

    while (startIndex<=endIndex)
    {
        midIndex = (startIndex + endIndex)/2
  if (nums[midIndex]==target)
      return midIndex
  else if (nums[midIndex]<target)
      startIndex = midIndex +1
else if (nums[midIndex]>target)
    endIndex = midIndex -1
    }
    return -1
}

fun binarySearchReverseOrder(nums: IntArray,target: Int,startIndex:Int,endIndex:Int):Int
{
    var startIndex = startIndex
    var endIndex = endIndex
    var midIndex = 0

    while (startIndex<=endIndex)
    {
        midIndex = (startIndex + endIndex)/2
        if (nums[midIndex]==target)
            return midIndex
        else if (nums[midIndex]<target)
            endIndex = midIndex -1
        else if (nums[midIndex]>target)
            startIndex = midIndex +1
    }
    return -1
}