package Sorting

class MergeSort {
    //{20,2,30,12,56,90,34,78,67,45}


    fun alignArray(passArray: IntArray):IntArray
    {

        var pivotPoint = passArray.size/2
        println("pivot point = "+pivotPoint)
        printArray(passArray)
        var endIndex = passArray.size-1
        var startIndex = 0
        var smallestNumber = passArray.get(passArray.size-1)
        var largestumber = passArray.get(0)
        var smallestIndex = 0
        var largestIndex = 0
        for (i in 0 until passArray.size)
        {
                 if (startIndex<pivotPoint && passArray.get(pivotPoint)<passArray.get(startIndex) && endIndex>pivotPoint ){
                   if (smallestNumber>passArray[startIndex]){
                       val temp = passArray.get(pivotPoint)
                       passArray[pivotPoint] = passArray.get(startIndex)
                       passArray[startIndex] = temp
                   }
                     else{
                       val temp = passArray.get(pivotPoint)
                       passArray[pivotPoint] = passArray.get(startIndex)
                       passArray[startIndex] = temp

                       val temp1 = passArray.get(pivotPoint)
                       passArray[pivotPoint] = passArray.get(largestIndex)
                       passArray[largestIndex] = temp1
                   }

                 }
            else{
                if (largestumber!=Int.MAX_VALUE)
                {
                    if (passArray.get(startIndex)>largestumber)
                    {
                        largestumber = passArray.get(startIndex)
                        largestIndex = startIndex
                    }
                }
                     else{
                    largestumber = passArray.get(startIndex)
                    largestIndex = startIndex
                }

                 }
            println()
            println("after first half")
            printArray(passArray)
            print("smallest = "+smallestNumber+" && ")
            print("largest = "+largestumber +" && ")
            print("startindex = "+startIndex +" && ")
            print("endindex = "+endIndex+" && ")
            print("smallindex = "+smallestIndex+" && ")
            print("largeindex = "+largestIndex)
            println()
            println("======================")

            if (endIndex>pivotPoint && passArray.get(pivotPoint)>passArray.get(endIndex) && startIndex<pivotPoint)
                 {
                     if (largestumber<passArray[endIndex]){
                         val temp = passArray.get(pivotPoint)
                         passArray[pivotPoint] = passArray.get(endIndex)
                         passArray[endIndex] = temp
                     }
                     else{
                         val temp = passArray.get(pivotPoint)
                         passArray[pivotPoint] = passArray.get(endIndex)
                         passArray[endIndex] = temp

                         val temp1 = passArray.get(smallestIndex)
                         passArray[smallestIndex] = passArray.get(pivotPoint)
                         passArray[pivotPoint] = temp1
                     }

                 }
            else{

                if (smallestNumber!=Int.MIN_VALUE)
                {
                      if (passArray.get(endIndex)<smallestNumber)
                      {
                          smallestNumber = passArray.get(endIndex)
                          smallestIndex = endIndex
                      }
                }
                else {
                    smallestNumber = passArray.get(endIndex)
                    smallestIndex = endIndex
                }
            }

            println()
            println("after second half")
            printArray(passArray)
            print("smallest = "+smallestNumber+" && ")
            print("largest = "+largestumber +" && ")
            print("startindex = "+startIndex +" && ")
            print("endindex = "+endIndex+" && ")
            print("smallindex = "+smallestIndex+ " && ")
            print("largeindex = "+largestIndex)
            println()
            println("======================")
            endIndex--
            startIndex++
        }
        println("final array")
        printArray(passArray)
        return passArray
    }


    fun printArray(passArray: IntArray){
        passArray.forEach {
            print(it)
            print(",")
        }

    }


}


fun main()
{
    val array = intArrayOf(20,10,9,12,56,90,34,78,17,5,53)
    MergeSort().alignArray(array)
}

