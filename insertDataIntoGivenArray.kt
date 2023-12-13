// This Program for insert data in array

fun insertDataInArray():Array<Int?>
{
    val givenArray = arrayOfNulls<Int?>(10)
    for (arrayIndex in 0 ..   9)
    {
        if (arrayIndex==5 || arrayIndex==6 || arrayIndex ==7 || arrayIndex == 8)
        {
            givenArray[arrayIndex] = 20
        }
        else{
            givenArray[arrayIndex] = arrayIndex * 5
        }

    }

    return givenArray
}


fun printarray(givenArray: Array<Int?>,start:Int, end:Int)
{
    println()
    for (i in start .. end)
    {
        print(" ${i} = ${givenArray[i]} , ")
    }
}