// This Program for insert data in array

fun insertDataInArray():IntArray
{
    val nums = IntArray(3)
    var reversecounter = 4
    for (arrayIndex in 0 ..   4)
    {
      /*  if (arrayIndex<=5)
            nums[arrayIndex] = arrayIndex * 5
        else {
            nums[arrayIndex] = reversecounter * 5
            reversecounter--
        }*/

        //[3,5,3,2,0]

        // [4,5,6,7,0,1,2]
/*nums[0] = 3
nums[1] = 5
nums[2] = 3
nums[3] = 2
nums[4] = 0*/
        }

    nums[0] = 1
    nums[1] = 3
    nums[2] = 5
   /* nums[3] = 7
    nums[4] = 0
    nums[5] = 1
    nums[6] = 2*/

    printarray(nums,0,nums.size-1)

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