package Array// This Program is for find array is sorted and rotated.

fun main()
{
    println(findArrayIsRotatedAndSorted(getArrayData()))
}

fun findArrayIsRotatedAndSorted(nums:IntArray):Boolean
{
    for(index  in 1..nums.size)
    {
        val secarray = IntArray(nums.size)
        for(i in 0 until nums.size)
        {
            var newIndex = (i + index) % nums.size
            secarray[newIndex] = nums[i]
        }

        var startIndex = 0
        var endIndex = nums.size-1
        var mid = 0
        while(startIndex<=endIndex)
        {
             mid = (0+nums.size-1)/2

            if(secarray[0]==secarray[mid] && secarray[mid]==secarray[nums.size-1])
            {
                startIndex = startIndex +1
                endIndex = endIndex -1
            }
            else
                break

        }
        if(secarray[0]<secarray[mid] && secarray[mid]<secarray[nums.size-1])
        return true


    }
    return false
}