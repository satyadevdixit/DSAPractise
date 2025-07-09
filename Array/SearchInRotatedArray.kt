package Array// This Program is for search element in rotated array.

fun main()
{
println(searchInRotatedArray(insertDataInArray(),1))
}


fun searchInRotatedArray(nums: IntArray,target:Int):Int
{
    var startIndex = 0
    var endIndex = nums.size-1
    var midIndex = 0

    if (nums.size==1)
    {
        if (nums[0]==target)
        {
            return 0
        }
        else
            return -1
    }
    else {
        val peakIndex = findPeakElementInRotatedArray(nums)

        if (target >= nums[startIndex] && target <= nums[peakIndex])
            return binarySearch(nums, target, startIndex, peakIndex)
        else
            return binarySearch(nums, target, peakIndex + 1, endIndex)
    }
}