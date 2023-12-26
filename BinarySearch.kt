// This program for Binary Search.

fun main(args: Array<String>) {
    println(executeBinarySearch(insertDataInArray(),30))
}


fun executeBinarySearch(nums: IntArray,target: Int):Boolean
{
    var startingIndex = 0
    var endingIndex:Int = nums.size -1

    while (startingIndex<=endingIndex)
    {
        val midIndex = (startingIndex + endingIndex)/2
        if (nums[midIndex]==target)
        {
            return true
        }
        else if (nums[midIndex]>target)
        {
                endingIndex = midIndex -1
        }
        else {
                  startingIndex = midIndex + 1
        }
    }
    return false
}
