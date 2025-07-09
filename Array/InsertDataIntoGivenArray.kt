package Array// This Program for insert data in array

fun insertDataInArray():IntArray
{
    val nums = IntArray(8)
    var reversecounter = 4
    for (arrayIndex in 0 ..   4)
    {

        }
    // [4,5,6,7,8,1,2,3]

    // [1,2,3]

    nums[0] = 1
    nums[1] = 22
    nums[2] = 30
    nums[3] = 44
    nums[4] = 58
    nums[5] = 61
    nums[6] = 79
    nums[7] = 90
   /* nums[8] = 1
    nums[9] = 1
    nums[10] = 1
    nums[11] = 1
    nums[12] = 1
    nums[13] = 2
    nums[14] = 1
    nums[15] = 1
    nums[16] = 1
    nums[17] = 1
    nums[18] = 1*/


   // Array.printarray(nums,0,nums.size-1)

    return nums
}


fun printarray(nums: IntArray,start:Int, end:Int)
{
    println()
    for (i in start .. end)
    {
        print(" ${i} = ${nums[i]} , ")
    }
}