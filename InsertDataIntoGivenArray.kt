// This Program for insert data in array

fun insertDataInArray():IntArray
{
    val nums = IntArray(3)
    var reversecounter = 4
    for (arrayIndex in 0 ..   4)
    {

        }
    // [4,5,6,7,8,1,2,3]

    // [1,2,3]

    nums[0] = 1
    nums[1] = 2
    nums[2] = 3
/*    nums[3] = 4
    nums[4] = 2
  nums[5] = 1
    nums[6] = 2
    nums[7] = 3
    nums[8] = 1
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


   // printarray(nums,0,nums.size-1)

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