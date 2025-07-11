package Array// This Program is for find rotation count in Rotated Sorted Array.

fun main()
{
println(findRotationCountInRotatedSortedArray(getArrayData()))
}

fun findRotationCountInRotatedSortedArray(nums:IntArray):Int
{
return (nums.size-1)- findPeakElementInRotatedArray(nums)
}