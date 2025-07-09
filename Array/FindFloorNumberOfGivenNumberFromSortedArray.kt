package Array// This program to find floor number for given number from sorted array.

/*
* Floor Number of given number means smaller or equal number to given number and greatest from array.
*
* Need to check two conditions:-
*
* 1:- first find smaller numbers than given number if equal number not find in array.
* 2:- then from these smaller numbers find greatest number.
* */

fun main() {
    println(findFloorNumberOrGivenNumber(insertDataInArray(),26))
}

fun findFloorNumberOrGivenNumber(nums:IntArray,target: Int):Int
{
    var startingIndex = 0
    var endingIndex:Int = nums.size -1
    if (nums[nums.size-1] <target)
    {
        return -1
    }
    while (startingIndex<=endingIndex)
    {
        val midIndex = (startingIndex + endingIndex)/2
        if (nums[midIndex]==target)
        {
           return   nums[midIndex]
        }
         if (nums[midIndex]>target)
        {
            endingIndex = midIndex - 1
        }
        else {
            startingIndex = midIndex + 1
        }

    }
    return nums[endingIndex]
}


fun findFloorNumber(nums: IntArray,target: Int):Int
{
    var startingIndex = 0
    var endingIndex:Int = nums.size -1
    if (nums[nums.size-1] <target)
    {
        return -1
    }
    while (startingIndex<=endingIndex)
    {
        val midIndex = (startingIndex + endingIndex)/2
        if (nums[midIndex]==target)
        {
            startingIndex = midIndex +1
        }
      else if (nums[midIndex]>target)
        {
            endingIndex = midIndex - 1
        }
        else {
            startingIndex = midIndex + 1
        }

    }
    return nums[endingIndex]
}

