package Array// This program to find ceiling number for given number from sorted array.

/* Floor Number of given number means greater or equal number to given number and smallest from array.
*
* Need to check two conditions:-
*
* 1:- first find greater numbers than given number if equal number not find in array.
* 2:- then from these greater numbers find smallest number.
*
* */

fun main() {
println(findCeilingNumber(insertDataInArray(),24))
}


fun findCeilingNumberOrGivenNumber(nums: IntArray,target: Int):Int
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
            return nums[midIndex]
        }
         if (nums[midIndex]>target)
        {
            endingIndex = midIndex - 1
        }
        else {
            startingIndex = midIndex + 1
        }
    }
    return nums[startingIndex]
}


fun findCeilingNumber(nums: IntArray,target: Int):Int
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
            endingIndex =  midIndex -1
        }
       else if (nums[midIndex]>target)
        {
            endingIndex = midIndex - 1
        }
        else {
            startingIndex = midIndex + 1
        }
    }
    return nums[startingIndex]
}





