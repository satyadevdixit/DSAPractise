// This Program is for found element in Mountain Array.

class MountainArray {
         fun get(index: Int): Int {
            return this.get(index)
         }
         fun length(): Int {
             return this.length()
         }
     }

fun main()
{
    println(findInMountainArray(0,insertDataInArray(),))
}


fun findInMountainArray(target: Int, givenArray: IntArray): Int
{
   val peakIndex =  findMountainPeakElementInArray(givenArray)

    if (givenArray[peakIndex]<target)
    {
        return -1
    }
    else if (givenArray[peakIndex]==target)
        return peakIndex
    else {
        val findIndex = binarySearch(givenArray,target,0,peakIndex-1)
        if (findIndex!=-1)
        {
            return findIndex
        }
        else
            return binarySearch(givenArray,target,peakIndex+1,givenArray.size-1)
       //     return binarySearchReverseOrder(givenArray,target,peakIndex+1,givenArray.size-1)
    }

    return -1
}